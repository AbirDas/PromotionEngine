package com.promotionEngine.unit;

import com.promotionEngine.helper.IUnit;

public class CUnit implements IUnit {
	
	private String unitName = "C";
	private int unitQuantity = 1;
	private int price = 20;
	
	public CUnit() {
	}
	
	//To change the value price later stage
	public CUnit(String unitName, int unitQuantity, int price) {
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
