package com.sckeedoo.certification;

public class Exercise3 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";
        String AbrAcAdAbrA;

       /* Use JDK documentation for String class and find a method that
        would help you replace all occurrences of character 'a' with character 'A'.

        Perform the replacement and print the result.
        */
        System.out.println("Old string " + abracadabra);
        AbrAcAdAbrA = abracadabra.replace('a', 'A');
        System.out.println("New string " + AbrAcAdAbrA);
    }
}
