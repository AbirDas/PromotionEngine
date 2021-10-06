package com.promotionEngine.Calculator;

import java.util.HashMap;
import java.util.Map;

import com.promotionEngine.helper.QuantityperPrice;

public class CartCalculator {
	
	Map<String, Integer> cart = null;
	
	public CartCalculator(Map<String, Integer> cart) {
		this.cart = new HashMap<String, Integer>(cart);
	}
	
	public int getToalPrice() {
		PriceCalculator price = new PriceCalculator(cart);
		return count(price.calcuatePrice());
	}
	
	public int count(Map<String, QuantityperPrice> price) {
		int total = 0;
		for(String key : price.keySet()) {
			total += price.get(key).getPrice();
		}
		return total;
	}

}
