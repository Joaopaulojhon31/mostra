package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursoDao;
import model.Curso;

/**
 * Servlet implementation class ExcluirCurso
 */
@WebServlet("/ExcluirCurso")
public class ExcluirCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirCurso() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//INSTANCIAS
		Curso curso 	= new Curso();
		CursoDao dao	= new CursoDao();
		
		//puxando valores da jsp
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		//INSTANCIANDO VALORES PARA OBJETO
		curso.setCod(codigo);
		
		try {dao.delete(curso);} 
		catch (Exception e) {e.printStackTrace();}
		
		//APOS, REDIRECIONANDO PARA A PAGINA ABAIXO
		RequestDispatcher rd = request.getRequestDispatcher("alertaExcluirCurso.jsp");
		rd.forward(request, response);
				
	}//END SERVICE

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
