package com.promotionEngine.unit;

import com.promotionEngine.helper.IUnit;

public class AUnit implements IUnit {
	private String unitName = "A";
	private int unitQuantity = 1;
	private int price = 50;
	
	public AUnit() {
	}
	
	//To change the value price later stage
	public AUnit(String unitName, int unitQuantity, int price) {
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
