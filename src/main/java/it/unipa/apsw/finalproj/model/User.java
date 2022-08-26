package it.unipa.apsw.finalproj.model;

import java.sql.Date;

public class User {
	
	public enum Status{
		connected,
		disconnected,
		connected_to_machine
	}

	private int id;
	private String name;
	private String surname;
	private Date birth_date;
	private String birth_place;
	private Status connection_status;
	private Machine machine;
	private double credit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getBirth_place() {
		return birth_place;
	}
	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}
	public Status getConnection_status() {
		return connection_status;
	}
	public void setConnection_status(Status connection_status) {
		this.connection_status = connection_status;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}

}
