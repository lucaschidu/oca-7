package com.sckeedoo.certification;

public class Exercise1 {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = "Bob";

       /* Use JDK documentation for String and find a method that
        would help you determine which of the strings above lexicographically
        precede the second and print that string.
        */

        int u = alice.compareTo(bob);
        if (u < 0) {
            System.out.println(alice + " is lexicographically less than " + bob);
        } else if (u > 0) {
            System.out.println(alice + " is lexicographically greater than " + bob);
        } else {
            System.out.println(alice + "is lexicographically equal to " + bob);
        }
    }

}
