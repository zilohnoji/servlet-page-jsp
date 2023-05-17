package jsproject.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jsproject.model.User;

@WebServlet("/ServletLog")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if ((name.equals("admin") && !name.isEmpty()) && (password.equals("admin") && !password.isEmpty())) {
			user.setName(name);
			user.setPassword(password);
		} else {
			RequestDispatcher redirect = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Enter valid values");
			redirect.forward(request, response);
		}
	}

}
