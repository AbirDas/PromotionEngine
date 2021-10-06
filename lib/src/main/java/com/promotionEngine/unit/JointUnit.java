package com.promotionEngine.unit;

import java.util.HashMap;
import java.util.Map;

import com.promotionEngine.helper.IJointUnit;

public class JointUnit implements IJointUnit{
	
	private int price = 0;
	Map<String, Integer> jointUnit = new HashMap<String, Integer>();
	
	public JointUnit(Map<String, Integer> map, int price) {
		this.jointUnit = map;
		this.price = price;
	}
	
	public void setJointUnit(Map<String, Integer> map) {
		jointUnit = map;
	}

	@Override
	public Map<String, Integer> getJointUnit() {
		return jointUnit;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
