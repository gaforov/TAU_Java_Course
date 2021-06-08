package chapter3;

import java.util.Scanner;

/*
Let's say we have a team of salespeople, all of whom make a standard rate of $1,000 a week.
For any of them who make more than 10 sales that week, they get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String [] args) {
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary += bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
