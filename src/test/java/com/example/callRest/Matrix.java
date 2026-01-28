package com.example.callRest;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

	
	public static void main(String[] args) {
		
		
		
		int rows = 4;
		int columns = 3;
		int[][] result = new int[rows][columns];
		Random random = new Random();
		
		for (int i = 0; i < rows; i++) {
			   for (int j = 0; j < columns; j++) {

			    result[i][j] = random.nextInt(100) * 10;

			   }
			  }

		System.out.println(result.length);
		System.out.println(Arrays.toString(result));
		
		int rows1 = result.length;
		  int columns1 = result[0].length;

		  for (int i = 0; i < rows1; i++) {
		   for (int j = 0; j < columns1; j++) {
		    System.out.print(result[i][j] + "  ");
		   }
		   System.out.println();
		  }
		  
		  
	}
}
