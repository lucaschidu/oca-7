package com.sckeedoo.certification;

public class Exercise12 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
        StringBuilder sbName = new StringBuilder(); 
        int inc = 0;

       /*
       * Use JDK documentation for StringBuilder class and find the method that
       * would help you print the string in reverse order.
       * Output: "nhoJ,evetS,boB,annA,anaiD,egroeG,nodoD,cuintohalP"
       * */
        String [] arrayNames = names.split(",");
        for (String string : arrayNames) {
        	 StringBuilder temp = new StringBuilder(string);
        	 sbName.append(temp.reverse());
        	 if(inc < arrayNames.length-1) {
        		 sbName.append(",");
        	}
        	 inc++;
		}
       
       System.out.println(sbName);
    }
}
