/*
 * Christopher Watson
 *
 * GuessNumber.java
 *
 */
import java.util.Scanner;

public class GuessNumber {

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        int correctNum = (int) (Math.random() * 100);
        int guessCount = 15;
        boolean keepGoing = true;
        System.out.println("Guess the value of a number between 1 and 100\n");
        while (keepGoing) {

            if (guessCount == 0) {
                System.out.println("\nSorry, you took too many guesses, so I've changed my number.\n");
                guessCount = 15;
                correctNum = (int) (Math.random() * 100);
                System.out.println("Guess the value of a number between 1 and 100\n");
                continue;
            }

            System.out.print(guessCount + " guess(es) remaining. Enter your guess (-1 to quit): \n");

            int userGuess = input.nextInt();
            if (userGuess == -1) {
                break;
            }
            if (userGuess == correctNum) {
                System.out.println ("Correct! ");
                break;
            }
            int diff = (correctNum - userGuess);

            if (Math.abs(diff) <=5) {
                System.out.println("\nHot\n");
            }
            else if (Math.abs(diff) <=10) {
                System.out.println("\nVery Warm\n");
            }
            else if (Math.abs(diff) <=20) {
                System.out.println("\nWarm\n");
            }
            else if (Math.abs(diff) <=40) {
                System.out.println("\nLukewarm\n");
            }
            else {
                System.out.println("\nCold\n");
            }

            guessCount -= 1;

        } //end while
    } //end main
} //end class


