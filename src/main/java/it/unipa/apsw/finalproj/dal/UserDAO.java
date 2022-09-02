package it.unipa.apsw.finalproj.dal;

import java.sql.SQLException;

import it.unipa.apsw.finalproj.exception.UserAlreadyExistException;
import it.unipa.apsw.finalproj.exception.WrongCredentialException;
import it.unipa.apsw.finalproj.model.User;

public abstract class UserDAO {

	protected static final String Q_LOGIN = "select * from users where email = ? and password = ?"; 
	
	private static UserDAO instance;
	public static UserDAO getInstance() {
		if(instance == null)
			instance = new UserDAOImpl();
		return instance;
	}
	
	public abstract User login(String email, String pwd) throws WrongCredentialException, SQLException;
	public abstract User register(User newUser) throws UserAlreadyExistException;
}
