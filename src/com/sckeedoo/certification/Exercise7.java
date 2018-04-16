package com.sckeedoo.certification;

public class Exercise7 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /* Use JDK documentation for String class and find a method that
        would help you identify the position of word 'Steve' and 'George' in the names string.

        Then find another method that would help you print the string from between those positions.
        Expected output: "Steve,Bob,Anna,Diana,George"
        */
        System.out.println(names.substring(names.indexOf("Steve"), names.indexOf("George")+"George".length()));
    }
}
