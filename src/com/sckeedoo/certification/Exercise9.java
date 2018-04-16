package com.sckeedoo.certification;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.

            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */
        System.out.println("'Maria" + (names.contains("Maria")?" is part of the names variable'":" is not part of the names variable'"));
        System.out.println("'Steve" + (names.contains("Steve")?" is part of the names variable'":" is not part of the names variable'"));
    }
}
