package com.promotionEngine.Adapter;

import com.promotionEngine.helper.ICart;
import com.promotionEngine.helper.IUnit;

public class CartAdapter implements ICart{
	
	private IUnit unit =null;
	
	public CartAdapter(IUnit unit) {
		this.unit = unit;
	}

	@Override
	public String UnitName() {
		return unit.getUnitName();
	}

	@Override
	public int UnitQuanity() {
		return unit.getUnitQuantity();
	}

	@Override
	public int price() {
		return unit.getPrice();
	}

}
