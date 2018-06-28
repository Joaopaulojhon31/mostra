package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import conecxao.Conexao;
import model.Curso;
import model.Projeto;

public class ProjetoDao {

	//CONSTRUTOR
	public ProjetoDao(){ Conexao.obterConexao(); }
	
	//CONEXAO
	Connection con = (Connection) Conexao.obterConexao();
	
	//INSTANCIAS
	Projeto projeto = new Projeto();
	Curso curso = new Curso();
	
	//SQL
	private String inserir = "insert into bd01_projeto_mostra(Bd01_Curso_cod_curso,Nome_Proj_Mostra,Descr_Proj_Mostra,"
			+ "Coord_Proj_Mostra,Ano_Proj_Mostra,Semestre_Proj_Mostra,Data_Alt_Cadas_Proj_mostra,status) values(?,?,?,?,?,?,?,1);";
	private String deletar = "update bd01_projeto_mostra set status = 0 where `Cod_Proj_Mostra`= ?;"; //DELEÇÃO LOGICA
	private String alterar = "update bd01_projeto_mostra set Nome_Proj_Mostra = ?, Descr_Proj_Mostra =?, Coord_Proj_Mostra =?, Ano_Proj_Mostra = ?, Semestre_Proj_Mostra =?, Data_Alt_Cadas_Proj_mostra=? where Cod_Proj_Mostra= ? and status = 1;";
	private String selecAll= "select * from bd01_projeto_mostra;";
	private String selecOne= "select * from bd01_projeto_mostra where Cod_Proj_Mostra = ? and status = 1;";
	

	//INCLUD 
	public void includ(Projeto projeto) throws SQLException
	{
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(inserir);
		
		psmt.setInt		(1, projeto.getCurso().getCod());
		psmt.setString	(2, projeto.getNome());
		psmt.setString	(3, projeto.getDescricao());
		psmt.setString	(4, projeto.getCoordenador());
		psmt.setInt	(5,  projeto.getAno());
		psmt.setString	(6, projeto.getSemestre());
		projeto.setData_alteracao(java.sql.Date.valueOf(java.time.LocalDate.now()));
		psmt.setDate	(7, (Date) projeto.getData_alteracao());
	
		psmt.execute();
		System.out.println("**Data Adicionada com sucesso**");
	}//end includ
	
	//SELECT ALL
	public List<Projeto> getLista(){
		
		List<Projeto> lista = new ArrayList<Projeto>();
		StringBuilder sql = new StringBuilder();
		sql.append("select * from bd01_projeto_mostra where status=1;");
		
		try 
		{
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());
			while(rs.next()) 
			{
			projeto = new Projeto();
			curso = new Curso();
				projeto.setCod(rs.getInt("Cod_Proj_Mostra"));
				
				curso.setCod(rs.getInt("Bd01_Curso_cod_curso"));
				projeto.setCurso(curso);
				
				projeto.setNome(rs.getString("Nome_Proj_Mostra"));
				projeto.setDescricao(rs.getString("Descr_Proj_Mostra"));
				projeto.setCoordenador(rs.getString("Coord_Proj_Mostra"));
				projeto.setAno(rs.getInt("Ano_Proj_Mostra"));
				projeto.setSemestre(rs.getString("Semestre_Proj_Mostra"));
				projeto.setData_alteracao(rs.getDate("Data_Alt_Cadas_Proj_mostra"));
				//projeto.setSemestre(rs.getString("Semestre_Proj_Mostra"));
				//projeto.setData_alteracao(rs.getDate("Data_Alt_Cadas_Proj_mostra"));
				//projeto.setStatus(rs.getInt("status"));	
			lista.add(projeto);
			}
			
		} catch (Exception e) {System.out.println(e);}
	return lista;
	}//END SELECT
	
	//SELECT ONE
	public Projeto searchProjeto(Projeto projeto)
	{
	
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append("select * from bd01_projeto_mostra where Ano_Proj_Mostra between "+projeto.getData1()+" and "+projeto.getData2()+" and status = 1;");//EXECUTANDO SQL	

			try{				 
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs 	= stmt.executeQuery(sql.toString());
				while(rs.next())
				{
				Projeto p 	= new Projeto();
				Curso c		= new Curso();
				 	p.setCod(rs.getInt("Cod_Proj_Mostra"));
				 	p.setNome(rs.getString("Nome_Proj_Mostra"));
				 	c.setCod(rs.getInt("Bd01_Curso_cod_curso"));
				 	p.setCurso(curso);
				 	p.setDescricao(rs.getString("Descr_Proj_Mostra"));
				 	p.setCoordenador(rs.getString("Coord_Proj_Mostra"));
				 	p.setAno(rs.getDate("Ano_Proj_Mostra"));
				 	p.setSemestre(rs.getString("Semestre_Proj_Mostra"));
				 	p.setData_alteracao(rs.getDate("Data_Alt_Cadas_Proj_mostra"));
				projeto = p;
				}
			 }catch (SQLException e) {e.printStackTrace();}
		return projeto;
		}//END SELECT ONE
	
		//UPDATE
		public void alterar(Projeto Projeto) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(alterar);
				pstm.setString(1, projeto.getNome());
				pstm.setString(2, projeto.getDescricao());
				pstm.setString(3, projeto.getCoordenador());
				
				pstm.setInt(4, projeto.getAno());
				pstm.setString(5, projeto.getSemestre());
				projeto.setData_alteracao(java.sql.Date.valueOf(java.time.LocalDate.now()));
				pstm.setDate(6, (Date) projeto.getData_alteracao());
				pstm.setInt(7, projeto.getCod());
			System.out.println("Sucesso");
			pstm.execute();
		}//end update
		
		//DELETE
		public void deletar(Projeto projeto) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(deletar);
			pstm.setInt(1, projeto.getCod());
			pstm.execute();
		}//end excluir
	
	
	
		
		
}//END CLASS
