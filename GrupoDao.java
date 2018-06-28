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

public class GrupoDao {
	
		public GrupoDao() {	con = Conexao.obterConexao();}
	
		Connection con = null;
  
		private String inserir ="INSERT INTO bd01_grupo_trab_projeto(matricula_aluno, Bd01_Projeto_Mostra_Cod_Proj_Mostra, Descr_Grupo_trab_Projeo,"
				+ " Lider_Grupo_trab_Projeto, Data_Alt_Grupo_Trab,status) VALUES (?, ?, ?, ?,?,?);";
		private String updateCodMostra = "UPDATE bd01_grupo_trab_projeto SET Bd01_Projeto_Mostra_Cod_Proj_Mostra=? WHERE Cod_Grupo_trab_Projeto=?";
		private String updateDescGrupo = "UPDATE `bd01_grupo_trab_projeto` SET `Descr_Grupo_trab_Projeo`=? WHERE `Cod_Grupo_trab_Projeto`=?;";
		private String updateLiderGrupo ="UPDATE `bd01_grupo_trab_projeto` SET `Lider_Grupo_trab_Projeto`=? WHERE `Cod_Grupo_trab_Projeto`=?;";
		private String alterar = "UPDATE bd01_grupo_trab_projeto SET Bd01_Projeto_Mostra_Cod_Proj_Mostra =?, Descr_Grupo_trab_Projeo =?, "
				+ "Lider_Grupo_trab_Projeto=?, Data_Alt_Grupo_Trab=? WHERE Cod_Grupo_trab_Projeto=?;";
		private String deletar="update `bd01_grupo_trab_projeto` set status=0 where `Cod_Grupo_trab_Projeto`=?;";
		private String listar ="SELECT * FROM bd01_grupo_trab_projeto where status=1;";

		public void incluirGrupo(Grupo grupo) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(inserir);
			pstm.setInt(1, grupo.getAluno().getMatricula());
			pstm.setInt(2, grupo.getCodmostra().getCodMostra());
			pstm.setString(3,grupo.getDesc());
			pstm.setString(4, grupo.getLiderProjeto());
			pstm.setDate(5,grupo.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now())) );
			pstm.setInt(6, grupo.setStatus(1));
			pstm.execute();
			pstm.close();
		
		}
		
		public void alterarCodGrupo(Grupo grupo) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(updateCodMostra);
			pstm.setInt(1, grupo.getCodmostra().getCodMostra());
			pstm.setInt(2, grupo.getCodgrupo());
			pstm.execute();
			pstm.close();
		}
		
		public void alterarDescGrupo(Grupo grupo) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(updateDescGrupo);
			pstm.setString(1, grupo.getDesc());
			pstm.setInt(2, grupo.getCodgrupo());
			pstm.execute();
			pstm.close();
		}
		
		public void alterarLiderGrupo(Grupo grupo) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(updateLiderGrupo);
			pstm.setString(1, grupo.getLiderProjeto());
			pstm.setInt(2, grupo.getCodgrupo());
			pstm.execute();
			pstm.close();
		}
		
		public void deletar(Grupo grupo) throws SQLException{
			PreparedStatement pstm = con.prepareStatement(deletar);
			pstm.setInt(1, grupo.getCodgrupo());
			pstm.execute();
			pstm.close();
		}
		
		
		//METODO QUE ALTERA TODOS ATRIBUTOS
		public void alterar(Grupo grupo) throws SQLException 
		{
			PreparedStatement pstm = con.prepareStatement(alterar);
			
				pstm.setInt(1, grupo.getCodmostra().getCodMostra());
				pstm.setString(2, grupo.getDesc());
				pstm.setString(3, grupo.getLiderProjeto());
				grupo.setDataAltCadas(java.sql.Date.valueOf(java.time.LocalDate.now()));
				pstm.setDate(4, grupo.getDataAltCadas());
				pstm.setInt(5, grupo.getCodgrupo());
			pstm.execute();
		}//END ALTERAR
		
		//METODO PARA LISTAR SOMENTE OS ALUNOS PERTENCENTES AO GRUPO
		public List<Grupo> getListaAlunos(int i)
		{
			List<Grupo> listaAlunosGrupo 	= new ArrayList<Grupo>();
			StringBuilder sql 				= new StringBuilder();
			sql.append("select matricula_aluno from bd01_grupo_trab_projeto where Cod_Grupo_trab_Projeto = "+i+";");
				
			try 
			{	
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					while(rs.next()) {
						//INSTANCIAS
						Grupo grupo = new Grupo();
						Aluno aluno = new Aluno();
						
						aluno.setCodAluno(rs.getInt("matricula_aluno"));
						grupo.setCodAluno(aluno);

						listaAlunosGrupo.add(grupo);
					}//END WHILE
				
			} catch (Exception e) {e.printStackTrace();}
			
			return listaAlunosGrupo;
		}//END METHOD
		
		
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

		
}//end class
