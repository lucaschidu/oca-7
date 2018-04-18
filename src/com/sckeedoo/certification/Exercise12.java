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

        StringBuilder new_names_string = new StringBuilder();
        StringBuilder rev_string = new StringBuilder();

        for(String single : names.split(",")){
            rev_string.append(single).reverse();
            new_names_string.append(rev_string+", ");
            rev_string.delete(0, single.length());
        }

        System.out.println(new_names_string.toString());
    }
}
