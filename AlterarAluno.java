package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDao;
import model.Aluno;
import model.Sexo;
import model.Turma;


@WebServlet("/AlterarAluno")
public class AlterarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String email = request.getParameter("email");
		String turma = request.getParameter("turma");
		String sexo = request.getParameter("sexo");
		
				
				Aluno aluno = new Aluno();
				Turma turma1 = new Turma();
				Sexo sexo1 = new Sexo();
				
				aluno.setNome(nome);
			
				aluno.setEmail(email);
				turma1.setCod(Integer.parseInt(turma));
				aluno.setCodTurma(turma1);
				sexo1.setCodigo(Integer.parseInt(sexo));
				aluno.setSexoAluno(sexo1);
				aluno.setMatricula(Integer.parseInt(matricula));
				AlunoDao alunoDao = new AlunoDao();
				
				
			
					
						
					try {
						alunoDao.alterar(aluno);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				RequestDispatcher rd = request.getRequestDispatcher("AlertaAlunoAtualizado.jsp");
				rd.forward(request, response);
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
