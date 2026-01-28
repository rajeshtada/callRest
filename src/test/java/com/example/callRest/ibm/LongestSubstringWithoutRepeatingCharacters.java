package com.example.callRest.ibm;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	
    public static void main(String[] args) {
    	
        String str = "abcbbcbbkhlkkmnhhgbabfds";
        int longestSubstringLength = findLongestSubstringWithoutRepeatingCharacters(str);
        System.out.println(longestSubstringLength);
        
    }

    private static int findLongestSubstringWithoutRepeatingCharacters(String str) {
        // map to store the characters in the string and their last occurrence index
        Map<Character, Integer> charMap = new HashMap<>();
        int pointer = 0;
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // if character is already present in the map, move the pointer to the next index of the last occurrence of the character
            if (charMap.containsKey(currentChar)) {
                pointer = Math.max(pointer, charMap.get(currentChar) + 1);
            }
            // for each character, store the index of its last occurrence
            charMap.put(currentChar, i);
            // calculate the length of the current substring
            maxLength = Math.max(maxLength, i - pointer + 1);
        }
        return maxLength;
    }
}