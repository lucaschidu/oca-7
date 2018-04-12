package com.sckeedoo.certification;

public class Exercise9 {

    public static void checkName(String names, String checkName){
        if (names.indexOf(checkName) > 0)
            System.out.println(checkName.concat(" is a port of the names variable"));
        else
            System.out.println(checkName.concat(" is not a part of the names variable"));
    }

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.

            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */
           String maria = "Maria";
           String steve = "Steve";
           checkName(names, maria);
           checkName(names, steve);
    }
}
