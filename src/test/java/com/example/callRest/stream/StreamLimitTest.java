package com.example.callRest.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitTest {

	public static void main(String[] args) {
		
		startValue();
		lastValue();
		
		
	}
    public static void startValue() {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Orange", "Grey", "Golden");
//        List<String> list2 = new ArrayList<>();
//        for (String string : list) {
//			if ( string.startsWith("G")) {
//				list2.add(string);
//			}
//		}
//        System.out.println(list2);
        
        
        List<String> collect = list.stream().filter(x-> x.startsWith("G")).collect(Collectors.toList());
        
        List<String> result = list.stream()
                .filter(s -> s.startsWith("G")) // filter only "G"
                .limit(2)                       // take first 2
                .collect(Collectors.toList());

        System.out.println(result);
    }
    
    public static void lastValue() {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "Orange", "Grey", "Golden");

        List<String> gList = list.stream()
                .filter(s -> s.startsWith("G"))
                .collect(Collectors.toList());

        // Get last 2 safely
        List<String> result = gList.stream()
                .skip(Math.max(0, gList.size() - 2))
                .collect(Collectors.toList());

        System.out.println(result);
    }
    
}
