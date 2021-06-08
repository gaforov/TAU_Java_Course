package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar!' \n " +
                "Your goal is to enter enough change to make exactly $1.00 USD");

        System.out.println("Enter your number of pennies:");
        int pennies = scanner.nextInt();
        System.out.println("Enter your number of nickels:");
        int nickels = scanner.nextInt();
        System.out.println("Enter your number of dimes:");
        int dimes = scanner.nextInt();
        System.out.println("Enter your number of quarters:");
        int quarters = scanner.nextInt();

        double total = pennies * penny + nickels * nickel + dimes * dime + quarters * quarter;

        if (total < dollar) {
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short by " + String.format("%.2f",amountShort) + " cents");
        }else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over by " + String.format("%.2f",amountOver) + " cents");
        }else
            System.out.println("Yay! You won! You got exactly $1.00");
    }
}
