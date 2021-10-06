package com.promotionEngine.unit;

import com.promotionEngine.helper.CartInfo;
import com.promotionEngine.helper.IUnit;

public class UnitFactory {
	
	public IUnit getUnit(String unit) {
		if(unit == null) return null;
		
		if(unit.equalsIgnoreCase(CartInfo.Unit_1)) return new Unit(CartInfo.Unit_1,CartInfo.Quantity_1,CartInfo.price_1);
		if(unit.equalsIgnoreCase(CartInfo.Unit_2)) return new Unit(CartInfo.Unit_2,CartInfo.Quantity_2,CartInfo.price_2);
		if(unit.equalsIgnoreCase(CartInfo.Unit_3)) return new Unit(CartInfo.Unit_3,CartInfo.Quantity_3,CartInfo.price_3);
		if(unit.equalsIgnoreCase(CartInfo.Unit_4)) return new Unit(CartInfo.Unit_4,CartInfo.Quantity_4,CartInfo.price_4);
		
		return null;
	}

}
