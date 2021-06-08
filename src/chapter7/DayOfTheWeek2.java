package chapter7;
/*
DAY OF THE WEEK
Make an array tha tholds the textual values of the days of the week. Have the user input a number
corresponding to the day of the week. Assume the week starts on Monday. Your program should output
the String that represents the day of the week. Example: user enters 1 and program returns "Monday".
 */
import java.util.Scanner;

public class DayOfTheWeek2 {

    public static void main(String[] args) {
        String [] week = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the week:");
        int weekNumber = input.nextInt();

        if (weekNumber>0 && weekNumber<=7){
            System.out.println("Corresponding day of the week for entered number is: " + week[weekNumber-1]);
        }else {
            do {
                System.out.println("Invalid entry. Please enter a number between 1 and 7.");
                weekNumber = input.nextInt();
            }while (!(weekNumber>0 && weekNumber<=7));
            System.out.println("Corresponding day of the week for entered number is: " + week[weekNumber-1]);
            input.close();
        }

    }
}
