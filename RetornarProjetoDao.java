package dao;


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

public class RetornarProjetoDao {

	public RetornarProjetoDao(){ Conexao.obterConexao(); }
	
	//CONEXAO
	Connection con = (Connection) Conexao.obterConexao();
	
	//INSTANCIAS
	Projeto projeto = new Projeto();
	Curso curso = new Curso();
	
	//SQL

	private String alterar = "update bd01_projeto_mostra set status = 1 where `Cod_Proj_Mostra`= ?;"; //DELEÇÃO LOGICA
	

	
	public List<Projeto> getLista(){
		
		List<Projeto> lista = new ArrayList<Projeto>();
		StringBuilder sql = new StringBuilder();
		sql.append("select * from bd01_projeto_mostra where status=0;");
		
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
	
	

		
		//DELETE
		public void alterar(Projeto projeto) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(alterar);
			pstm.setInt(1, projeto.getCod());
			pstm.execute();
		}//end excluir
	
	
}
