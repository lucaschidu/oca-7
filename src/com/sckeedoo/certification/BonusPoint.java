package com.sckeedoo.certification;

public class BonusPoint {

    /**
     *
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 4 == 8 + 0 + 0
     * A super lucky ticket is considered if it's number is a palindrome (google what a palindrome means).
     *
     * Task - Given a ticket number, find out it it's lucky , super lucky or a simple ticket
     *
     * Input :         Output:
     *    012030        lucky
     *    123999        simple ticket
     *    123321        super lucky
     */
    public static void main(String[] args) {
        for (int argi = 0; argi < args.length; argi++) {
            String str = args[argi];
            int diff = 0;
            int numLeft = 0;
            int numRight = 0;
            boolean pal = true;
            if (str.length() % 2 != 0)
                System.out.println("wrong number ticket");
            else {
                int halfLen = str.length() / 2;
                int len = str.length() - 1;
                for (int index = 0; index < halfLen; index++) {
                    numLeft = Integer.valueOf(String.valueOf(str.charAt(index)));
                    numRight = Integer.valueOf(String.valueOf(str.charAt(len - index)));
                    if ((numLeft - numRight) != 0) {
                        pal = false;
                        if (diff < 0)
                            diff += (numLeft - numRight);
                        else
                            diff += numLeft - numRight;
                    }
                }
                if (diff == 0) {
                    if (pal)
                        System.out.println("Super lucky");
                    else
                        System.out.println("Lucky");
                } else
                    System.out.println("Simple ticket");
            }
        }
    }
}
