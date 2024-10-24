package com.example.callRest.Inherite;

public class Second extends First{
	
	public Second() {
	}
	public Second(String data) {
		super(data);
		this.ref = data;
	}

	public String ref;
	public String refName;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}
	
	@Override
	public void printRef() {
		System.out.println("by Second ref = "+this.ref);
		super.printRef();
	}

	public void printRefName() {
		System.out.println("by Second refName = "+this.refName);
	}

	@Override
	public String getCircle(int r) {
		System.out.println("by Second getCircle " + ref);
		return super.getCircle(r);
//		int area = r*r*22/7;
//		return String.valueOf(area);
	}

	@Override
	public String getSquare(int side) {
		System.out.println("by Second getSquare " + ref);
		return super.getSquare(side);
	}

	

}
 