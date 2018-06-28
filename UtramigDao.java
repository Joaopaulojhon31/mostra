package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import conecxao.Conexao;
import model.Diretor;
import model.Utramig;

public class UtramigDao {
	public UtramigDao() {
		con = Conexao.obterConexao();
	}
	Connection con = null;
	Diretor diretor= new Diretor();
	
	private String inserir = "insert into bd01_utramig (cnpj_utramig,nome_utramig,telefone_utramig,email_utramig,masp_diretor,data_alt_cadas_utramig)  values (?,?,?,?,?,?)";
	
	private String update ="UPDATE bd01_utramig SET nome_utramig=?, telefone_utramig=?,email_utramig=? WHERE cnpj_utramig=?;";
	
	private String deletar ="DELETE FROM `bd01_utramig` WHERE `cnpj_utramig`=?;";
	
	private String validarCadastro="select cnpj_utramig from bd01_utramig";
	
	private String listar = "select * from bd01_utramig;";
	
	public void incluir(Utramig utramig) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(inserir);
		pstm.setLong(1,utramig.getCnpj());
		pstm.setString(2, utramig.getNome());
		pstm.setInt(3,utramig.getTelefone());
		pstm.setString(4, utramig.getEmail());
		pstm.setInt(5, utramig.getMasp_diretor().getMasp_diretor());
		pstm.setDate(6, utramig.setDataALtCadas(java.sql.Date.valueOf(java.time.LocalDate.now())));
		pstm.execute();

}
	
	public void alterarCadastro(Utramig utramig) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(update);
		pstm.setString(1, utramig.getNome());		
		pstm.setInt(2, utramig.getTelefone());
		pstm.setString(3, utramig.getEmail());
		pstm.setLong(4, utramig.getCnpj());
		pstm.execute();
	}
	
	
	
	public void deletarCadastro(Utramig utramig) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(deletar);
		pstm.setLong(1, utramig.getCnpj());
		pstm.execute();
		
		
	}
	public List<Utramig> getLista() throws SQLException
	{
		List<Utramig> listaUtramig= new ArrayList<Utramig>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(listar);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
				Utramig utramig = new Utramig();
				utramig.setCnpj(rs.getLong("cnpj_utramig"));
				utramig.setNome(rs.getString("nome_utramig"));
				utramig.setTelefone(rs.getInt("telefone_utramig"));
				utramig.setEmail(rs.getString("email_utramig"));
				utramig.setDataALtCadas(rs.getDate("data_alt_cadas_utramig"));
				
				listaUtramig.add(utramig);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return listaUtramig;
		
		
	}
	
	public List<Utramig> ValidarCadastro() throws SQLException
	{
		List<Utramig> validarUtra= new ArrayList<Utramig>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(validarCadastro);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
				Utramig utramig = new Utramig();
				utramig.setCnpj(rs.getLong("cnpj_utramig"));
				validarUtra.add(utramig);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return validarUtra;
		
		
	}
	
	
}