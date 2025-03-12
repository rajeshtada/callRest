package com.example.callRest.utils;

public class LoadClassChild implements InterfaceLoadClass {

	private String param;
	
	@Override
	public void setParam(String param) {
		this.param = param;
	}

	
	@Override
	public String processParam() {
		
		 return "LoadClass child = " + param + " 10% charge";
	}

	
}
