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
import model.Sexo;
import model.Usuario;



public class UsuarioDao {
	public UsuarioDao() {
			 con = (Connection) Conexao.obterConexao();
		}
	Connection con = null;
	
	String inserir= "INSERT INTO bd01_usuario (login, senha, dataCadastro,dataAlt,codADM,status) VALUES (?, ?, ?,?,?,1);";
	String listar="SELECT login,senha,codADM,id FROM bd01_usuario where status=1;";
	String Deletar ="UPDATE bd01_usuario SET status=0 WHERE id=?;"  ;
	String update="UPDATE bd01_usuario SET login=?, senha=?,dataAlt=?,codADM=? WHERE id=?;";
	
	public void Update(Usuario usuario) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(update);
		pstm.setString(1, usuario.getLogin());
		pstm.setString(2, usuario.getSenha());
		pstm.setDate(3, usuario.setDataAlt(java.sql.Date.valueOf(java.time.LocalDate.now())));
		pstm.setInt(4, usuario.getCodAdm());
		pstm.setInt(5,usuario.getId());
		pstm.execute();
	
	}
	
	
	public void incluir(Usuario usuario) throws SQLException{
		PreparedStatement pstm = con.prepareStatement(inserir);
		
		pstm.setString(1, usuario.getLogin());
		pstm.setString(2, usuario.getSenha());
		
		pstm.setDate(3, usuario.setDataCadastro(java.sql.Date.valueOf(java.time.LocalDate.now())));
		pstm.setDate(4, usuario.setDataAlt(java.sql.Date.valueOf(java.time.LocalDate.now())));
		pstm.setInt(5, usuario.getCodAdm());
		pstm.execute();
		
}
	
	public List<Usuario> ConfirmarUsuario()
	{
		List<Usuario> listarUsuario= new ArrayList<Usuario>();
		//INSTANCIANDO SQL PARA RECEVER COMANDO
		StringBuilder sql = new StringBuilder();
		sql.append(listar);	//EXECUTANDO SQL	
	
			try 
			{
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				
					//ENQUANTO NEXT LINE == TRUE FICA NO LOOP
	
			while(rs.next()) {
			Usuario usuario = new Usuario();
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setCodAdm(rs.getInt("codADM"));
				usuario.setId(rs.getInt("id"));
		
				listarUsuario.add(usuario);

			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			return listarUsuario;
}
	
	public List<Usuario> getLista(){
		   
		   List<Usuario> listaUsuario = new ArrayList<Usuario>();
		   
		   //instanciando um tipo de String Builder
		   StringBuilder sql = new  StringBuilder();
		   
		   //add comando para a  variavel sql
		  sql.append("Select  * from bd01_usuario where status = 1;");
		  
		  
		try {
			Statement stmt = (Statement) con.createStatement();
			
			//Conjunto de resultados apos a execusao do query
			ResultSet rs = stmt.executeQuery(sql.toString());
	
			
			while(rs.next()){
			Usuario user = new Usuario();
			user.setCodAdm(rs.getInt("codADM"));
				user.setLogin(rs.getString("login"));
				user.setDataCadastro(rs.getDate("dataCadastro"));
				user.setDataAlt(rs.getDate("dataAlt"));
				user.setId(rs.getInt("id"));
				
				
				listaUsuario.add(user);
				
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
	public void DeletarUser(Usuario user)throws SQLException{
PreparedStatement pstm = con.prepareStatement(Deletar);
		
		pstm.setInt(1, user.getId());
		pstm.execute();
	}
	
	
}