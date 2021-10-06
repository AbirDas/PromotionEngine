package com.promotionEngine.helper;

public class QuantityperPrice {
	
	private int quantity = 0;
	private int price = 0;
	
	public QuantityperPrice() {
	}
	
	public QuantityperPrice(int quantity, int price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
