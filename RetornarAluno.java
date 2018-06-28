package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RetornarAlunoDao;
import model.Aluno;


@WebServlet("/RetornarAluno")
public class RetornarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Aluno aluno = new Aluno();
		RetornarAlunoDao dao = new RetornarAlunoDao();
		
		//BUSCANDO ATRIBUTOS DO JSP E INSTANCIANDO NO OBJETO
		String matricula = request.getParameter("matricula");
		aluno.setMatricula(Integer.parseInt(matricula));
		
			//REALIZANDO A DELECAO LOGINA 
			try {dao.alterar(aluno);
			RequestDispatcher rd = request.getRequestDispatcher("alertaAlunoRetornado.jsp");
			rd.forward(request, response);
			} 
			
		
			catch (SQLException e) {e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
			rd.forward(request, response);
			}
			
			//APOS, REDIRECIONANDO PARA A PAGINA ABAIXO
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
