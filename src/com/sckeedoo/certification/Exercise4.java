package com.sckeedoo.certification;

public class Exercise4 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";
        String abRacadabra;
       /* Use JDK documentation for String class and find a method that
        would help you replace the first occurrence character 'r' with character 'R'.

        Perform the replacement and print the result.
        */
        abRacadabra = abracadabra.replaceFirst("r", "R");
        System.out.println(abRacadabra);
        
    }
}
