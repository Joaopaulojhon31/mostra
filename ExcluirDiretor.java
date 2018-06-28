package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DiretoriaDao;
import model.Diretor;


@WebServlet("/ExcluirDiretor")
public class ExcluirDiretor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DiretoriaDao diretorDao = new DiretoriaDao();
		Diretor diretor = new Diretor();
		String masp = request.getParameter("masp_diretor");
		diretor.setMasp_diretor(Integer.parseInt(masp));
		try {
			diretorDao.delete(diretor);
			RequestDispatcher rd = request.getRequestDispatcher("alertaDiretorDeletado.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("listaErro.jsp");
			rd.forward(request, response);
		}
	
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
