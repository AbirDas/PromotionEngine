package com.promotionEngine.Calculator;

import java.util.HashMap;
import java.util.Map;

import com.promotionEngine.helper.ActivePromotionInfo;
import com.promotionEngine.helper.IUnit;
import com.promotionEngine.helper.QuantityperPrice;
import com.promotionEngine.unit.UnitFactory;
import com.promotionEngine.unit.UnitPromotionFactory;

public class PriceCalculator {

	Map<String, QuantityperPrice> calculatePrice = null;
	Map<String, Integer> cart = null;
	
	public PriceCalculator(Map<String, Integer> cart) {
		this.cart = cart;
		calculatePrice = new HashMap<String, QuantityperPrice>();
	}
	
	public Map<String, QuantityperPrice> calcuatePrice() {
		checkForJointPromotion();
		checkForPromotion();
		return calculatePrice;
	}
	
	public void checkForPromotion() {
		UnitFactory plainFactory = new UnitFactory();
		UnitPromotionFactory promotionFactory = new UnitPromotionFactory();
		
		for(String key : cart.keySet()) {
			IUnit unit = plainFactory.getUnit(key);
			IUnit promotionUnit = promotionFactory.getUnit(key);
			
			if(unit!=null && promotionUnit!=null) {
				QuantityperPrice qp = new QuantityperPrice();
				qp.setQuantity(cart.get(key));
				int price = ((qp.getQuantity()/promotionUnit.getUnitQuantity())*promotionUnit.getPrice()) +
						((qp.getQuantity()%promotionUnit.getUnitQuantity())* unit.getPrice());
				qp.setPrice(price);
				calculatePrice.put(key, qp);
			}else if(unit!=null) {
				QuantityperPrice qp = new QuantityperPrice();
				qp.setQuantity(cart.get(key));
				qp.setPrice(qp.getQuantity()*unit.getPrice());
				calculatePrice.put(key, qp);
			}else {
				//reserve for unit not available;
			}
		}
	}
	
	public void checkForJointPromotion() {
		int noOfJointUtil = ActivePromotionInfo.getJointCount();
		for(int i=1; i<=noOfJointUtil; i++) {
			checkForJointPromotion(String.valueOf(i));
		}
	}
	
	public void checkForJointPromotion(String no) {
		String[] units = ActivePromotionInfo.getJointUnitName(no).split("&");
		boolean isJointPromotionAvailable = true;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			for(String unit : units) {
				if(cart.containsKey(unit) && cart.get(unit)>= ActivePromotionInfo.getJoitQuantity(unit)) {
				}else {
					isJointPromotionAvailable = false;
				}
			}
			
			if(isJointPromotionAvailable) {
				for (String unit : units) {
					cart.put(unit, cart.get(unit) - ActivePromotionInfo.getJoitQuantity(unit));
				}
				if(calculatePrice.isEmpty()) {
					calculatePrice.put(ActivePromotionInfo.getJointUnitName(no), new QuantityperPrice(1,ActivePromotionInfo.getJointPrice(no)));
				}else if(!calculatePrice.containsKey(ActivePromotionInfo.getJointUnitName(no))) {
					calculatePrice.put(ActivePromotionInfo.getJointUnitName(no), new QuantityperPrice(1,ActivePromotionInfo.getJointPrice(no)));
				}else {
					QuantityperPrice qp = calculatePrice.get(ActivePromotionInfo.getJointUnitName(no));
					calculatePrice.put(ActivePromotionInfo.getJointUnitName(no), new QuantityperPrice(qp.getQuantity()+1,qp.getPrice()+ActivePromotionInfo.getJointPrice(no)));
				}
			}else {
				break;
			}
		}
	}
}
