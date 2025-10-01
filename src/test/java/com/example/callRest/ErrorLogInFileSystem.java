package com.example.callRest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorLogInFileSystem {

	
	    public static void main2(String[] args) {
	    	
	        try {
	            // Your actual application logic
	            int result = 10 / 0; // Example error

	        } catch (Exception e) {
	            // Print stack trace into a separate file
	            try (PrintWriter pw = new PrintWriter(new FileWriter("/media/shared/error_log.txt", true))) {
	                e.printStackTrace(pw);
	                System.out.println("Error logged into error_log.txt");
	            } catch (IOException ioEx) {
	                ioEx.printStackTrace();
	            }
	            e.printStackTrace();
	        }
	    }
	    
	    
	    public static void main(String[] args) {
			
	    	final String baseFolder = "/media/tmp/settlement-error_logs/";
	    	final String filepath = baseFolder + System.currentTimeMillis()+"_error_log.txt";
	        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
	            try (PrintWriter pw = new PrintWriter(new FileWriter(filepath, true))) {
	                pw.println("Uncaught exception in thread " + thread.getName() + ":");
	                throwable.printStackTrace(pw);
	                System.out.println("Uncaught exception logged into error_log.txt");
	            } catch (IOException ioEx) {
	                ioEx.printStackTrace();
	            }
	        });
	        
	        testMethodCode();
	    	
//	    	final String baseFolder = "/media/tmp/settlement-error_logs/";
//	    	File fileDir = new File(baseFolder);
//	    	if (!fileDir.exists() ) {
//	    		fileDir.mkdir();
//	    	}
//	    	
//	    	final String filepath = baseFolder + "error_log.txt";
//	    	
//	    	Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
//	            try (PrintWriter pw = new PrintWriter(new FileWriter(filepath, true))) {
//	                pw.println("Uncaught exception in thread " + thread.getName() + ":");
//	                throwable.printStackTrace(pw);
//	                System.out.println("Uncaught exception logged into error_log.txt");
//	            } catch (IOException ioEx) {
//	                ioEx.printStackTrace();
//	            }
//	        });
//
//	        // Your actual application logic
//	        int result = 10 / 0; // Example error
	    }
	    
	    public static void testMethodCode() {
	    	
			try {
				// Your actual application logic
				int result = 10 / 0; // Example error

			} catch (Exception e) {
				e.printStackTrace();
			}
	    	int result = 10 / 0; // Example error
	    }
	        
}
