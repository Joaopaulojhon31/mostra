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

@WebServlet("/CadastroTurma")
public class CadastroTurma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Turma turma = new Turma();
		TurmaDao turmaDao = new TurmaDao();
		Curso curso1 = new Curso();
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String curso = request.getParameter("curso");
		String sala = request.getParameter("sala");
		String etapa = request.getParameter("etapa");
		String turno = request.getParameter("turno");


		
		curso1.setCod(Integer.parseInt(curso));
		turma.setCodCurso(curso1);
		turma.setSalaTurma(sala);
		turma.setEtapaTurma(etapa);
		turma.setTurnoTurma(turno);
		turma.setNomeTurma(nome);
			Aluno aluno = new Aluno();
			aluno.setMatricula(Integer.parseInt(matricula));
			turma.setMatriculaAluno(aluno);
			
		try {
			turmaDao.incluir(turma);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 RequestDispatcher rd = request.getRequestDispatcher("AlertaErro.jsp");
			 rd.forward(request, response);
		}
		

		 RequestDispatcher rd = request.getRequestDispatcher("AlertaTurmaCadastro.jsp");
		 rd.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
