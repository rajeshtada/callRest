package com.example.callRest.Inherite;

public abstract class OneAbstract {

	public String classNAme = "OneAbstract";
	
	public String printOneOne() {
		System.out.println("printOneOne");
		return "printOneOne";
	}
	
	public abstract String printOneTwo() ;
	
	public String printOneThree() {
		System.out.println("printOneThree");
		return "printOneThree";
	}
}
