package com.sckeedoo.certification;

public class Exercise2 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

       /* Use JDK documentation for String class and find a method that
        would help you determine all the indexes of the letter 'a' in abracadabra.
        Output: Print all letter 'a' indexes on a separate line.
        */
        for (int i = 0; i < abracadabra.length(); i++) {
            if (i == abracadabra.indexOf("a", i)) {

                System.out.println(abracadabra.indexOf("a", i));
            }
        }

    }
}
