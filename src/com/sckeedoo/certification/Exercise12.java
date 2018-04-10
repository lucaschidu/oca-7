package com.sckeedoo.certification;

public class Exercise12 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /*
       * Use JDK documentation for StringBuilder class and find the method that
       * would help you print the string in reverse order.
       * Output: "nhoJ,evetS,boB,annA,anaiD,egroeG,nodoD,cuintohalP"
       * */
       StringBuilder sbName = new StringBuilder(names);
       System.out.println(sbName.reverse());
    }
}
