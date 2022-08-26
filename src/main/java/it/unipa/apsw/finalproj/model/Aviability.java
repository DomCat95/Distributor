package it.unipa.apsw.finalproj.model;

import java.sql.Timestamp;

public class Aviability {

	private Machine machine;
	private Product product;
	private double price;
	private int quantity;
	private Timestamp last_update_time;
	
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Timestamp getLast_update_time() {
		return last_update_time;
	}
	public void setLast_update_time(Timestamp last_update_time) {
		this.last_update_time = last_update_time;
	}
}
