package jsproject.servlets;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();

		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
	}

}
