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
import model.Usuario;
import model.Utramig;

public class AlunoDao {

		Connection con = null;
		public AlunoDao(){
			this.con = Conexao.obterConexao();
		}
		
		Grupo grupo = new Grupo();
		
		private String inserir = "INSERT INTO bd01_aluno (matricula_aluno,nome_aluno,email_aluno,sexo_aluno,data_alt_cadas_aluno,status,cod_turma)  values (?,?,?,?,?,1,?)";
		private String deletar = "update  `bd01_aluno` set status = 0  where matricula_aluno  = ? ;";	
		private String alterar = "update `bd01_aluno` set nome_aluno = ?,data_alt_cadas_aluno=?,email_aluno=?,sexo_aluno=?,cod_turma=? where matricula_aluno = ? ;";
		
		private String ValidarAluno="SELECT * FROM bd01_aluno;";
		
		//INSERIR 
	public void incluir(Aluno aluno) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(inserir);
			pstm.setInt		(1, aluno.getMatricula());
			pstm.setString	(2, aluno. getNome());
			pstm.setString	(3, aluno.getEmail());
			pstm.setInt		(4, aluno.getSexoAluno().getCodigo());
				aluno.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now()));
			pstm.setDate	(5, aluno.getDataAltCadas());
			pstm.setInt(6, aluno.getCodTurma().getCod());
				aluno.setStatus((char) 1);
		
			pstm.execute();
			//con.close();
		}
	
	public void deletar(Aluno aluno) throws SQLException{
		
		PreparedStatement pstm = con.prepareStatement(deletar);
		pstm.setInt(1, aluno.getMatricula());
		pstm.execute();
		//con.close();
	}
	
	public void alterar(Aluno aluno) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(alterar);
		pstm.setString(1, aluno.getNome());
		aluno.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now()));
		pstm.setDate(2, aluno.getDataAltCadas());
		pstm.setString(3, aluno.getEmail());
		pstm.setInt(4, aluno.getSexoAluno().getCodigo());
		pstm.setInt(5, aluno.getCodTurma().getCod());
		pstm.setInt(6, aluno.getMatricula());
		pstm.execute();
		//con.close();
	}
	
	//instanciando uma lista
	public List<Aluno> getLista(){
		   
		   List<Aluno> listaAluno = new ArrayList<Aluno>();
		   
		   //instanciando um tipo de String Builder
		   StringBuilder sql = new  StringBuilder();
		   
		   //add comando para a  variavel sql
		  sql.append("Select  * from bd01_aluno where status = 1;");
		  
		  
		try {
			Statement stmt = (Statement) con.createStatement();
			
			//Conjunto de resultados apos a execusao do query
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
	}//end class selecionartodosalunos
	
	
	// METODO PARA PESQUISA
	public Aluno searchAluno(int i) {
		Aluno aluno = null;

		// INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append("select * from bd01_aluno where matricula_aluno =" + i + " and status = 1;"); // EXECUTANDO SQL
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());
			while (rs.next()) {
				Aluno a = new Aluno();
				Sexo sexo = new Sexo();
				Turma turma = new Turma();
					a.setMatricula(rs.getInt("matricula_aluno"));
					a.setNome(rs.getString("nome_aluno"));
					a.setEmail(rs.getString("email_aluno"));
					sexo.setCodigo(rs.getInt("sexo_aluno"));
					a.setSexoAluno(sexo);
					a.setStatus((char) rs.getInt("status"));
					a.setDataAltCadas(rs.getDate("data_alt_cadas_aluno"));
				aluno = a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}//END SEARCH
	
	public List<Aluno> ConfirmarAluno()
	{
		List<Aluno> UpdateAluno= new ArrayList<Aluno>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(ValidarAluno);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
		Aluno al = new Aluno();
				al.setCodAluno(rs.getInt("matricula_aluno"));
				UpdateAluno.add(al);

			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return UpdateAluno;
}

}