/*
 * Assignment 1: Introducing the Neuro currency
 * Goal: Learning and using variables and methods.
 * There is a new virtual currency called 'Neuro'. 
 * It only uses the following coins: 1 whole neuro, 49 cents, 9 cents, and 1 cent.
 * Write a program that lets a user enter a double value representing a total in Neuro's.
 * The program should return the optimal amount of each coin (the user gets the minimum amount of coins possible).
 */

import java.util.Scanner;

public class NeuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?: ");
        double userAmount = scanner.nextDouble();
        scanner.close();
        converter(userAmount);
        // System.out.println((int) (0.010000 / 0.01));
    }

    public static void converter(double amount) {
        //Takes a double containing the total amount of Neuro's entered.
        //Calculates the optimal amount of Neurocurrency for the given amount.
        //May not use conditionals or loops yet.
        //Neurocurrency: 1 whole, 49 cents, 9 cents, and 1 cent.

        int intAmount = (int) (amount * 100);
        int remainder;

        int wholeNeuro = (int) intAmount / 100; //Whole Neuro's.
        remainder = intAmount % 100;

        int fortyNineCent = (int) remainder / 49; //Forty nine cents.
        remainder %= 49;

        int nineCent = (int) remainder / 9; //Nine cents.
        remainder %= 9;

        int oneCent = remainder; //One cent.

        System.out.println(wholeNeuro);
        System.out.println(fortyNineCent);
        System.out.println(nineCent);
        System.out.println(oneCent);
    }

}