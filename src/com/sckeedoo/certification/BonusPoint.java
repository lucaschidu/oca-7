package com.sckeedoo.certification;

public class BonusPoint {

    /**
     *
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 5 == 8 + 0 + 0
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
        int ticket = 123320;
        int length = String.valueOf(ticket).length();
        int array_length = length-1;
        int[] digits = new int[length];
        int n = 0;

        while(ticket != 0) {
            digits[array_length-n] = ticket%10;
            ticket /= 10;
            n++;
        }

        showResult(array_length, digits);

    }

    public static int[] checkDigits(int array_length, int[] digits){
        int sum1 = 0, sum2 = 0;
        int palindrome = 1;
        for(int i=0; i<=array_length/2; i++){
             sum1 = sum1 + digits[i];
             sum2 = sum2 + digits[array_length-i];
             if(palindrome == 1){
                 palindrome = digits[i] == digits[array_length-i] ? 1:0;
             }
        }
        int sum_result = sum1 == sum2 ? 1 : 0;

        int[] result = {sum_result, palindrome};
        return  result;
    }

    public static void showResult(int array_length, int[] digits){
        int[] result = checkDigits(array_length, digits);
        if(result[0] == 1){
            if(result[1] ==1 )
                System.out.println("You got super lucky ticket");
            else
                System.out.println("You got lucky ticket");
        }else {
            System.out.println("You get simple ticket");
        }
    }
}
