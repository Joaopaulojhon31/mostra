package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDao;
import dao.RetornarCursoDao;
import model.Curso;


@WebServlet("/RetornarCurso")
public class RetornarCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Curso curso 	= new Curso();
		RetornarCursoDao dao	= new RetornarCursoDao();
		
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		
		curso.setCod(codigo);
		
		try {dao.delete(curso);
		RequestDispatcher rd = request.getRequestDispatcher("alertaCursoRetornado.jsp");
		rd.forward(request, response);}
		
		catch (Exception e) {e.printStackTrace();
		RequestDispatcher rd = request.getRequestDispatcher("listarErro.jsp");
		rd.forward(request, response);
		}
		
		
		
				
	}

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
