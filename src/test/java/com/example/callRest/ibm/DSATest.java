package com.example.callRest.ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DSATest {

	public static void main(String[] args) {

//		firstNonRepeatChar();
//		maxSumSubarray();
//		maxSumSubarray2();
//		SumSubarrayIsZero();
//		sumSubarrayIsZero();
		longestSubstringWithoutRepeatingCharacters();
	}

	public static void maxSumSubarray2() {
		int[] arr = { 2, 10, 17, 1, 9, 13, 4 };
		int k = 4;
		int maxSum = 0;

		int loopSize = arr.length - k;
		for (int i = 0; i <= loopSize; i++) {

			int windowSum = 0;

			int b[] = new int[k];
			System.arraycopy(arr, i, b, 0, k);
			windowSum = Arrays.stream(b).sum();
			System.out.println(Arrays.toString(b));
//			 int windowEndIndex = i+k;
//			for (int windowStartIndex = i; windowStartIndex < windowEndIndex; windowStartIndex++) {
//				windowSum += arr[windowStartIndex];
//			}
			System.out.println("cycle windowSum : " + i + " : " + windowSum);
			maxSum = Math.max(maxSum, windowSum);
		}

		System.out.println("maxSum : " + maxSum);

	}

	public static void maxSumSubarray() {
		int[] arr = { 2, 10, 17, 1, 9, 13, 4 };
		int k = 4;
		if (arr == null || arr.length < k) {
			throw new IllegalArgumentException("Array size must be greater than or equal to k");
		}
		int maxSum = 0;
		int windowSum = 0;
		int windowStart = 0;

		// Calculate the sum of the first window
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;

		// Slide the window across the array
		for (int windowEnd = k; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd];
			windowSum -= arr[windowStart];
			windowStart++;
			maxSum = Math.max(maxSum, windowSum);
		}
		System.out.println("maxSum : " + maxSum);
	}

	public static void SumSubarrayIsZero() {
//		int[] arr = { -1,2,-1,0,7,-5,-2,9,2,-4,4 };
		int[] arr = { -1, 2, -1, 0, 7, -5, -2 };
		int n = arr.length;
		for (int l = 1; l <= n - 1; l++) {

			int loopSize = n - l;
			
			for (int i = 0; i <= loopSize; i++) {

				int b[] = new int[l];
				System.arraycopy(arr, i, b, 0, l);
				int windowSum  = Arrays.stream(b).sum();
				
				if ( windowSum == 0) {
					System.out.println("window Array : " + Arrays.toString(b));
				}
			}
		}

	}

	public static void longestSubstringWithoutRepeatingCharacters() {

		String s = "skswias";
		int l = 0, max = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int r = 0; r < s.length(); r++) {
			if (map.containsKey(s.charAt(r))) {
				l = Math.max(l, map.get(s.charAt(r)) + 1);
			}
			map.put(s.charAt(r), r);
			max = Math.max(max, r - l + 1);
		}
		System.out.println("max : "+ max);

	}
	

	

	 public static void findLongestSubstringWithKDistinctCharacters() {
		  	String str = "araaci";
	        int distinct = 2;
	        // map to store the characters in the string and their last occurrence index
	        Map<Character, Integer> charMap = new HashMap<>();
	        int pointer = 0;
	        int maxLength = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            // if the map has k distinct characters and the current character is not in the map
	            if (charMap.size() == distinct && !charMap.containsKey(currentChar)) {
	                // find the smallest index in the map
	                Map.Entry<Character, Integer> localMap = charMap.entrySet().stream().min(Map.Entry.comparingByValue()).get();
	                // move the pointer to the next index of the smallest index
	                pointer = Math.max(pointer,  localMap.getValue() + 1);
	                // remove the smallest index from the map
	                charMap.remove(localMap.getKey());
	            }
	            // for each character, store the index of its last occurrence
	            charMap.put(currentChar, i);
	            // calculate the length of the current substring
	            maxLength = Math.max(maxLength, i - pointer + 1);
	        }
	        System.out.println("maxLength : "+ maxLength);
	    }
	 
	public static void sumSubarrayIsZero() {
	    int[] arr = { 2,3,-1,1,-3,5 };

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
