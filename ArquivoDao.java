package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conecxao.Conexao;
import model.Arquivo;
import model.Projeto;

public class ArquivoDao {
	public ArquivoDao() {
		Conexao.obterConexao();
	}


	private static final String Inserir = "INSERT INTO bd01_documento (nome_documento, cod_projeto, data_cadastro) VALUES (?,?,20180525)";
	
	private static final String Alterar = "UPDATE bd01_imagem SET nome=? WHERE idArquivo=?";
	
	private static final String Exluir = "DELETE FROM bd01_imagem WHERE idArquivo=?";

	public void incluir(Arquivo arquivo) throws SQLException {
		Connection con = Conexao.obterConexao();
		PreparedStatement pstmt = (PreparedStatement) con
				.prepareStatement(Inserir);
		pstmt.setString(1, arquivo.getNome());
		pstmt.setInt(2, arquivo.getIdProjeto());
	
		pstmt.execute();
	}
	
	public void alterar(Arquivo arquivo) throws SQLException {
		Connection con = Conexao.obterConexao();
		PreparedStatement pstmt = (PreparedStatement) con
				.prepareStatement(Alterar);
		pstmt.setString(1, arquivo.getNome());
		pstmt.setInt(2, arquivo.getId());
		pstmt.execute();
	}

	public void deletar(Arquivo arquivo) throws SQLException {
		Connection con = Conexao.obterConexao();
		PreparedStatement pstmt = (PreparedStatement) con
				.prepareStatement(Exluir);
		pstmt.setInt(1, arquivo.getId());
		pstmt.execute();
	}
	
	

	
	
	public List<Arquivo> getLista() {

		List<Arquivo> listarArquivo = new ArrayList<Arquivo>();

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT d.nome_documento,p.Nome_Proj_Mostra,p.Ano_Proj_Mostra  FROM"
				+ " bd01_documento d inner join bd01_projeto_mostra p\r\n" + 
				" where p.Cod_Proj_Mostra = d.cod_projeto;");

		try {
			Connection con = Conexao.obterConexao();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql.toString());
			
			while (rs.next()) {
			Projeto projeto =new Projeto();
				Arquivo arquivo = new Arquivo();
				arquivo.setNome(rs.getString("nome_documento"));
				projeto.setAno(rs.getInt("Ano_Proj_Mostra"));
				arquivo.setProjeto(projeto);
				projeto.setNome(rs.getString("Nome_Proj_Mostra"));
				arquivo.setProjeto(projeto);
				listarArquivo.add(arquivo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listarArquivo;

	}


}
