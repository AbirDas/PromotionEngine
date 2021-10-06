package com.promotionEngine.Calculator;

import java.util.HashMap;
import java.util.Map;

public class CartCalculator {
	
	Map<String, Integer> cart = null;
	Map<String, Integer> calculationCart = null;
	
	public CartCalculator(Map<String, Integer> cart) {
		this.cart = new HashMap<String, Integer>(cart);
		this.calculationCart = new HashMap<String, Integer>(cart);
	}
	
	public int getToalPrice() {
		
		return 0;
	}

}
