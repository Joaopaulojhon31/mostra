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

@WebServlet("/CadastroCurso")
public class CadastroCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroCurso() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	//INSTANCIAS 
		Curso curso		= new Curso();
		Utramig utra	= new Utramig();
		UtramigDao uDao	= new UtramigDao();
		CursoDao dao	= new CursoDao();
		
		//BUSCANDO ATRIBUTOS DO jsp
		long cnpj 	= Long.parseLong( request.getParameter("cnpj"));
		String nome = request.getParameter("nome");
		String desc = request.getParameter("descricao");
	
		
		utra.setCnpj(cnpj);
		curso.setCnpj(utra);
		curso.setNome(nome);
		curso.setDescCurso(desc);
	
				
		
		
			{	
				try 
				{	dao.includ(curso); 
				
				RequestDispatcher rd = request.getRequestDispatcher("AlertaCursoSucesso.jsp");
				rd.forward(request, response);
				} catch (Exception e)
				{e.getStackTrace();
				
				RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
				rd.forward(request, response);
				}
			}
		
	
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
