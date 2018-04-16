package com.sckeedoo.certification;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.

            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your criteria in next string: ");
        String criteria = input.nextLine();
//        int result = names.indexOf(criteria);

        boolean result = false;
        String[] all_names = names.split(",");
        for (String single_name : all_names) {
            if (criteria.contains(single_name)) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        if (result) {
            System.out.println(criteria + " is part of the names variable");

        } else {
            System.out.println(criteria + " is not part of the names variable");
        }


    }
}
