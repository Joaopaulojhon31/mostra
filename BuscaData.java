package sevlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;

import dao.BuscarDataDao;
import model.Projeto;


@WebServlet("/BuscaData")
public class BuscaData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Projeto projeto1 = new Projeto();
		Projeto projeto2 = new Projeto();
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		projeto1.setAno(Integer.parseInt(data1));
		projeto2.setAno(Integer.parseInt(data2));
		
		BuscarDataDao projetodao = new  BuscarDataDao();
	
		try 
		{	
			System.out.println("Aqui foi");
			projetodao.setLista(projeto1.getAno(),projeto2.getAno());
			RequestDispatcher rd = request.getRequestDispatcher("BuscaDataLista.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {e.printStackTrace();}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}