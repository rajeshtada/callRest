package com.example.callRest;

import net.bytebuddy.asm.Advice.This;

class GenericDeclare<S> {
	
	S in;

	public GenericDeclare(S in) {
		this.in = in;
	}
	
	public S getObject() {
		return this.in;
	}
	
}

public class GenericClass{
	
	String str ; 
	Class<Integer> T;
	GenericClass(Class t){
		this.T = t;
	}
	
	 <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
	
	public static void main(String[] args) {
		
		GenericDeclare<Integer> gIn = new GenericDeclare<>(15);
		Object objIn = gIn.getObject();
		System.out.println("First  result is = "+objIn);
		
		GenericDeclare<String> gStr = new GenericDeclare<>("Test Generic");
		Object objStr = gStr.getObject();
		System.out.println("Second  result is = "+objStr);
		
//		 genericDisplay(11);
//		 genericDisplay("Helllo...");
//		 GenericClass.genericDisplay(2.00);
		GenericClass gn = new GenericClass(Integer.class);
		gn.genericDisplay("Rama");
		int i = 11;
		gn.genericDisplay(i);
	}
	
	
}