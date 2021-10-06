package com.promotionEngine.unit;

import com.promotionEngine.helper.IUnit;

public class BUnit implements IUnit{

	private String unitName = "B";
	private int unitQuantity = 1;
	private int price = 30;
	
	public BUnit() {
	}
	
	//To change the value price later stage
	public BUnit(String unitName, int unitQuantity, int price) {
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
