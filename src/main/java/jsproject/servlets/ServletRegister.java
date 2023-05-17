package jsproject.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jsproject.model.User;

@WebServlet("/ServletForm")
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRegister() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if ((name != null && !name.isEmpty()) && (email != null && !email.isEmpty())
				&& (password != null && !password.isEmpty())) {
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
		} else {
			RequestDispatcher redirect = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Complete all information for the register");
			redirect.forward(request, response);
		}
	}

}
