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

public class CursoDao {

	// CONSTRUTOR
	public CursoDao() { Conexao.obterConexao(); }

	// CONEXAO
	Connection con = (Connection) Conexao.obterConexao();

	// INSTANCIAS
	Curso curso_aluno = new Curso();

	// SQL
	private String select = "select * from bd01_curso where status = 1;";
	private String select_status = "select status from bd01_curso where cod_curso = ?;";
	private	String insert = "insert into bd01_curso(Bd01_Utramig_cnpj_utramig, nome_curso,desc_curso,status,data_alt_cadas_curso) values(?,?,?,1,?);";
	private	String deletar_logica="UPDATE bd01_curso SET status = 0 WHERE cod_curso=?;";//deleção lógica
	//String delete = "delete from bd01_curso where Cod_Curso = ?";//Não haverá uma deleção física
	private	String update = "update bd01_curso set nome_curso = ?,desc_curso = ?, Data_Alt_Cadas_Curso = ? where Cod_Curso = ?;";

	// METODOS
	// INCLUD
	public void includ(Curso curso_aluno) throws SQLException {
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(insert);
		psmt.setLong	(1, curso_aluno.getCnpj().getCnpj());
		psmt.setString	(2, curso_aluno.getNome());
		psmt.setString	(3, curso_aluno.getDescCurso());
		//INSERINDO O STATUS NO SQL INSERT (1 = ATIVO / 0 = INATIVO);
		psmt.setDate 	(4, curso_aluno.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));
		psmt.execute();
		System.out.println("**Adicionado com sucesso**");
	}

	// UPDATE
	public void update(Curso curso_aluno) throws SQLException {
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(update);
		psmt.setString	(1, curso_aluno.getNome());
		psmt.setString	(2, curso_aluno.getDescCurso());
		psmt.setDate	(3, (Date) java.sql.Date.valueOf(java.time.LocalDate.now()));
		psmt.setInt(4, curso_aluno.getCod());
		psmt.execute();
		System.out.println("*Alterado*");
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
		} // TRATAMENTO DE ERRO
		catch (Exception e) {
			e.printStackTrace();
		}
		return listAllCurso;
	}

	// METODO PARA PESQUISA
	public Curso searchCurso(int i) {
		Curso curso_aluno = null;

		// INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append("select * from bd01_curso where Cod_Curso =" + i + ";"); // EXECUTANDO SQL
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());
			while (rs.next()) {
				Curso c = new Curso();
				Utramig u = new Utramig();
				c.setCod(rs.getInt("Cod_Curso"));
				u.setCnpj(rs.getLong("Bd01_Utramig_cnpj_utramig"));
				c.setCnpj(u);
				c.setNome(rs.getString("nome_curso"));
				c.setDescCurso(rs.getString("desc_curso"));
				c.setDataAltCadas(rs.getDate("data_alt_cadas_curso"));
				curso_aluno = c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return curso_aluno;
	}

	// METHOD TO DELECT ONE
/*	public void delete(CursoAluno curso_aluno) throws SQLException {
		// ABRIR CONEXAO SQL
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(deletar);
		psmt.setInt(1, curso_aluno.getCod_curso());
		psmt.execute();
		System.out.println("**Exluido**");
	}*/
	
	// METHOD TO DELECT ONE LOGICAL
	public void delete(Curso curso_aluno) throws SQLException {
		// ABRIR CONEXAO SQL
		PreparedStatement psmt = (PreparedStatement) con.prepareStatement(deletar_logica);
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
	
	
} // END CLASS
