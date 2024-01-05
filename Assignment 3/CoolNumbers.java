/*
 * Assignment 3: Cool Numbers.
 * Goal: Learning and using loops.
 * The program should read 3 integers (a, b, and n), given 'n', the program will count all possible 'cool' numbers between 'a' and 'b'.
 * Given a (non-zero) positive integer 'n' a number is considered 'cool' if 'n' is divisible by each of the number's digit without remainder.
 */

public class CoolNumbers {


    public static boolean isCool(int a, int n) {
        //Takes int a and int n.
        //'a' is considered a cool number if 'n' is divisable by every digit of 'a' without remainder.
        //Returns a boolean (remainder), true if a is cool number, and false when not. 

        String aStr = Integer.toString(a);
        boolean noRemainder = true;
        for (int i = 0; i < aStr.length(); i++) {
            int aChar = Character.getNumericValue(aStr.charAt(i)); //Iterates over digits of 'a'.
            if(noRemainder == true) {
                if (aChar == 0){
                    noRemainder = false;
                } else if ((n % aChar) != 0) {
                    noRemainder = false;
                }
            }
        }
        return noRemainder;
    }


    public static int countCools(int n, int a, int b) {
        //Takes int n, int a, and int b.
        //Counts how many cool number exist for 'n' between 'a' and 'b'.
        //Uses 'isCool' method to check if the number is a cool number.

        int coolCount = 0;
        for (int i = a; i <= b; i++) {
            if (isCool(i, n) == true) {
                coolCount ++;
            }
        }
        return coolCount;
    }
}
