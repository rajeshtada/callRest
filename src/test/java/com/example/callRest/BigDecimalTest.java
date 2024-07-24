package com.example.callRest;

import java.math.RoundingMode;

//import com.ftk.getepay.sqs.util.Util;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {

//		double dd = 0;
//		Double dd2 = dd;
////		dd2.
//		BigDecimal serviceCharges = new BigDecimal("2.1236");
//		serviceCharges.setScale(2, RoundingMode.HALF_UP);
//		BigDecimal gstCharges = BigDecimal.ZERO;
//		gstCharges.setScale(2, RoundingMode.HALF_UP);
//		
//		
////		gstCharges = serviceCharges.multiply(new BigDecimal("18"))
//		gstCharges = gstCharges.divide(new BigDecimal("100"), RoundingMode.HALF_UP);
//		
//		System.out.println(gstCharges);
//		System.out.println(dd2);
//		
//		var data1 = "hello";
//		System.out.println(data1);
		String s1 = null;
		
		BigDecimal bg1 = new BigDecimal("1.0");
		BigDecimal bg2 = new BigDecimal("2.0");
		BigDecimal bg3 = new BigDecimal(0);
		
		System.out.println(bg1);
		System.out.println(bg2);
		System.out.println(bg3);
		
		BigDecimal bigDecimal = bg3.add(bg2);
		
		System.out.println(bigDecimal);
		
		
	}
	

}
