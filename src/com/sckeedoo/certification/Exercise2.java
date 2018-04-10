package com.sckeedoo.certification;

public class Exercise2 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";
        int index = 0;

       /* Use JDK documentation for String class and find a method that
        would help you determine all the indexes of the letter 'a' in abracadabra.
        Output: Print all letter 'a' indexes on a separate line.
        */
       for (index = 0; index<abracadabra.length();index++) { 
    	   	if (index == abracadabra.indexOf('a',index)) {
    	   		System.out.println(abracadabra.indexOf('a',index));
    	   	}
       }
    }
}
