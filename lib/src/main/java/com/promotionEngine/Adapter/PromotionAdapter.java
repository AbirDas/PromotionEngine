package com.promotionEngine.Adapter;

import com.promotionEngine.helper.IUnit;

public class PromotionAdapter implements IUnit{
	
	IUnit promotion = null;
	
	public PromotionAdapter(IUnit promotion) {
		this.promotion = promotion;
	}

	@Override
	public String getUnitName() {
		return promotion.getUnitName();
	}

	@Override
	public int getUnitQuantity() {
		return promotion.getUnitQuantity();
	}

	@Override
	public int getPrice() {
		return promotion.getPrice();
	}

}
