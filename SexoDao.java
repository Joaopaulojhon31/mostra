package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conecxao.Conexao;
import model.Sexo;



public class SexoDao {
	
	//CONSTRUTOR
	public SexoDao() { Conexao.obterConexao(); }
	
	//CONEXAO
	Connection con = (Connection) Conexao.obterConexao();
	
	//INSTANCIAS
	Sexo sexo_aluno = new Sexo();
	
	//SQL
	String select = "select * from bd01_sexo_aluno";
	String insert = "insert into bd01_sexo_aluno(Descr_Sexo,Data_Alt_Sexo_Aluno) values(?,?);";
	String delete = "delete from bd01_sexo_aluno where Cod_Sexo_Aluno = ?";
	String update = "update bd01_sexo_aluno set descr_sexo = ?, Data_Alt_Sexo_Aluno = ? where Cod_Sexo_Aluno = ?";
			
	//METODOS
			//INCLUD 
			public void includ(Sexo sexo_aluno) throws SQLException
			{
				PreparedStatement psmt = (PreparedStatement) con.prepareStatement(insert);
				psmt.setString	(1, sexo_aluno.getDescricao());
				sexo_aluno.setData_alteracao_cadastro(java.sql.Date.valueOf(java.time.LocalDate.now()));//INSERINDO DATA NO OBJETO
				psmt.setDate 	(2, (Date) sexo_aluno.getData_alteracao_cadastro());
				psmt.execute();
				System.out.println("**Adicionado com sucesso**");
			}
			
			//UPDATE
			public void update(Sexo sexo_aluno) throws SQLException
			{
				PreparedStatement psmt = (PreparedStatement) con.prepareStatement(update);
				psmt.setInt		(2, sexo_aluno.getCodigo());
				psmt.setString	(1, sexo_aluno.getDescricao());
				sexo_aluno.setData_alteracao_cadastro(java.sql.Date.valueOf(java.time.LocalDate.now()));//INSERINDO DATA NO OBJETO
				psmt.setDate 	(2, (Date) sexo_aluno.getData_alteracao_cadastro());
				psmt.execute();
				System.out.println("*Alterado*");
			}
			
			//SELECT ALL 
			public List<Sexo> getLista() throws SQLException
			{
				List<Sexo> listAllSex= new ArrayList<Sexo>();
				//INSTANCIANDO SQL PARA RECEVER COMANDO
				StringBuilder sql = new StringBuilder();
				sql.append(select);	//EXECUTANDO SQL	
			
					try 
					{
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(sql.toString());
						
							//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
							while(rs.next())
							{Sexo sa = new Sexo();
							 	sa.setCodigo( rs.getInt("Cod_Sexo_Aluno"));
							 	sa.setDescricao(rs.getString("Descr_Sexo"));
							 	sa.setData_alteracao_cadastro(rs.getDate("Data_Alt_Sexo_Aluno"));
								listAllSex.add(sa);
							}
					}//TRATAMENTO DE ERRO 
				catch (Exception e) {e.printStackTrace();}
			return listAllSex;
			}
			
			//METODO PARA PESQUISA
			public Sexo searchSex(int i)
			{Sexo sexo_aluno = null;
			
				//INSTANCIANDO SQL PARA RECEVER COMANDO
				StringBuilder sql = new StringBuilder();
				sql.append("select * from bd01_sexo_aluno where Cod_Sexo_Aluno ="+i+";");	//EXECUTANDO SQL	
					try{				 
					Statement stmt = con.createStatement();
					ResultSet rs 	= stmt.executeQuery(sql.toString());
						while(rs.next())
						{
						Sexo sa = new Sexo();
						 	sa.setCodigo(rs.getInt("Cod_Sexo_Aluno"));
						 	sa.setDescricao(rs.getString("Descr_Sexo"));
						 	sa.setData_alteracao_cadastro(rs.getDate("Data_Alt_Sexo_Aluno"));
						sexo_aluno = sa;
						}
					 }catch (SQLException e) {e.printStackTrace();}
				return sexo_aluno;
				}
			
			//METHOD TO DELECT ONE FACTORY NÃO EXISTE DELETE FISICO
/*			public void delete(SexoAluno sexo_aluno) throws SQLException
			{
				//ABRIR CONEXAO SQL
				PreparedStatement psmt = (PreparedStatement) con.prepareStatement(delete);
				psmt.setInt(1, sexo_aluno.getCodigo());
				psmt.execute();
				System.out.println("**Exluido**");
			}
*/
			
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
			
			//VERIFICANDO ENTRADAS NÃO NUMERICAS
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


}	//END CLASS
