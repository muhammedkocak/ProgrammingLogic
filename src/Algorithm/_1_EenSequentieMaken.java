package Algorithm; //Package name

import java.util.Scanner;

public class _1_EenSequentieMaken { //Class name
    public static void main(String[] args) { // Main method line

        var keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Enter a number please:"); //Prints out between de "  "
        var a = keyboard.nextInt(); //Declaring (var) variable a, and the value is linked to the keyboard/input

        System.out.println("Enter another number please:"); //Prints out between de "  "
        var b = keyboard.nextInt(); //Declaring (var) variable b, and the value is linked to the keyboard/input

        var sum = a + b; //Declaring (var) variable sum, and the value is variable a + b

        System.out.println("The sum is = " + sum); //Prints out between de "  " and the variable sum

        keyboard.close(); //Stops scanning from keyboard/input


    }
}
