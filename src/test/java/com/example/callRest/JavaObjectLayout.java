package com.example.callRest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openjdk.jol.info.ClassLayout;

public class JavaObjectLayout {

	
	public static void main(String[] args) {
		
		
		List<Long> midList = Arrays.asList(1L, 2L, 3L);
		String collect = midList.stream().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(collect);
		
		System.out.println(ClassLayout.parseInstance(collect).toPrintable());
		
	}
	
}
