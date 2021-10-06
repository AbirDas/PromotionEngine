package com.promotionEngine.unit;

import com.promotionEngine.helper.ActivePromotionInfo;
import com.promotionEngine.helper.IUnit;

public class UnitPromotionFactory {
	
	public IUnit getUnit(String unit) {
		if(unit == null) return null;
		
		if(unit.equalsIgnoreCase(ActivePromotionInfo.Unit_1)) {
			return new Unit(ActivePromotionInfo.Unit_1,ActivePromotionInfo.Quantity_1,ActivePromotionInfo.price_1);
		}
		else if(unit.equalsIgnoreCase(ActivePromotionInfo.Unit_2)) {
			return new Unit(ActivePromotionInfo.Unit_2,ActivePromotionInfo.Quantity_2,ActivePromotionInfo.price_2);
		}
		
		return null;
	}

}
