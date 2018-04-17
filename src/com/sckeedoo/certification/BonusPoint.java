package com.sckeedoo.certification;

import java.util.Scanner;

public class BonusPoint {

    /**
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 4 == 8 + 0 + 0
     * A super lucky ticket is considered if it's number is a palindrome (google what a palindrome means).
     * <p>
     * Task - Given a ticket number, find out it it's lucky , super lucky or a simple ticket
     * <p>
     * Input :         Output:
     * 012030        lucky
     * 123999        simple ticket
     * 123321        super lucky
     */
    public static void main(String[] args) {


        boolean flag = true; //palindrome or not
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter ticket number.");

        String TNumber = reader.nextLine();
        int index = 0;
        StringBuilder first = new StringBuilder(TNumber.substring(0, 3));
        StringBuilder second = new StringBuilder(TNumber.substring(3, 6));


        for (int i = 0; i < TNumber.length() / 2; i++) {
            index = TNumber.length() - i - 1;
            if (!(TNumber.charAt(i) == TNumber.charAt(index))) {
                flag = false;
            }
        }

        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < first.length(); i++) {
            suma1 += Character.getNumericValue(first.charAt(i));
        }

        for (int i = 0; i < second.length(); i++) {
            suma2 += Character.getNumericValue(second.charAt(i));

        }
        boolean sum = (suma1 == suma2);

        if (sum) {
            if (flag) {

                System.out.println(" super lucky");
            } else

                System.out.println("lucky");
        } else

            System.out.println("simple ticket");
    }
}






