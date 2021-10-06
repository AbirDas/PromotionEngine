package com.promotionEngine.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.promotionEngine.helper.CartInfo;
import com.promotionEngine.helper.IUnit;

public class UnitFactoryTest {

	@Test
	public void getUnitFactory() {
		UnitFactory unitFactory = new UnitFactory();
		IUnit unit = unitFactory.getUnit("A");
		assertTrue("Factory generating wrong instance", unit instanceof Unit);
		unit = unitFactory.getUnit("B");
		assertTrue("Factory generating wrong instance", unit instanceof Unit);
	}
	
	@Test
	public void generateNullFactory() {
		UnitFactory unitFactory = new UnitFactory();
		IUnit unit = unitFactory.getUnit("");
		assertNull("Factory should return null on wrong unit", unit);
	}
	
	@Test
	public void matchFactoryObjectPrice() {
		UnitFactory unitFactory = new UnitFactory();
		IUnit unit = unitFactory.getUnit("A");
		assertEquals("Price of Unit A is not matching", unit.getPrice(), CartInfo.price_1);
	}
	
	@Test
	public void matchFactoryObjectName() {
		UnitFactory unitFactory = new UnitFactory();
		IUnit unit = unitFactory.getUnit("A");
		assertEquals("Name of Unit A is not matching", unit.getUnitName(), CartInfo.Unit_1);
	}

}
