package com.example.callRest.Inherite;

public class First implements ShapeInterface {

	public First() {
	}

	public First(String data) {
		this.ref = data;
	}
	public String ref;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public void printRef() {
		System.out.println("by First = "+this.ref);
	}

	@Override
	public String getCircle(int r) {
		// TODO Auto-generated method stub
		System.out.println("by First getCircle "+ref);
		int area = r*r*22/7;
		return String.valueOf(area);
	}

	@Override
	public String getSquare(int s) {
		// TODO Auto-generated method stub
		System.out.println("by First getSquare "+ref);
		int area = s*s;
		return String.valueOf(area);
	}


	
}
