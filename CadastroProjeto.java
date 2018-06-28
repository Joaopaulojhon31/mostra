package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProjetoDao;
import model.Curso;
import model.Grupo;
import model.Projeto;


@WebServlet("/CadastroProjeto")
public class CadastroProjeto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Projeto projeto =new Projeto();
		ProjetoDao projetoDao = new ProjetoDao();
		Curso curso = new Curso();
		Grupo grupo = new Grupo();

		String nome = request.getParameter("nome");

		String coordenador = request.getParameter("coordenador");
		String data = request.getParameter("data");
		String semestre = request.getParameter("semestre");
		String descricao = request.getParameter("descricao");
		String codigoCurso = request.getParameter("codigoCurso");
	
	
	
		
		
		for(Projeto projeto2 : projetoDao.getLista()) {
			if(projeto2.getNome().equalsIgnoreCase(nome)){
				 RequestDispatcher rd = request.getRequestDispatcher("AlertaProjetoExistente.jsp");
				 rd.forward(request, response);
				 
			}
			}
					
			projeto.setNome(nome);

			projeto.setCoordenador(coordenador);
			projeto.setAno(Integer.parseInt(data));
			projeto.setSemestre(semestre);
			projeto.setDescricao(descricao);
			curso.setCod(Integer.parseInt(codigoCurso));
			projeto.setCurso(curso);
				
		try {
			projetoDao.includ(projeto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("alertaErro.jsp");
			 rd.forward(request, response);
		}
		 RequestDispatcher rd = request.getRequestDispatcher("AlertaProjetoSucesso.jsp");
		 rd.forward(request, response);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
