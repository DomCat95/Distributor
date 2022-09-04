package it.unipa.apsw.finalproj.controller;

import java.sql.SQLException;

import it.unipa.apsw.finalproj.dal.UserDAO;
import it.unipa.apsw.finalproj.exception.WrongCredentialException;
import it.unipa.apsw.finalproj.model.User;
import jakarta.servlet.http.HttpSession;

public class LoginCtrl {

	public static final String LOGGED_USER_KEY = "user";
	private UserDAO repo = UserDAO.getInstance();
	
	public User login (String email, String pwd) throws WrongCredentialException, SQLException {
		return this.repo.login(email, pwd);
	}
	
	public Boolean logout (HttpSession session) {
		if(session.getAttribute(LOGGED_USER_KEY)!=null) 
		{
			session.removeAttribute(LOGGED_USER_KEY);
			return true;
		}
		return false;
	}
	
	
}
