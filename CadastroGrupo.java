package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GrupoDao;
import model.Aluno;
import model.Grupo;
import model.Mostra;

/**
 * Servlet implementation class CadastroGrupo
 */
@WebServlet("/CadastroGrupo")
public class CadastroGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int matricula = Integer.parseInt(request.getParameter("matricula"));
		String projeto =request.getParameter("projeto");
		String Descricao =request.getParameter("desc");
		String lider = request.getParameter("lider");
		
		
		
		Aluno aluno = new Aluno();
		Mostra mostra = new Mostra();
		Grupo grupo = new Grupo();
		GrupoDao grupoDao = new GrupoDao();
		
		aluno.setMatricula(matricula);
		grupo.setAluno(aluno);
		mostra.setCodMostra(Integer.parseInt(projeto));
		grupo.setCodmostra(mostra);
		grupo.setDesc(Descricao);
		grupo.setLiderProjeto(lider);
			
			
		{	
						try {grupoDao.incluirGrupo(grupo);} 
						catch (SQLException e) {e.printStackTrace();}
					
					
					RequestDispatcher rd = request.getRequestDispatcher("AlertaGrupoSucesso.jsp");
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
