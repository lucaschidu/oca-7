package com.sckeedoo.certification;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"John", "Steve","Bob", "Anna", "Diana", "George", "Dodon", "Plahotniuc"};

       /*
       * Use the StringBuilder to join all the array elements into one single string.
       * Elements should be comma separated.
       *
       * Output: "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc"
       * */
       StringBuilder sb = new StringBuilder();
       for (int index = 0; index < names.length; index++){
           if (index > 0)
               sb.append(',');
           sb.append(names[index]);

       }
        System.out.println(sb);
    }
}
