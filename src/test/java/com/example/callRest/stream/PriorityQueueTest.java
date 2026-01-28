package com.example.callRest.stream;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	 public static void main(String args[])
	    {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        
//	        pq.add(1);
	        pq.add(2);
	        pq.add(1);
	        
//	      	for(int i=0;i<3;i++){
//	            pq.add(i);
//	            pq.add(1);
//	        }
	      
	        System.out.println(pq);
	        System.out.println("Poll Method: " + pq.poll());
	        System.out.println(pq);
	        Integer element = pq.peek();
	        System.out.println("Accessed Element: " + element);
	    }
	 
}
