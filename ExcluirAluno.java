package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDao;
import model.Aluno;

/**
 * Servlet implementation class excluirAluno
 */
@WebServlet("/ExcluirAluno")
public class ExcluirAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		
	//INSTANCIAS
	Aluno aluno = new Aluno();
	AlunoDao dao = new AlunoDao();
	
	//BUSCANDO ATRIBUTOS DO JSP E INSTANCIANDO NO OBJETO
	String matricula = request.getParameter("matricula");
	aluno.setMatricula(Integer.parseInt(matricula));
	
		//REALIZANDO A DELECAO LOGINA 
		try {dao.deletar(aluno);} 
		catch (SQLException e) {e.printStackTrace();}
		
		//APOS, REDIRECIONANDO PARA A PAGINA ABAIXO
		RequestDispatcher rd = request.getRequestDispatcher("alertaAlunoDeletado.jsp");
		rd.forward(request, response);
	
	}//END CLASS

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
