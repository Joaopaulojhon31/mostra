package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import conecxao.Conexao;
import model.Diretor;
import model.Utramig;

public class RetornarDiretoriaDao {


		//CONSTRUTOR
		public RetornarDiretoriaDao() { Conexao.obterConexao(); }
		
		//CONEXAO
		Connection con = (Connection) Conexao.obterConexao();
		
		//INSTANCIAS
		Diretor diretoria = new Diretor();
		
		//SQL
		String select = "select * from bd01_diretoria_utramig where status =0;";
		
		String delete = "update bd01_diretoria_utramig set status=1 where masp_diretor = ?";
	

		
		
				//SELECT ALL 
				public List<Diretor> getLista() throws SQLException
				{
					List<Diretor> listAllDiretoria= new ArrayList<Diretor>();
					//INSTANCIANDO SQL PARA RECEVER COMANDO
					StringBuilder sql = new StringBuilder();
					sql.append(select);	//EXECUTANDO SQL	
				
						try 
						{
							Statement stmt = con.createStatement();
							ResultSet rs = stmt.executeQuery(sql.toString());
							
								//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
								while(rs.next())
								{Diretor d = new Diretor();
								 	d.setMasp_diretor(rs.getInt("masp_diretor"));
								 	d.setNome_diretor(rs.getString("nome_diretor"));
								 	d.setTelefone_diretor(rs.getInt("telefone_diretor"));
								 	d.setDepto_diretor(rs.getString("Depto_diretor"));
								 	d.setEmail_diretor(rs.getString("Email_diretor"));
								 	Utramig utra = new Utramig();
								 	utra.setCnpj(rs.getLong("cnpj_utramamig"));
								 	d.setCnpj(utra);
								 	d.setDataAltCadas(rs.getDate("Data_alt_cadas_direttor"));
								listAllDiretoria.add(d);
								}
						}//TRATAMENTO DE ERRO 
					catch (Exception e) {e.printStackTrace();}
				return listAllDiretoria;
				}
				
			
				
				//METHOD TO DELECT ONE 
				public void delete(Diretor diretoria) throws SQLException
				{
					//ABRIR CONEXAO SQL
					PreparedStatement psmt = (PreparedStatement) con.prepareStatement(delete);
					psmt.setInt(1, diretoria.getMasp_diretor());
					psmt.execute();
				
				}
				
				//VERIFICANDO ENTRADAS NÃO NUMERICAS
				public String entradaString(String entrada) 
				{
					if( entrada.matches("[^0-9][^W]") || !entrada.matches("")) 
						{ return entrada; }
					else
					{ 
						System.out.println("Erro de caracter");
						return null;
					}
				}
				
				//VERIFICANDO ENTRADAS NUMERICAS
				public int entradaNumeric(String entrada) 
				{
					if( entrada.matches("[0-9][^W]") || !entrada.matches("")) 
						{ return Integer.parseInt(entrada); }
					else
					{ 
						System.out.println("Erro de caracter");
						return 0;
					}
				}
	}

	

