package com.sckeedoo.certification;

public class Exercise5 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
        
       /* Use JDK documentation for String class and find a method that
        would help you split the names string by ',' and get as a result an array.
        
        Print every name on a separate line.
        */
        String [] arrayNames = names.split(",");
        for (String string : arrayNames) {
			System.out.println(string);
		}
    }	
}
