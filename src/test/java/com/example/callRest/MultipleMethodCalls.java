package com.example.callRest;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

public class MultipleMethodCalls {

	public static  int f = 0;
	public static  int k = 0;
    public static void main(String[] args) {
    	
    	MultipleMethodCalls multipleMethodCalls = new MultipleMethodCalls();
    	multipleMethodCalls.threadRunner();
    	System.out.println(" max value of thread count = " + f);
    			
    }
    
    public void threadRunner() {
    	Instant now1 = Instant.now();
    
    	
        ExecutorService executor = Executors.newFixedThreadPool(10000); // create a thread pool with 10 threads
        
        // submit tasks to the executor
        for ( int j = 0 ; j < 10000 ; j++ ) {
        	
        	final int l = j;
        	executor.submit(() -> method1(l));
        }
        executor.shutdown(); // shut down the executor when all tasks are completed
        
    	System.out.println(now1);
    	
        System.out.println(" ");
        Instant now2 = Instant.now();
    	System.out.println(now2);
    	
    	int diffNano = now2.getNano()-now1.getNano();
    	long diff = now2.getEpochSecond()-now1.getEpochSecond();
    	System.out.println("In Second = "+diff + " in Nano = "+ diffNano);
    }

    private static void method1(int i) {
    	Instant nowC = Instant.now();
    	int nano = nowC.getNano();
    	final int now = nano;
    	if (i>f ) {
    		f = i;
    	}
    	
    	if (k%20==0) {	System.out.println("");   	}
    	k++;
    	System.out.print(" ="+now+" =" + i);
    }


}




