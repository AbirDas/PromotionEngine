package com.promotionEngine.unit;

public class DUnit {

	private String unitName = "D";
	private int unitQuantity = 1;
	private int price = 15;
	
	public DUnit() {
	}
	
	//To change the value price later stage
	public DUnit(String unitName, int unitQuantity, int price) {
		this.unitName = unitName;
		this.unitQuantity = unitQuantity;
		this.price = price;
	}
	
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public int getUnitQuantity() {
		return unitQuantity;
	}
	public void setUnitQuantity(int unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
