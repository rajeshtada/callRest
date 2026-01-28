package com.example.callRest.ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixSum {

	public static void main(String[] args) {
		sumSubarrayIsZero();
		
	}
	public static void sumSubarrayIsZero() {
//	    int[] arr = { -1, 2, -1, 0, 7, -5, -2 };
	    int[] arr = { 2, 2, -1,1, 0, 7, -5, -2 };

	    Map<Integer, List<Integer>> map = new HashMap<>();
	    int prefixSum = 0;

	    // prefix sum 0 at index -1
	    map.put(0, new ArrayList<>(List.of(-1)));

	    for (int i = 0; i < arr.length; i++) {
	        prefixSum += arr[i];

	        if (map.containsKey(prefixSum)) {
	            for (int startIndex : map.get(prefixSum)) {
	                printSubarray(arr, startIndex + 1, i);
	            }
	        }

	        map.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
	    }
	}

	private static void printSubarray(int[] arr, int start, int end) {
	    System.out.println(
	        "window Array: " + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1))
	    );
	}
	
}
