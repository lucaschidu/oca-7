package com.sckeedoo.certification;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"John", "Steve", "Bob", "Anna", "Diana", "George", "Dodon", "Plahotniuc"};

        /*
         * Use the StringBuilder to join all the array elements into one single string.
         * Elements should be comma separated.
         *
         * Output: "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc"
         * */

        StringBuilder SB = new StringBuilder();
        String sep = ",";
        for (int i = 0; i < names.length; i++) {
            if (i > 0)
                SB.append(sep);
            SB.append(names[i]);
        }

        System.out.println(SB.toString());
    }
}
