package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DiretoriaDao;
import dao.UtramigDao;
import model.Diretor;
import model.Utramig;


@WebServlet("/AlterarDiretor")
public class AlterarDiretor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DiretoriaDao diretoriaDao = new DiretoriaDao();
		Diretor diretor = new Diretor();
		Utramig utra = new Utramig();
		UtramigDao utraDao = new UtramigDao();

		String nome = request.getParameter("nome");
		String masp = request.getParameter("masp");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String departamento = request.getParameter("departamento");
		String cnpj = request.getParameter("cnpj");

		diretor.setNome_diretor(nome);
		diretor.setMasp_diretor(Integer.parseInt(masp));
		diretor.setEmail_diretor(email);
		diretor.setTelefone_diretor(Integer.parseInt(telefone));
		diretor.setDepto_diretor(departamento);
		
		try {
			for(Diretor diretor2:diretoriaDao.getLista()) {
				if(diretor2.getMasp_diretor()==Integer.parseInt(masp)) {
					
				diretoriaDao.updateDiretor(diretor);
					RequestDispatcher rd = request.getRequestDispatcher("AlertaDiretorAtualizado.jsp");
					rd.forward(request, response);
					
				}
			}
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
