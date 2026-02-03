package com.example.callRest.ibm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

	public static void main(String[] args) {
		
		int[] nums = new int [] {2,7,11,15};
				int target = 9;
				int[] twoSum = twoSum(nums, target);
				System.out.println(Arrays.toString(twoSum));
				
		    
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++){

            if ( map.containsKey(nums[i])){
                return new int[]{nums[map.get(nums[i])], nums[i]};
            } else { 
                map.put(target-nums[i], i);
            }
        }
        return null;
    }
}
