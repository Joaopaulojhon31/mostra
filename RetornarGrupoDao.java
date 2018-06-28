package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import conecxao.Conexao;
import model.Aluno;
import model.Grupo;
import model.Mostra;

public class RetornarGrupoDao {

	public RetornarGrupoDao() {	con = Conexao.obterConexao();}
	
	Connection con = null;

	
	private String retornar="update `bd01_grupo_trab_projeto` set status=1 where `Cod_Grupo_trab_Projeto`=?;";
	private String listar ="SELECT * FROM bd01_grupo_trab_projeto where status=0;";

	
	public void retornar(Grupo grupo) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(retornar);
		pstm.setInt(1, grupo.getCodgrupo());
		pstm.execute();
		pstm.close();
	}
	
	
	
	public List<Grupo> getLista(){
		List<Grupo> listaGrupo = new ArrayList<Grupo>();
		StringBuilder sql = new StringBuilder();
		sql.append(listar);
		try {
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery(sql.toString());
			while(rs.next()) {
				Grupo grupo = new Grupo();
				grupo.setCodgrupo(rs.getInt("Cod_Grupo_trab_projeto"));
				//buscar a chave em outra tabela
				Mostra mostra = new Mostra();
				mostra.setCodMostra(rs.getInt("Bd01_Projeto_Mostra_Cod_Proj_Mostra"));
				grupo.setCodmostra(mostra);
				//fim
				Aluno aluno = new Aluno();
				aluno.setCodAluno(rs.getInt("matricula_aluno"));
				grupo.setCodAluno(aluno);
				grupo.setDesc(rs.getString("Descr_Grupo_trab_Projeo"));
				grupo.setLiderProjeto(rs.getString("Lider_Grupo_trab_Projeto"));
				grupo.setDataAltCadas(rs.getDate("Data_Alt_Grupo_Trab"));
		
				listaGrupo.add(grupo);	
			}//END WHILE
		} catch (Exception e) {}
		
	return listaGrupo;
	}//END METODO LISTAR
	
}
