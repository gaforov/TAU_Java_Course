package chapter2;

import java.util.Scanner;

/**
 * Exercise: Create a program that asks a user for a season of the year, then a whole number,
 * then an adjective. And use the input to complete the sentence below then output the result.
 * Example: "On a [adjective] [season of the year] day, I drink a minimum of [whole number]
 * cups of coffee."
 */
public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season of the year:");
        String season = scanner.next();
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        System.out.println("On a " +adjective+ " "+season+ " day, I drink a minimum of "+number+ " cups of coffee." );

    }
}
