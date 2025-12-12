package com.example.callRest.ibm;

import java.util.*;

public class Main {
	public static String properCompression(String s) {
		StringBuilder compressedStr = new StringBuilder();

		for (int i = 0; i < s.length(); i += 2) {
			char c = s.charAt(i);
			int count = Character.getNumericValue(s.charAt(i + 1));
			while (count > 0) {
				compressedStr.append(c);
				count--;
			}
		}

		return compressedStr.toString();
	}

	public static void main(String[] args) {
		String inputStr = "a3b5c2a2";
		String compressedResult = properCompression(inputStr);
		System.out.println(compressedResult); // Output: "aaabbbbbcc"
	}
}