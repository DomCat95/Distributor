package it.unipa.apsw.finalproj.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private final String DB_URL = "";//"jdbc:mysql://localhost:3306/dbname";
	private final String USER = "username";
	private final String PASS = "password";
	
	private Connection conn = null;
	
	public Connection connetti() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		if (this.conn == null) {
			
			try {
				this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
				
				System.out.println("Siamo connessi :)");
				
			} catch (SQLException e) {
				System.err.println("Errore di connessione");
				System.err.println(e.getMessage());
			}
		}
		
		return conn;
	}
	
	
	public static void main(String[] args) {
		Connector c = new Connector();
		c.connetti();
	}
}