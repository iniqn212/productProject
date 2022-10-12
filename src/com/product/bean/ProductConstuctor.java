package com.product.bean;

import java.time.LocalDate;

public class ProductConstuctor {

	private int id;
	private String name;
	private int quantity;
	private LocalDate dateOfPurchase;
	private float price;
	private String deliver;

	public ProductConstuctor() {

	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	@Override
	public String toString() {
		return "ProductConstuctor [id=" + id + ", name=" + name + ", quantity=" + quantity + ", dateOfPurchase="
				+ dateOfPurchase + ", price=" + price + ", deliver=" + deliver + "]";
	}

}
