package chapter5;

import java.util.Scanner;

/*
 * PHONE BILL CALCULATOR
 * Calculate the final total of someone's cell phone bill. Allow the operator to input the plan fee
 * and the number of average minutes. Charge the user 0.25 for every minute they were over their plan,
 * and 15% tax on the subtotal. Create a separate methods to calculate the tax, overage fees,
 * and final total. Print the itemized bill.
 *
 * Example Output:
 * Enter base cost of the plan:
 * 82.45
 * Enter overage minutes:
 * 9
 * Phone Bill Statement
 * Plan: $82.45
 * Overage: $2.25
 * Tax: $12.71
 * Total: $97.41
 */
public class PhoneBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double plan = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        double overageCharge = calculateOverageMinutes(overageMinutes);
        double tax = calculateTax(plan + overageCharge);

        calculateTotalandPrint(plan,overageCharge,tax);

    }

    public static double calculateOverageMinutes(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double plan){
        double rate = 0.15;
        double tax = plan * rate;
        return tax;
    }

    public static void calculateTotalandPrint(double base, double overage, double tax){
        double total = base + overage + tax;

        System.out.println("Phone bill statement:");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage Fees: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}
