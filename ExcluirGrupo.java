package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GrupoDao;
import model.Grupo;

/**
 * Servlet implementation class ExcluirGrupo
 */
@WebServlet("/ExcluirGrupo")
public class ExcluirGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirGrupo() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//INSTANCIAS
		Grupo grupo = new Grupo();
		GrupoDao dao= new GrupoDao();
		
		//ATRIBUTOS DO HTML
		int codigo 		= Integer.parseInt(request.getParameter("codgrupo"));
		
		//ATRIBUINDO VALORES AO OBJETO
		grupo.setCodgrupo(codigo);
		
		//CHAMANDO METHOD DA DAO
		try 
		{
			dao.deletar(grupo);
			
			RequestDispatcher rd = request.getRequestDispatcher("excluirGrupo.jsp");
			rd.forward(request, response);
		} 
		catch (Exception e) {e.printStackTrace(); 
		RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
		}
				
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
