package com.sckeedoo.certification;

public class Exercise6 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /* Use JDK documentation for String class and find a method that
        would help you identify the position of word 'Diana' in the names string.

        Then find another method that would help you print the string from that position till the end.
        Expected output: "Diana,George,Dodon,Plahotniuc"
        */
        int index = 0;
        String array[] = names.split(",");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Diana")) {
                index = i + 1;
            }

        }
        System.out.println(index);
        System.out.println(names.substring(names.indexOf("Diana")));

    }
}
