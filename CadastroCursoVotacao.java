package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoVotacaoDao;
import model.Curso;


@WebServlet("/CadastroCursoVotacao")
public class CadastroCursoVotacao extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Curso curso = new Curso();
		CursoVotacaoDao cursoVoto = new CursoVotacaoDao();
		String cursoNome = request.getParameter("nome");
		curso.setNome(cursoNome);
		try {
			cursoVoto.includ(curso);
			RequestDispatcher rd = request.getRequestDispatcher("alertaCadastroVoto.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
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
