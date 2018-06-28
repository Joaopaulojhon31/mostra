package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RetornarProjetoDao;
import model.Projeto;


@WebServlet("/RetornarProjeto")
public class RetornarProjeto extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cod= request.getParameter("cod");
		RetornarProjetoDao projetoDao = new RetornarProjetoDao();
		Projeto projeto = new Projeto();
		projeto.setCod(Integer.parseInt(cod));
		try {
			projetoDao.alterar(projeto);
			RequestDispatcher rd = request.getRequestDispatcher("alertaProjetoRetornado.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
			rd.forward(request, response);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
