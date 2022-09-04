package it.unipa.apsw.finalproj.presentation;

import java.io.IOException;
import java.sql.SQLException;

import it.unipa.apsw.finalproj.controller.LoginCtrl;
import it.unipa.apsw.finalproj.exception.WrongCredentialException;
import it.unipa.apsw.finalproj.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LoginCtrl loginCtrl;

	public LoginServlet() {
		super();
		this.loginCtrl = new LoginCtrl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().append("Served at: ").append(req.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);

		User loggedIn = null;
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		HttpSession session = req.getSession();

		try {
			loggedIn = this.loginCtrl.login(email, pwd);
		} catch (WrongCredentialException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"SQL Error: "+e.getMessage());
		}
		
		if(loggedIn==null) {
			resp.getWriter().print("Errore: Password o Email errate");
		}
		else {
			session.setAttribute(LoginCtrl.LOGGED_USER_KEY, loggedIn);			
			req.getRequestDispatcher("profile/main.jsp").forward(req, resp);
		}
	}

}
