package it.unipa.apsw.finalproj.model;

import java.sql.Timestamp;

public class Order {

	private int id;
	private Machine machine;
	private User user;
	private String order_info;
	private double tot_price;
	private Timestamp insert_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getOrder_info() {
		return order_info;
	}
	public void setOrder_info(String order_info) {
		this.order_info = order_info;
	}
	public double getTot_price() {
		return tot_price;
	}
	public void setTot_price(double tot_price) {
		this.tot_price = tot_price;
	}
	public Timestamp getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(Timestamp insert_time) {
		this.insert_time = insert_time;
	}	
}
