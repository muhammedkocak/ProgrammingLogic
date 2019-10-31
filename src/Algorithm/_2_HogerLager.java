package Algorithm; //Package name

import java.util.Random;
import java.util.Scanner;

public class _2_HogerLager {  //Class name
    public static void main(String[] args) { // Main method line

        var keyboard = new Scanner(System.in); //Scanning from the keyboard/input
        var rand = new Random(); //Variable named rand, that make possible to choose random value
        var numberToGuess = rand.nextInt(100); //Variable named numberToGuess with an random value till 100

        System.out.println("Enter a number:"); //Prints out between de "  "
        var guessed = false; //Variable named guessed, is set to false (boolean value by default is TRUE)

        while (!guessed) {  //While loop -- as long as guessed is false is repeats a block of code below

            var guess = keyboard.nextInt(); //Declaring variable guess, and the value is linked to the keyboard/input
            if (guess < numberToGuess) { //IF the value of guess lower than numberToGuess than execute the code below
                System.out.println("Higher!!!");  //Prints out between de "  "
            } else if (guess > numberToGuess) { // (OR) ELSE IF the value of guess higher than numberToGuess than execute the code below
                System.out.println("Lower!!!"); //Prints out between de "  "
            } else { // In all other situations/cases (Than IF or ELSE IF statement)
                System.out.println("!!!Guessed!!!"); //Prints out between de "  "
                guessed = true; //Variable named guessed is set to True, to stop the WHILE loop
            }
        }

        keyboard.close(); //Stops scanning from keyboard/input
    }
}