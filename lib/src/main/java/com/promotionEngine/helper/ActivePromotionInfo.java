package com.promotionEngine.helper;

public class ActivePromotionInfo {

	public static String Unit_1 = "A";
	public static int Quantity_1 = 3;
	public static int price_1 = 130;
	
	public static String Unit_2 = "B";
	public static int Quantity_2 = 2;
	public static int price_2 = 45;
	
	public static int joint_count = 1;
	
	public static String Unit_joint_1 = "C&D";
	public static int Quantity_joint_C = 1;
	public static int Quantity_joint_D = 1;
	public static int price_joint_1 = 30;
	
	public static int getJoitQuantity(String unit) {
		if(("Quantity_joint_C").equalsIgnoreCase("Quantity_joint_"+unit.trim())) return Quantity_joint_C;
		if(("Quantity_joint_D").equalsIgnoreCase("Quantity_joint_"+unit.trim())) return Quantity_joint_D;
		return 0;
	}
	
	public static String getJointUnitName(String no) {
		if(("Unit_joint_1").equalsIgnoreCase("Unit_joint_"+no.trim())) return Unit_joint_1;
		return null;
	}
	
	public static int getJointPrice(String no) {
		if(("price_joint_1").equalsIgnoreCase("price_joint_"+no.trim())) return price_joint_1;
		return 0;
	}
	
	public static void setJointCount(int count) {
		joint_count = count;
	}
	
	public static int getJointCount() {
		return joint_count;
	}
	
}
