//Create a simple number guessing game, that takes in some user input matches it to a 'secret' number.

package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//      Prompt user to 'What is the secret number? Take a guess...'
        System.out.println("What is the secret number? Take your guess...");

//      Collect user input. It must be a number.
        Scanner reader = new Scanner(System.in);
        String guessedNumberString = reader.nextLine();
        int guessedNumber = Integer.valueOf(guessedNumberString);
//      FUTURE TIPS: consider using Integer over int
        //       QUESTION: If the user inputs a decimal rather than a whole number, how would I convert it into a whole number?
//      import math module and use Math.round(guessedNumber)

//      If the number is the correct number return 'Bingo!' If the number is incorrect return 'Not quite...'
//      If the number is less than the secret number, return 'Higher'. If it is greater, return 'Lower'
        if (guessedNumber == 85) {
            System.out.println("Bingo!");
        } else if (guessedNumber < 85) {
            System.out.println("Not quite. Take a higher guess.");
        } else if (guessedNumber > 85) {
            System.out.println("Not quite. Take a lower guess.");
        }
    }
}