package com.example.callRest;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;

public class ListEditIterateTest {

	public static void main(String[] args) {

		List<Mode> strList = new ArrayList<>();
		strList.add(new Mode ( 1L , "ram"));
		strList.add(new Mode ( 2L , "hari"));

		System.out.println(strList.toString());
		
		
		List<Mode> newMode = new ArrayList<>();
for (Mode mode : strList) {
	mode.setId(11L);
	newMode.add(mode);
	mode.setId(2555L);
	
}

for (Mode mode : newMode) {
	System.out.println(mode);
}

List<String> str= new ArrayList<>();
str.add("0123456");
for (String data : str) {
	String concat = data.concat("hello");
}
System.out.println(str);
		
	}
	
	
	

}

class Mode {
	Long id;
	String name;

	Mode(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	  @Override public String toString() { return "Mode [id=" + id + ", name=" +
	  name + "]"; }
	 

}
