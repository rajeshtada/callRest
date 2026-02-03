package com.example.callRest.ibm;

import java.util.HashMap;

public class Anagram {
    // Function to find if two strings are anagrams
    public static boolean areAnagram(String sub, String matchingString) {
        if (sub.length() != matchingString.length())
            return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Increment frequency of characters in sub
        for (char c : sub.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        // Decrement frequency of characters in matchingString
        for (char c : matchingString.toCharArray()) {
            if (!freqMap.containsKey(c) || freqMap.get(c) == 0)
                return false;
            freqMap.put(c, freqMap.get(c) - 1);
        }

        return true;
    }

    // Function to count occurrences of anagrams of matchingString in mainString
    public static int countAnagrams(String mainString, String matchingString) {
        int countAnagram = 0;

        int mainStringLength = mainString.length();
        int matchingStringLength = matchingString.length();

        for (int i = 0; i <= mainStringLength - matchingStringLength; ++i) {
            String sub = mainString.substring(i, i + matchingStringLength);
            if (areAnagram(sub, matchingString))
                countAnagram++;
        }

        return countAnagram;
    }

    // Driver code
    public static void main(String[] args) {
        String mainString = "forxxorfxdofr";
        String matchingString = "for";

        System.out.println(countAnagrams(mainString, matchingString));
    }
}