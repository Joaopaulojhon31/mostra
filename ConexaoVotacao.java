package conecxao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoVotacao {
	public static String  status = "";
	 
	 
	 public static Connection obterConexao(){
		
		 Connection con = null;
		 
		 try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/bd01_votacao?user=root&password=";
			
			con = DriverManager.getConnection(url);
			status = "Conexao Aberta";
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return con;
	 }
}
