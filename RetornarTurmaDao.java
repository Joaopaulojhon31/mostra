package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conecxao.Conexao;
import model.Curso;
import model.Turma;

public class RetornarTurmaDao {

	
	public  RetornarTurmaDao() {
		con = Conexao.obterConexao();
	}
	Connection con = null;
	



	
	
	private String listar ="Select * from bd01_turma where status=0;";
	private String retornar="update  bd01_turma set status=1 where cod_turma=?;";
	
		

	
	
	
	
	public void deletarTurma(Turma turma) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(retornar);
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
	
	
}
