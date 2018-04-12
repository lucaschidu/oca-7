package com.sckeedoo.certification;

public class Exercise5 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /* Use JDK documentation for String class and find a method that
        would help you split the names string by ',' and get as a result an array.

        Print every name on a separate line.
        */
       String[] strArray = names.split(",");
        for(int index = 0; index<strArray.length; index++){
            System.out.println(strArray[index].toString());
        }
    }
}
