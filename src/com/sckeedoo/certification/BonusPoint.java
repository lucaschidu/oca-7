package com.sckeedoo.certification;

import java.util.*;
public class BonusPoint {


    /**
     *
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 4 == 8 + 0 + 0
     * A super lucky ticket is considered if it's number is a palindrome (google what a palindrome means).
     *
     * Task - Given a ticket number, find out it it's lucky , super lucky or a simple ticket
     *
     * Input :         Output:
     *    012030        lucky
     *    123999        simple ticket
     *    123321        super lucky
     */
    public static void main(String[] args) {
    	
    	Scanner scanner = null;
    	
    	try{
	    	scanner =	new Scanner(System.in);
	    	
	   
	    	StringBuilder ticket = new StringBuilder(scanner.nextLine());
	    	StringBuilder reversedTicket = ticket.reverse(); 
	    	
	        
	    	StringBuilder firstHalf = new StringBuilder(ticket.substring(0, 3));
	    	StringBuilder secondHalf = new StringBuilder(ticket.substring(3, 6));
	        
	    	boolean polindrome = false;
	        int sumFirst = 0, sumSecond = 0;
	    
	        for (int i = 0; i < firstHalf.length();i++) {
	        	sumFirst += Character.getNumericValue(firstHalf.charAt(i));
	        }
	    
	        for (int i = 0; i < secondHalf.length();i++) {
	        	sumSecond += Character.getNumericValue(secondHalf.charAt(i));
	        }
	    
	        if (ticket.toString().compareTo(reversedTicket.toString()) ==0){
	        	polindrome = true;
	        }
	        
	        
	        if (sumFirst == sumSecond)
	        {
	        	if (polindrome) {
	        		System.out.println(ticket+ "    super lucky" );
	        	}
	        	else {
	        		System.out.println(ticket+ "    lucky" );
	        	}        	
	        }
	        else {
	        	System.out.println(ticket+ "    simple ticket" );
	        }
    	}
    	finally {
    		if(scanner!=null)
    			scanner.close();
    	}
    }
}