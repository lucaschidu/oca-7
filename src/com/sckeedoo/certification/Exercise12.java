package com.sckeedoo.certification;

import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

        /*
         * Use JDK documentation for StringBuilder class and find the method that
         * would help you print the string in reverse order.
         * Output: "nhoJ,evetS,boB,annA,anaiD,egroeG,nodoD,cuintohalP"
         * */


        StringBuilder SB = new StringBuilder();
        String array[] = names.split(",");
        String sep = ",";
        for (int i = 0; i < array.length; i++) {
            if (i > 0)

                SB.append(sep);
            SB.append(array[i]);

        }

        System.out.println(SB.reverse());

    }
}
