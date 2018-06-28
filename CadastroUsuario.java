package sevlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import model.Usuario;


@WebServlet("/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDao userDao = new UsuarioDao();
		Usuario user = new Usuario();
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nivel = request.getParameter("nivel");
		
		user.setCodAdm(Integer.parseInt(nivel));
		user.setLogin(login);
		user.setSenha(senha);
		
		boolean validar = false;
		for (Usuario user2 : userDao.ConfirmarUsuario()) {
			if (user2.getLogin().equals(login)) {
				RequestDispatcher rd = request.getRequestDispatcher("alertaUser.jsp");
				rd.forward(request, response);
			
				validar =true;
			}	
			
		}
	
		if(validar== false) {
			try {
				userDao.incluir(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		RequestDispatcher rd = request.getRequestDispatcher("ListarUsuario.jsp");
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
