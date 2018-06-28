package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UtramigDao;
import model.Diretor;
import model.Utramig;


@WebServlet("/CadastroUtramig")
public class CadastroUtramig extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utramig utra = new Utramig();
		UtramigDao utraDao = new UtramigDao();
		Diretor diretor = new Diretor();
		
		String nome= request.getParameter("nome");
		System.out.println(nome);
		String cnpj= request.getParameter("cnpj");
		String telefone = request.getParameter("telefone");
		String email= request.getParameter("email");
		String masp = request.getParameter("masp");
		System.out.println(cnpj);
	
		
		int tel = Integer.parseInt(telefone);
		utra.setTelefone(tel);
		utra.setNome(nome);
		utra.setEmail(email);
		utra.setCnpj(Long.parseLong(cnpj));
		diretor.setMasp_diretor(Integer.parseInt(masp));
		utra.setMasp_diretor(diretor);
		utra.setCnpj(Long.parseLong(cnpj));
		try {
			utraDao.incluir(utra);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd =request.getRequestDispatcher("alertaErro.jsp");
			rd.forward(request, response);
		}
	
	RequestDispatcher rd =request.getRequestDispatcher("alertaUtramigCadastro.jsp");
	rd.forward(request, response);
	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
