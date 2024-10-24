package com.example.callRest.Inherite;

public class RunInheritTest {

	public static void main(String[] args) {
		
		First f = new First();
		Second s = new Second();
		First f1 = new Second();
//		Second s1 = new First();
		
//		runTest(f);
		runTest(s);
		
//		ShapeInterface si =  new Second();
//		ShapeInterface si =  new First();
//		runTest(si);
		
	}
	
	public static void runTest(ShapeInterface si) {
//		si.setRef("hello");
//		si.printRef();
		String circle = si.getCircle(7);
		System.out.println("area = "+circle);
	}
}
