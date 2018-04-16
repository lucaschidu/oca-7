package com.sckeedoo.certification;

public class Exercise1 {
	
	//declare function which will return a more explicitly message
	public static String message(int comparissonResult) {
		if (comparissonResult == 0)
		{
			return " is equal to ";
		}
		else if (comparissonResult < 0) {
			return " is lexicographically less than ";
		}
		else {
			return " is lexicographically greater than ";
		}
	}

    public static void main(String[] args) {
	      String alice = "Alice";
	      String bob = "Bob";

       /* Use JDK documentation for String and find a method that
        would help you determine which of the strings above lexicographically
        precede the second and print that string.
        */
	    //using compareTo method
	    
	    System.out.println("Does " + alice + " precede " + bob + "? "+ alice + message(alice.compareTo(bob)) + bob);
	    System.out.println("Does " + bob + " precede " + alice + "? "+ bob + message(bob.compareTo(alice)) + alice);
    }
}
