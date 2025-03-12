package com.example.callRest.utils;

public class LoadClass implements InterfaceLoadClass {

	private String param;

	public String getParam() {
		return param;
	}

	@Override
	public void setParam(String param) {
		this.param = param;

	}

	@Override
	public String processParam() {
		return "LoadClass 44 = " + param + " 8% charge";
	}

	private String processParamPrivate() {
		String processParam = processParam();
		return "PRIVATE : " + processParam;
	}

	@Override
	public String toString() {
		return "LoadClass [param=" + param + "]";
	}

}
