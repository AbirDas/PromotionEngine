package com.promotionEngine.Calculator;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.promotionEngine.helper.CartInfo;
import com.promotionEngine.helper.QuantityperPrice;

public class PriceCalculatorTest {

	@Test
	public void testForNonJointPromotion() {
		Map<String, Integer> Scenario = new HashMap<>();
		Scenario.put("A", 5);
		Scenario.put("B", 5);
		Scenario.put("C", 1);
		PriceCalculator pc = new PriceCalculator(Scenario);
		pc.checkForJointPromotion();
		assertEquals("With out joint unit promotion Map should be empty", true, pc.getCalculatePrice().isEmpty());
	}
	
	@Test
	public void testForJointPromotion() {
		Map<String, Integer> Scenario = new HashMap<>();
		Scenario.put("C", 1);
		Scenario.put("D", 1);
		PriceCalculator pc = new PriceCalculator(Scenario);
		pc.checkForJointPromotion();
		assertEquals("With joint unit promotion Map should not be empty", false, pc.getCalculatePrice().isEmpty());
	}
	
	@Test
	public void testForPromotion() {
		Map<String, Integer> Scenario = new HashMap<>();
		Scenario.put("A", 1);
		Scenario.put("B", 1);
		Scenario.put("C", 1);
		Scenario.put("D", 1);
		PriceCalculator pc = new PriceCalculator(Scenario);
		pc.checkForPromotion();
		assertEquals("Count of single unit per promotion", 4, pc.getCalculatePrice().size());
		Map<String,QuantityperPrice> priceMap = pc.getCalculatePrice();
		int total = 0;
		for(String price : priceMap.keySet()) {
			total += priceMap.get(price).getPrice();
		}
		assertEquals("With out any promotion single unit price is",
				CartInfo.price_1+CartInfo.price_2+CartInfo.price_3+CartInfo.price_4,
				total);
	}

}
