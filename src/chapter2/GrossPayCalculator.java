package chapter2;

import java.util.Scanner;

/**
 * CALCULATE AN EMPLOYEE'S GROSS PAY
 * 1.Get the number of hours worked
 * 2.Get the hourly pay rate
 * 3.Multiply hours and pay rate
 * 4.Display result
 */
public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate");
        double payRate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * payRate;

        System.out.println("The employee's gross pay is " + grossPay);
    }

}
