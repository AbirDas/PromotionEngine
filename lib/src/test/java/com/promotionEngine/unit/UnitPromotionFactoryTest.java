package com.promotionEngine.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.promotionEngine.helper.ActivePromotionInfo;
import com.promotionEngine.helper.CartInfo;
import com.promotionEngine.helper.IUnit;

public class UnitPromotionFactoryTest {

	@Test
	public void getUnitFactory() {
		UnitPromotionFactory unitFactory = new UnitPromotionFactory(); 
		IUnit unit = unitFactory.getUnit("A");
		assertTrue("Promotion factory generating wrong instance", unit instanceof Unit);
		unit = unitFactory.getUnit("B");
		assertTrue("Promotion factory generating wrong instance", unit instanceof Unit);
	}
	
	@Test
	public void generateNullFactory() {
		UnitPromotionFactory unitFactory = new UnitPromotionFactory();
		IUnit unit = unitFactory.getUnit("");
		assertNull("Promotion factory should return null on wrong unit", unit);
	}
	
	@Test
	public void matchFactoryObjectPrice() {
		UnitPromotionFactory unitFactory = new UnitPromotionFactory();
		IUnit unit = unitFactory.getUnit("A");
		assertEquals("Price of Unit A is not matching", unit.getPrice(), ActivePromotionInfo.price_1);
	}
	
	@Test
	public void matchFactoryObjectName() {
		UnitPromotionFactory unitFactory = new UnitPromotionFactory();
		IUnit unit = unitFactory.getUnit("A");
		assertEquals("Name of Unit A is not matching", unit.getUnitName(), ActivePromotionInfo.Unit_1);
	}
	
	@Test
	public void countOfJointUnit() {
		assertEquals("Number of unit promotion joint together are", ActivePromotionInfo.getJointCount(), ActivePromotionInfo.joint_count);
	}
	
	@Test
	public void checkJointPromotion() {
		int countJoint = ActivePromotionInfo.getJointCount();
		for(int i=1; i<=countJoint; i++) {
			assertEquals("Name of joint promotion unit", ActivePromotionInfo.getJointUnitName(String.valueOf(i)), "C&D");
			String[] units = ActivePromotionInfo.getJointUnitName(String.valueOf(i)).split("&");
			for(String unit : units)
			assertEquals("Quantity of joint promotion unit", 1, ActivePromotionInfo.getJoitQuantity(unit));
		}
	}
	
	@Test
	public void ZeroQuantityForWrongPromotion() {
		assertEquals("Wrong promotion should get zero",0, ActivePromotionInfo.getJoitQuantity(""));
	}

}
