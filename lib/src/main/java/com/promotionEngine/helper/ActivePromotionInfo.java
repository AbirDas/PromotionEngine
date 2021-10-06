package com.promotionEngine.helper;

public class ActivePromotionInfo {

	public static String Unit_1 = "A";
	public static int Quantity_1 = 3;
	public static int price_1 = 130;
	
	public static String Unit_2 = "B";
	public static int Quantity_2 = 2;
	public static int price_2 = 45;
	
	public static String Unit_joint_1 = "C&D";
	public static int Quantity_joint_C = 1;
	public static int Quantity_joint_D = 1;
	public static int price_joint_1 = 30;
	
	public static int getJoit(String unit) {
		if(("Quantity_joint_C").equalsIgnoreCase("Quantity_joint_"+unit)) return Quantity_joint_C;
		if(("Quantity_joint_D").equalsIgnoreCase("Quantity_joint_"+unit)) return Quantity_joint_D;
		return 0;
	}
	
}
