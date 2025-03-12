package com.example.callRest.dynamicClass;

import com.example.callRest.utils.InterfaceLoadClass;
import com.example.callRest.utils.LoadClassGrandChild;

public class TestRunDynamicClass {

	public static void main(String[] args) {
		
//		InterfaceLoadClass l = new LoadClass();
//		InterfaceLoadClass l = new LoadClassChild();
		InterfaceLoadClass l = new LoadClassGrandChild();
		
		l.setParam("hello");
		String processParam = l.processParam();
		System.out.println(processParam);

	}
	
}
