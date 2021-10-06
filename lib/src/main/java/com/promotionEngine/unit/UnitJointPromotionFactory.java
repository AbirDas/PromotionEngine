package com.promotionEngine.unit;

import java.util.HashMap;
import java.util.Map;

import com.promotionEngine.helper.ActivePromotionInfo;
import com.promotionEngine.helper.IJointUnit;

public class UnitJointPromotionFactory {
	
	public IJointUnit getUnit(String unit) {
		if(unit == null) return null;
		
		if(unit.equalsIgnoreCase(ActivePromotionInfo.Unit_joint_1)) {
			String[] jointUnit = unit.split("&");
			Map<String, Integer> map = new HashMap<String, Integer>();
			for(String str : jointUnit) {
				map.put(str, ActivePromotionInfo.getJoit(str));
			}
			return new JointUnit(map, ActivePromotionInfo.price_joint_1);
		}
		
		
		return null;
	}
}
