package dao;

import java.sql.Date;
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

public class DiretoriaDao {

	//CONSTRUTOR
	public DiretoriaDao() { Conexao.obterConexao(); }
	
	//CONEXAO
	Connection con = (Connection) Conexao.obterConexao();
	
	//INSTANCIAS
	Diretor diretoria = new Diretor();
	
	//SQL
	String select = "select * from bd01_diretoria_utramig where status =1;";
	
	String insert = "INSERT INTO `bd01_diretoria_utramig` (`masp_diretor`, `nome_diretor`, `telefone_diretor`, "
			+ "`Depto_diretor`, `Email_diretor`, `Data_alt_cadas_direttor`, `cnpj_utramamig`, `status`)  values(?,?,?,?,?,?,?,?);";
	
	String delete = "update bd01_diretoria_utramig set status=0 where masp_diretor = ?";
	
	String update = "UPDATE bd01_diretoria_utramig SET nome_diretor=?,telefone_diretor=?,Depto_diretor=?,Data_alt_cadas_direttor =? WHERE masp_diretor=?;";
	
	

	
	//METODOS
			//INCLUD 
			public void includ(Diretor diretoria) throws SQLException
			{
				PreparedStatement psmt = (PreparedStatement) con.prepareStatement(insert);
				psmt.setInt 	(1, diretoria.getMasp_diretor());
				psmt.setString	(2, diretoria.getNome_diretor());
				psmt.setInt		(3, diretoria.getTelefone_diretor());
				psmt.setString	(4, diretoria.getDepto_diretor());
				psmt.setString  (5, diretoria.getEmail_diretor());
				psmt.setDate(6, (Date) diretoria.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));
				psmt.setLong(7, diretoria.getCnpj().getCnpj());
				psmt.setInt(8, diretoria.setStatus(1));
				psmt.execute();
				System.out.println("**Data Adicionada com sucesso**");
			}
			
			//UPDATE
			
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
			
			//METODO PARA PESQUISA
			public Diretor searchDiretoria(int i)
			{Diretor diretoria = null;
			
				//INSTANCIANDO SQL PARA RECEVER COMANDO
				StringBuilder sql = new StringBuilder();
				sql.append("select * from bd01_diretoria_utramig where masp_diretor ="+i+";");	//EXECUTANDO SQL	
					try{				 
					Statement stmt = con.createStatement();
					ResultSet rs 	= stmt.executeQuery(sql.toString());
						while(rs.next())
						{
						Diretor d = new Diretor();
							d.setMasp_diretor(rs.getInt("masp_diretor"));
						 	d.setNome_diretor(rs.getString("nome_diretor"));
						 	d.setTelefone_diretor(rs.getInt("telefone_diretor"));
						 	d.setDepto_diretor(rs.getString("Depto_diretor"));
						 	d.setEmail_diretor(rs.getString("Email_diretor"));
						 	d.setDataAltCadas(rs.getDate("Data_alt_cadas_direttor"));
						diretoria = d;
						}
					 }catch (SQLException e) {e.printStackTrace();}
				return diretoria;
				}
			
			//METHOD TO DELECT ONE 
			public void delete(Diretor diretoria) throws SQLException
			{
				//ABRIR CONEXAO SQL
				PreparedStatement psmt = (PreparedStatement) con.prepareStatement(delete);
				psmt.setInt(1, diretoria.getMasp_diretor());
				psmt.execute();
				System.out.println("**Exluido**");
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

			
			public void updateDiretor(Diretor diretoria) throws SQLException {
				
				PreparedStatement pstm = con.prepareStatement(update);
				pstm.setString(1, diretoria.getNome_diretor());
				pstm.setInt(2, diretoria.getTelefone_diretor());
				pstm.setString(3, diretoria.getDepto_diretor());
				pstm.setDate(4, (Date) diretoria.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));
				pstm.setInt(5, diretoria.getMasp_diretor());
				
				pstm.execute();
				
				
			}

			

}	//END CLASS
