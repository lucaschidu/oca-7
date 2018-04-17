package com.sckeedoo.certification;

import java.sql.SQLOutput;

public class Exercise7 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /* Use JDK documentation for String class and find a method that
        would help you identify the position of word 'Steve' and 'George' in the names string.

        Then find another method that would help you print the string from between those positions.
        Expected output: "Steve,Bob,Anna,Diana,George"
        */
        int indexS = 0;
        int indexG = 0;

        String array[] = names.split(",");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Steve")) {
                indexS = i + 1;
            } else if (array[i].equals("George")) {
                indexG = i + 1;
            }
        }
        System.out.println("Position Steve " + indexS);
        System.out.println("Position George " + indexG);
        System.out.println(names.substring(names.indexOf("Steve"), names.indexOf("George") + "George".length()));

    }
}
