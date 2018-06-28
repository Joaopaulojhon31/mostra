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
import model.Projeto;


@WebServlet("/AlterarProjeto")
public class AlterarProjeto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Projeto projeto =new Projeto();
		ProjetoDao projetoDao = new ProjetoDao();
		Curso curso = new Curso();
		
		String nome = request.getParameter("nome");
		String codigoMostra = request.getParameter("cod");
		String coordenador = request.getParameter("coordenador");
		String data = request.getParameter("ano");
		String semestre = request.getParameter("semestre");
		String descricao = request.getParameter("descricao");
		String codigoCurso = request.getParameter("codigoCurso");
	
	
	
		projeto.setNome(nome);
		projeto.setCod(Integer.parseInt(codigoMostra));
		projeto.setCoordenador(coordenador);
		projeto.setAno(Integer.parseInt(data));
		projeto.setSemestre(semestre);
		projeto.setDescricao(descricao);
		curso.setCod(Integer.parseInt(codigoCurso));
		projeto.setCurso(curso);
		
		try {
			projetoDao.alterar(projeto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("AlertaProjetoAtualizado.jsp");
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
