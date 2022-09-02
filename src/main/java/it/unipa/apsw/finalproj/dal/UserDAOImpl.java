package it.unipa.apsw.finalproj.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.unipa.apsw.finalproj.exception.UserAlreadyExistException;
import it.unipa.apsw.finalproj.exception.WrongCredentialException;
import it.unipa.apsw.finalproj.model.User;

class UserDAOImpl extends UserDAO {

	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;
	
	private Connector db = new Connector();
	
	@Override
	public User login(String email, String password) throws WrongCredentialException {
		
		User loggedUser = null;
		
		try {
			connection = this.db.connetti();
			statement = connection.prepareStatement(Q_LOGIN);
			statement.setString(1, email);
			statement.setString(2, password);
			resultSet = statement.executeQuery();

			statement.close();
			connection.close();
			
			if(resultSet.next()) {
				loggedUser = new User();
				loggedUser.setId(resultSet.getInt("id"));
				loggedUser.setName(resultSet.getString("name"));
				loggedUser.setSurname(resultSet.getString("surname"));
				loggedUser.setCredit(resultSet.getDouble("credit"));
			}else
				throw new WrongCredentialException();
			
		} catch (SQLException e) {
			//TODO handling
		} finally {
		}
		return loggedUser;
	}

	@Override
	public User register(User newUser) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
