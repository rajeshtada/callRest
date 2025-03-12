package com.example.callRest.utils;

public class LoadClassGrandChild implements InterfaceLoadClass {

	private String param;

	@Override
	public void setParam(String param) {
		this.param = param;
		
	}

	@Override
	public String processParam() {

		return "LoadClass Grand Child = " + param + " 12 % charge";
	}

	private LoadClass l;

	public String getL() {
		this.l = new LoadClass();
				l.setParam(param);
		String param2 = l.getParam();
		return "LoadClass Super = " + param2 + " 12 % charge";
	}

	public void setL(LoadClass l) {
		this.l = l;
	}
	
	
	
}
