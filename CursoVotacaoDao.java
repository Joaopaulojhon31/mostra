package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import conecxao.ConexaoVotacao;
import model.Aluno;
import model.Curso;
import model.Utramig;

public class CursoVotacaoDao {
	Connection con = null;

	public CursoVotacaoDao() {
		con = (Connection) ConexaoVotacao.obterConexao();
	}

	private String inserir = "INSERT INTO `bd01_votacao`.`bd01_mostra` (`Nome_Proj_Mostra`, `status`, `dataVoto`) VALUES (?, 1,?);";
	private String select = "select * from bd01_mostra where status = 1;";
	public void includ(Curso curso_aluno) throws SQLException {
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(inserir);

		psmt.setString(1, curso_aluno.getNome());

		psmt.setDate(2, curso_aluno.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));
		psmt.execute();

	}
	
	// SELECT ALL
	public List<Curso> getLista() throws SQLException {
		List<Curso> listAllCurso = new ArrayList<Curso>();
		// INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(select); // EXECUTANDO SQL

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());

			// ENQUANTO NEXT LINE == TRUE FICA NO LOOP
			while (rs.next()) {
				Curso c = new Curso();
				
				c.setNome(rs.getString("Nome_Proj_Mostra"));
				c.setCod(rs.getInt("id_mostra"));
				
				listAllCurso.add(c);
			}
		} // TRATAMENTO DE ERRO
		catch (Exception e) {
			e.printStackTrace();
		}
		return listAllCurso;
	}
}