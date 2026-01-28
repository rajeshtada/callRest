package com.example.callRest.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.poi.hpsf.Array;

public class ListEditIterateTest {

	public static void main(String[] args) {

		List<Mode> strList = new ArrayList<>();
		strList.add(new Mode(1L, "ram"));
		strList.add(new Mode(2L, "hari"));
		strList.add(new Mode(5L, "hari"));
		
		System.out.println(strList.toString());

//		for (Mode mode : strList) {
//			mode.setId(11L);
//		}
//		System.out.println(strList.toString());
		
		List<Mode> newMode = new ArrayList<>();
		for (Mode mode : newMode) {
			System.out.println(mode);
		}

		Mode mode = strList.stream().sorted(Comparator.comparing(Mode::getId)).skip(1).findFirst().get();
		Map<Long, Mode> merchantMap = strList.stream().collect(Collectors.toMap(Mode::getId, Function.identity()));
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

	@Override
	public String toString() {
		return "Mode [id=" + id + ", name=" + name + "]";
	}

}
