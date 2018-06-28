package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TurmaDao;
import model.Aluno;
import model.Curso;
import model.Turma;


@WebServlet("/AlterarTurma")
public class AlterarTurma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Turma turma = new Turma();
		TurmaDao turmaDao = new TurmaDao();
		Curso curso1 = new Curso();
		String nome = request.getParameter("nomeTurma");
		String codCurso = request.getParameter("codCurso");
		String sala = request.getParameter("salaTurma");
		String etapa = request.getParameter("etapaTurma");
		String turno = request.getParameter("turnoTurma");
		String codTurma = request.getParameter("cod");

		
	Aluno aluno = new Aluno();

	turma.setMatriculaAluno(aluno);
	Curso curso = new Curso();
	curso.setCod(Integer.parseInt(codCurso));
	turma.setCodCurso(curso);
		turma.setNomeTurma(nome);
		turma.setSalaTurma(sala);
		turma.setEtapaTurma(etapa);
		turma.setTurnoTurma(turno);
		turma.setCod(Integer.parseInt(codTurma));
	
		
			try {
				turmaDao.alterarTurma(turma);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("AlertaTurmaSucesso.jsp");
			rd.forward(request, response);
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
