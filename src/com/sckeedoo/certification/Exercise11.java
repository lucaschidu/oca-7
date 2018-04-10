package com.sckeedoo.certification;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"John", "Steve","Bob", "Anna", "Diana", "George", "Dodon", "Plahotniuc"};
        int count = 0;
        StringBuilder sbNames = new StringBuilder();
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
		System.out.println(sbNames);
    }
}
