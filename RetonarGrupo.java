package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RetornarGrupoDao;
import model.Grupo;


@WebServlet("/RetonarGrupo")
public class RetonarGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//INSTANCIAS
				Grupo grupo = new Grupo();
				RetornarGrupoDao dao= new RetornarGrupoDao();
				
				//ATRIBUTOS DO HTML
				int codigo 	= Integer.parseInt(request.getParameter("codGrupo"));
				
				//ATRIBUINDO VALORES AO OBJETO
				grupo.setCodgrupo(codigo);
				
				//CHAMANDO METHOD DA DAO
				try 
				{
					dao.retornar(grupo);
					
					RequestDispatcher rd = request.getRequestDispatcher("alertaGrupoRetornado.jsp");
					rd.forward(request, response);
				} 
				catch (Exception e) {e.printStackTrace(); 
				RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
				}
						
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
