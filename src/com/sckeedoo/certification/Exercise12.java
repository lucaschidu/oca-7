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
       String[] strArray = names.split(",");
       StringBuilder sb = new StringBuilder();
       for (int index = 0; index < strArray.length; index++){
           if (index > 0)
               sb.append(',');
           for (int indW = strArray[index].length() - 1; indW >= 0; indW--){
               sb.append(strArray[index].charAt(indW));
           }
       }
        System.out.println(sb);
    }
}
