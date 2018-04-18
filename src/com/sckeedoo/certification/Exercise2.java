package com.sckeedoo.certification;

public class Exercise2 {

    public static void main(String[] args) {
        String str = "abracadabra";

       /* Use JDK documentation for String class and find a method that
        would help you determine all the indexes of the letter 'a' in abracadabra.
        Output: Print all letter 'a' indexes on a separate line.
        */
        int index=0, offset=0;
        while( index != -1){
            index = str.indexOf('a', offset);
//            offset = index > offset ? index : ++offset;
            if(index > offset){
                System.out.println(index);
                offset = index;
            }else{
                if(index == 0 ) System.out.println(index);
                ++offset;
            }
        }
    }
}
