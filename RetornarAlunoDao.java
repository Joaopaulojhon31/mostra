package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conecxao.Conexao;
import model.Aluno;
import model.Grupo;
import model.Sexo;
import model.Turma;

public class RetornarAlunoDao {


		Connection con = null;
		public RetornarAlunoDao(){
			this.con = Conexao.obterConexao();
		}
		
		Grupo grupo = new Grupo();
		
		private String retornar = "update  `bd01_aluno` set status = 1  where matricula_aluno  = ? ;";	
		
		
	
	public void alterar(Aluno aluno) throws SQLException{
		
		PreparedStatement pstm = con.prepareStatement(retornar);
		pstm.setInt(1, aluno.getMatricula());
		pstm.execute();
		
	}
	

	
	public List<Aluno> getLista(){
		   
		   List<Aluno> listaAluno = new ArrayList<Aluno>();
		   
		   
		   StringBuilder sql = new  StringBuilder();
		   
		   
		  sql.append("Select  * from bd01_aluno where status = 0;");
		  
		  
		try {
			Statement stmt = (Statement) con.createStatement();
			
		
			ResultSet rs = stmt.executeQuery(sql.toString());
	
			
			while(rs.next()){
				Aluno aluno = new Aluno();
				Sexo sexo = new Sexo();
				Turma turma = new Turma();
				aluno.setMatricula(rs.getInt("matricula_aluno"));
				aluno.setNome(rs.getString("nome_aluno"));
				aluno.setEmail(rs.getString("email_aluno"));
				sexo.setCodigo(rs.getInt("sexo_aluno"));
				aluno.setSexoAluno(sexo);
				turma.setCod(rs.getInt("cod_turma"));
				aluno.setCodTurma(turma);
				aluno.setDataAltCadas(rs.getDate("data_alt_cadas_aluno"));
				listaAluno.add(aluno);
				
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return listaAluno;
	}
	

	
}
