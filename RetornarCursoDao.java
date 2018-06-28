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
import model.Aluno;
import model.Curso;
import model.Utramig;

public class RetornarCursoDao {

	public RetornarCursoDao() { Conexao.obterConexao(); }


	Connection con = (Connection) Conexao.obterConexao();

	
	Curso curso_aluno = new Curso();

	
	String select = "select * from bd01_curso where status = 0;";
	String retornar="UPDATE bd01_curso SET status = 1 WHERE cod_curso=?;";

	
	
	public List<Curso> getLista() throws SQLException {
		List<Curso> listAllCurso = new ArrayList<Curso>();
		
		StringBuilder sql = new StringBuilder();
		sql.append(select); 

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());

			
			while (rs.next()) {
				Curso c = new Curso();
				Aluno aluno = new Aluno();
				Utramig u = new Utramig();
				c.setCod(rs.getInt("cod_curso"));
				u.setCnpj(rs.getLong("Bd01_Utramig_cnpj_utramig"));
				c.setCnpj(u);
				c.setNome(rs.getString("nome_curso"));
				c.setDescCurso(rs.getString("desc_curso"));
				c.setDataAltCadas(rs.getDate("data_alt_cadas_curso"));
				listAllCurso.add(c);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return listAllCurso;
	}


	

	public void delete(Curso curso_aluno) throws SQLException {
		
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(retornar);
		psmt.setInt(1, curso_aluno.getCod());
		psmt.execute();
		
	}

	// VERIFICANDO ENTRADAS NÃO NUMERICAS
	public String entradaString(String entrada) {
		if (entrada.matches("[^0-9][^W]") || !entrada.matches("")) {
			return entrada;
		} else {
			System.out.println("Erro de caracter");
			return null;
		}
	}

	// VERIFICANDO ENTRADAS NUMERICAS
	public int entradaNumeric(String entrada) {
		if (entrada.matches("[0-9][^W]") || !entrada.matches("")) {
			return Integer.parseInt(entrada);
		} else {
			System.out.println("Erro de caracter");
			return 0;
		}
	}
	
	
}
