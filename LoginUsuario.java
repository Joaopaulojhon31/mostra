package sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import dao.UsuarioDao;
import model.Usuario;

@WebServlet("/LoginUsuario")
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		boolean Valido = false;
		
		
		UsuarioDao usuarioDao = new UsuarioDao();
		for (Usuario user : usuarioDao.ConfirmarUsuario()) {
			if (user.getLogin().equals(login)   && user.getSenha().equals(senha)) {
				request.getSession().setAttribute("login", login);
				RequestDispatcher rd = request.getRequestDispatcher("indexUsuario.jsp");
				rd.forward(request, response);
				Valido = true;
			}
			} if(Valido !=true) {
				RequestDispatcher rd = request.getRequestDispatcher("alertaLoginInvalido.jsp");
				rd.forward(request, response);
			
			}

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
