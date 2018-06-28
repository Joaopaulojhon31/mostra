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
import model.Curso;
import model.Turma;


public class TurmaDao {
	public TurmaDao() {
		con = Conexao.obterConexao();
	}
	Connection con = null;
	
	private String inserir="INSERT INTO bd01_turma ( Bd01_Curso_cod_curso, etapa_turma, turno_turma, nome_turma, "
			+ "sala_turma,data_alt_cadas,status) VALUES (?,?,?,?,?,?,?);";

	private String listarTurma="select nome_curso,cod_curso from bd01_curso;";
	
	
	private String listar ="Select * from bd01_turma where status=1;";
	private String deletar="update  bd01_turma set status=0 where cod_turma=?;";
	private String updateTurma="UPDATE bd01_turma SET Bd01_Curso_cod_curso=?, "
			+ "etapa_turma=?, turno_turma=?, nome_turma=?, sala_turma=?"
			+ " WHERE cod_turma=?;";
		

	
	
	
	public void incluir(Turma turma) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(inserir);
		
		pstm.setInt(1, turma.getCodCurso().getCod());
		pstm.setString(2,turma.getEtapaTurma());
		pstm.setString(3, turma.getTurnoTurma());
		pstm.setString(4,turma.getNomeTurma());
		
		pstm.setString(5, turma.getSalaTurma());
		pstm.setDate(6,turma.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));

		pstm.setInt(7, turma.setStatus(1));
		pstm.execute();

}
	
	public void alterarTurma(Turma turma) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(updateTurma);
		pstm.setInt(1, turma.getCodCurso().getCod());
		pstm.setString(2, turma.getEtapaTurma());
		pstm.setString(3, turma.getTurnoTurma());
		pstm.setString(4, turma.getNomeTurma());
		pstm.setString(5, turma.getSalaTurma());
		pstm.setInt(6, turma.getCod());
		pstm.execute();
	}

	
	public void deletarTurma(Turma turma) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(deletar);
		pstm.setInt(1,turma.getCod());
		pstm.execute();
		
		
	}
	public List<Turma> getLista()
	{
		List<Turma> listaTurma= new ArrayList<Turma>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(listar);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
				Turma turma = new Turma();
				turma.setCod(rs.getInt("cod_turma"));
				Curso curso = new Curso();
				
				
				curso.setCod(rs.getInt("Bd01_Curso_cod_curso"));
				turma.setCodCurso(curso);
			
				turma.setEtapaTurma(rs.getString("etapa_turma"));
				turma.setTurnoTurma(rs.getString("turno_turma"));
				turma.setNomeTurma(rs.getString("nome_turma"));
				turma.setSalaTurma(rs.getString("sala_turma"));
	
				turma.setDataAltCadas(rs.getDate("data_alt_cadas"));
				
				listaTurma.add(turma);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return listaTurma;
		
		
	}
	public List<Turma> ListarTurmaNome()
	{
		List<Turma> listaTurmaNome= new ArrayList<Turma>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(listarTurma);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
				Turma turma = new Turma();
				turma.setNomeTurma(rs.getString("nome_curso"));
				turma.setCod(rs.getInt("cod_curso"));
				listaTurmaNome.add(turma);
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return listaTurmaNome;
		
	
	}
}