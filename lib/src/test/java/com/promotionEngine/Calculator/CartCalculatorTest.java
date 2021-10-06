package com.promotionEngine.Calculator;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CartCalculatorTest {

	@Test
	public void testScenarioA() {
		Map<String, Integer> ScenarioA = new HashMap<>();
		ScenarioA.put("A", 1);
		ScenarioA.put("B", 1);
		ScenarioA.put("C", 1);
		CartCalculator cart = new CartCalculator(ScenarioA); 
		assertEquals("Scenario A of test",100, cart.getToalPrice());
	}
	
	@Test
	public void testScenarioB() {
		Map<String, Integer> ScenarioA = new HashMap<>();
		ScenarioA.put("A", 5);
		ScenarioA.put("B", 5);
		ScenarioA.put("C", 1);
		CartCalculator cart = new CartCalculator(ScenarioA); 
		assertEquals("Scenario B of test",370, cart.getToalPrice());
	}
	
	@Test
	public void testScenarioC() {
		Map<String, Integer> ScenarioA = new HashMap<>();
		ScenarioA.put("A", 3);
		ScenarioA.put("B", 5);
		ScenarioA.put("C", 1);
		ScenarioA.put("D", 1);
		CartCalculator cart = new CartCalculator(ScenarioA); 
		assertEquals("Scenario B of test",280, cart.getToalPrice());
	}

}
