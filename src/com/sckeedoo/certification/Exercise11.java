package com.sckeedoo.certification;

import java.util.Arrays;
import java.util.Iterator;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"John", "Steve","Bob", "Anna", "Diana", "George", "Dodon", "Plahotniuc"};
        int count = 0;
        StringBuilder sbNames = new StringBuilder();
        StringBuilder sbNamesI = new StringBuilder();
       /*
       * Use the StringBuilder to join all the array elements into one single string.
       * Elements should be comma separated.
       *
       * Output: "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc"
       * 
       * */
        sbNames.append('"');
		for (String string : names) {
				sbNames.append(string);
			if (count == names.length-1) 
				break;
				sbNames.append(',');
				count++;
		}
		sbNames.append('"');
		System.out.println("Append from array of strings using foreach.");
		System.out.println(sbNames);
		
		Iterator<String> iNames = Arrays.asList(names).iterator();

        while(iNames.hasNext()) {
        	sbNamesI.append(iNames.next());
        	if(iNames.hasNext()) {
        		sbNamesI.append(",");
        	}
        }
        System.out.println("Append using arrays and iterator.");
		System.out.println('"'+sbNamesI.toString()+'"');
    }
}
