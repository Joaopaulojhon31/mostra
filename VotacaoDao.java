package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import conecxao.ConexaoVotacao;
import model.Curso;
import model.Votacao;

public class VotacaoDao {
	Connection con=null;
	public VotacaoDao() {
		 con = (Connection) ConexaoVotacao.obterConexao();
	}
	
	private String inserir="INSERT INTO bd01_voto (id_mostra,dataVoto,nome_votante) VALUES (?,?,?);";

	
	public void CadastrarVotos(Votacao voto) throws SQLException {
		PreparedStatement pstm = con.prepareStatement(inserir);
		pstm.setInt(1, voto.getIdCurso().getCod());
		pstm.setDate(2,voto.setDataVotacao(java.sql.Date.valueOf(java.time.LocalDate.now())));
		pstm.setString(3, voto.getNomeVotante());
		pstm.execute();
		
	}
	
	public List<Votacao>getLista(){
		   
		   List<Votacao> listaVotos = new ArrayList<Votacao>();
		   
		   //instanciando um tipo de String Builder
		   StringBuilder sql = new  StringBuilder();
		   
		   //add comando para a  variavel sql
		  sql.append("SELECT c.Nome_Proj_Mostra, (select count(v.id_mostra) from bd01_voto v inner join bd01_mostra m where v.id_mostra = m.id_mostra)as qtdTotal , count(v.id_mostra)\r\n" + 
		  		"FROM  bd01_voto v 	inner join bd01_mostra c 	where v.id_mostra = c.id_mostra GROUP BY c.Nome_Proj_Mostra ;");
		  
		  
		try {
			Statement stmt = (Statement) con.createStatement();
			
			//Conjunto de resultados apos a execusao do query
			ResultSet rs = stmt.executeQuery(sql.toString());
	
			
			while(rs.next()){
				Curso curso = new Curso();
				Votacao voto = new Votacao();
				voto.setCodCurso(rs.getInt("count(v.id_mostra)"));
				curso.setNome(rs.getString("c.Nome_Proj_Mostra"));
				voto.setPorcent(rs.getInt("qtdTotal"));
				voto.setNome(curso);
				 voto.setTotal((voto.getCodCurso()*100)/voto.getPorcent());
			  
				
				listaVotos.add(voto);
				
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return listaVotos;
		
	}
	
	
	
	
}
