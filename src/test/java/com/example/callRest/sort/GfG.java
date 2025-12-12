package com.example.callRest.sort;

import java.util.Arrays;

public class GfG {

	public static void segregate0and1(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            if (arr[lo] == 1) {
                if (arr[hi] != 1) {
                    int temp = arr[lo];
                    arr[lo] = arr[hi];
                    arr[hi] = temp;
                    lo++;
                    hi--;
                } else {
                    hi--;
                }
            } else {
                lo++;
            }
        }
    }
	
	   public static void segregate0and1n(int[] arr) {
	        int lo = 0, hi = arr.length - 1;
	        while (lo < hi) {
	            while (arr[lo] == 0 && lo < hi) {
	            	lo++;
	            }
	            while (arr[hi] == 1 && lo < hi) {
	            	hi--;
	            }
	            
	            if (lo < hi) {
	                int temp = arr[lo];
	                arr[lo] = arr[hi];
	                arr[hi] = temp;
	                lo++;
	                hi--;
	            }
	        }
	   }
	   
	static void pushZerosToEnd(int[] arr) {

		int count = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		while (count < arr.length) {
			arr[count++] = 0;
		}
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
//		pushZerosToEnd(arr);
		int[] arr = {0, 1, 0, 1, 1, 1,0,0,1,1,1};
		segregate0and1(arr);
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}