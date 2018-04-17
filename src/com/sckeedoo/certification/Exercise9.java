package com.sckeedoo.certification;
import java.io.*;
public class Exercise9 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.

            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */
     if (names.contains("Steve") == true){
         System.out.println("Steve is part of the names variable");}
         else
             System.out.println("Steve is Not part of the names variable");

        if (names.contains("Maria") == true){
            System.out.println("Maria is part of the names variable");}
        else
            System.out.println("Maria is Not part of the names variable");
    }
}
