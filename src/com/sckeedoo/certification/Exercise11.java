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
       StringBuilder new_names_string = new StringBuilder();

       for(String single : names){
           new_names_string.append(single+", ");
       }

        System.out.println(new_names_string.toString());
    }
}
