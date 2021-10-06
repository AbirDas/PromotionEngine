package com.promotionEngine.unit;

import com.promotionEngine.helper.IUnit;

public class Unit implements IUnit {
	private String unitName = null;
	private int unitQuantity = 0;
	private int price = 0;
	
	public Unit() {
	}
	
	public Unit(String unitName, int unitQuantity, int price) {
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
