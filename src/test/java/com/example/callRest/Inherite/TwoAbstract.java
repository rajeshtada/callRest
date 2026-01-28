package com.example.callRest.Inherite;

public class TwoAbstract extends OneAbstract {



	@Override
	public String printOneOne() {
		String string = super.classNAme;
		System.out.println("printTwoOne");
		return super.printOneOne();
	}

	@Override
	public String printOneTwo() {
		System.out.println("printTwoTwo");
		return "printOneTwo";
//		return super.printOneTwo();
	}
	
//	@Override
//	public String printOneThree() {
//		String string = super.classNAme;
//		System.out.println("printTwoOne");
//		return super.printOneOne();
//	}
}
