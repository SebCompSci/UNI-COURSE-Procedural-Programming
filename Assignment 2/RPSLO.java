/*
 * Assignment 2: Rock Paper Scissors Lizard Spock.
 * Goal: Learning and using conditionals.
 * Develop a program that lets the user play RPSLO against the computer (without using loops yet).
 * The rules are:
 *      Scissors cut Paper
 *      Paper covers Rock
 *      Rock crushes Lizard
 *      Lizard poisons Spock
 *      Spock smashes Scissors
 *      Scissors decapitate Lizard
 *      Lizard eats Paper
 *      Paper disproves Spock
 *      Spock vaporizes Rock
 *      Rock crushes Scissors
 * The program should ask the user to enter a play, and generate a random play for the computer, compare the two and announce a winner.
 */

import java.util.Scanner;
import java.util.Random;

public class RPSLO {
    public static void main(String[] args) {
        System.out.println("Enter your play: R, P, S, L, O");
        Scanner scanner = new Scanner(System.in);
        String userPlay = scanner.nextLine().toUpperCase();
        scanner.close();
        game(userPlay);
    }

    public static void game(String userPlay) {
        //Takes a String containing the letter of the user's play.
        //Generates a random play for the computer.
        //Compares the userPlay with the computerPlay and announces a winner.

        Random rand = new Random();
        int computerRandInt = rand.nextInt(5);
        String[] possiblePlays = {"R", "P", "S", "L", "O"};
        String computerPlay = possiblePlays[computerRandInt]; //CPU chooses random letter.
        System.out.println("Computer play is " + computerPlay);

        switch (userPlay) {
            case "R":
                switch (computerPlay) {
                    case "P":
                    case "O":
                        System.out.println("Computer wins!");
                        break;
                    case "S":
                    case "L":
                        System.out.println("You win!");
                        break;
                    default:
                        System.out.println("It is a tie!");
                        break;
                }
                break;

            case "P":
                switch (computerPlay) {
                    case "S":
                    case "L":
                        System.out.println("Computer wins!");
                        break;
                    case "R":
                    case "O":
                        System.out.println("You win!");
                        break;
                    default:
                        System.out.println("It is a tie!");
                        break;
                }
                break;

            case "S":
                switch (computerPlay) {
                    case "R":
                    case "O":
                        System.out.println("Computer wins!");
                        break;
                    case "P":
                    case "L":
                        System.out.println("You win!");
                        break;
                    default:
                        System.out.println("It is a tie!");
                        break;
                }
                break;
        
            case "L":
                switch (computerPlay) {
                    case "R":
                    case "S":
                        System.out.println("Computer wins!");
                        break;
                    case "O":
                    case "P":
                        System.out.println("You win!");
                        break;
                    default:
                        System.out.println("It is a tie!");
                        break;
                }
                break; 
                
            case "O":
                switch (computerPlay) {
                    case "L":
                    case "P":
                        System.out.println("Computer wins!");
                        break;
                    case "R":
                    case "S":
                        System.out.println("You win!");
                        break;
                    default:
                        System.out.println("It is a tie!");
                        break;
                }
                break;

            default:
                System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
                break;
        }
    }
}
