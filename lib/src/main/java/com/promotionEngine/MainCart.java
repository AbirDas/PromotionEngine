package com.promotionEngine;

import java.util.HashMap;
import java.util.Map;

import com.promotionEngine.Calculator.CartCalculator;

public class MainCart {

	public static void main(String[] args) {
		Map<String, Integer> ScenarioA = new HashMap<>();
		ScenarioA.put("A", 5);
		ScenarioA.put("B", 5);
		ScenarioA.put("C", 1);
		//ScenarioA.put("D", 1);
		
		CartCalculator calculat = new CartCalculator(ScenarioA);
		System.out.println(calculat.getToalPrice());
	}

}
