package com.example.callRest;

public class LabelBreak {

	public static void main(String[] args) {
		int j = 0;
		
		System.out.println(" hello ");
		
		search:	for ( int i =0 ; i<10 ; i++) {
			j++;
			System.out.println(" i="+i + " j="+ j);
			
				for( int k = 5 ; k<10 ; k++) {
					
					System.out.println(" while normal "+k);
					if (j>k) {
						break search;	
					}
					
				}
			
		}
	}
}
