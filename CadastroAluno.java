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
import dao.SexoDao;
import model.Aluno;
import model.Sexo;
import model.Turma;
import model.Usuario;


@WebServlet("/CadastroAluno")
public class CadastroAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
 

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//BUSCANDO VALORES DA PAGINA JSP
		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula");
		String email = request.getParameter("email");
		String turma = request.getParameter("turma");
		String sexo = request.getParameter("sexo");	
		
		
				Aluno aluno = new Aluno();
				Turma turma1 = new Turma();
				Sexo sexo1 = new Sexo();
				SexoDao dao = new SexoDao();
				AlunoDao alunoDao = new AlunoDao();
				
				aluno.setNome(nome);
				aluno.setEmail(email);
					turma1.setSalaTurma(turma);
				aluno.setCodTurma(turma1);
					sexo1.setCodigo(Integer.parseInt(sexo));
				aluno.setSexoAluno(sexo1);
				
				int matricula2 = Integer.parseInt(matricula);
				
					for (Aluno al : alunoDao.ConfirmarAluno()) 
					{	
						//VERIFICANDO SE EXISTE A MATRICULA
						if(al.getMatricula()==matricula2){ 
					
							RequestDispatcher rd = request.getRequestDispatcher("AlertaAlunoExistente.jsp");
							rd.forward(request, response);
						}
					}
							//CASO NÃO EXISTA FARÁ A INCLUSAO
							aluno.setMatricula(Integer.parseInt(matricula));
							
							try {alunoDao.incluir(aluno);} 
							catch (SQLException e) {e.printStackTrace();}	
							
							RequestDispatcher rd = request.getRequestDispatcher("AlertaAlunoSucesso.jsp");
							rd.forward(request, response);
							
						}
					

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		doGet(request, response);
	}

}
