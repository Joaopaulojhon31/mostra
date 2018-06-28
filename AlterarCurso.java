package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDao;
import dao.UtramigDao;
import model.Curso;
import model.Utramig;

@WebServlet("/AlterarCurso")
public class AlterarCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Curso curso		= new Curso();
		Utramig utra	= new Utramig();
		UtramigDao uDao	= new UtramigDao();
		CursoDao dao	= new CursoDao();
		
		//BUSCANDO ATRIBUTOS DO jsp
		long cnpj 	= Long.parseLong( request.getParameter("cnpj"));
		String nome = request.getParameter("nome");
		String desc = request.getParameter("desc");
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		utra.setCnpj(cnpj);
		curso.setCnpj(utra);
		curso.setNome(nome);
		curso.setDescCurso(desc);
		curso.setCod(codigo);
		
		
		{	//CASO O CODIGO EXISTA FARÁ ALTERACAO
			try { dao.update(curso);} 
			catch (SQLException e) {e.printStackTrace();
			}
			}
		RequestDispatcher rd = request.getRequestDispatcher("AlertaCursoAtualizado.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
