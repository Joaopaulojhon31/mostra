package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RetornarTurmaDao;
import model.Turma;


@WebServlet("/RetornarTurma")
public class RetornarTurma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RetornarTurmaDao turmaDao = new RetornarTurmaDao();
		Turma turma = new Turma();
			String codTurma = request.getParameter("cod");
			turma.setCod(Integer.parseInt(codTurma));
			try {
				turmaDao.deletarTurma(turma);
				RequestDispatcher rd = request.getRequestDispatcher("alertaTurmaRetornada.jsp");
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
