package chapter8;

import java.util.Scanner;

public class ConvertDecimalNumbers {
//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numbers = {10.1,11.7, 100.20, 99.5};

        for (Double number:numbers){
            System.out.print(number.intValue() + " ");
        }

        String[] split = "avacado".split("a");
        for (String name:split){
            System.out.print(name + "|");
        }
    }

//    public static int[] totalInputNumbers(){
//
//        System.out.println("How many decimal numbers you want to enter:");
//        int[] decimalNumbers = new int[scanner.nextInt()];
//        for (int i=0; i<decimalNumbers.length; i++){
//            System.out.println("Decimal #" + decimalNumbers[i+1]);
//        }
//        return decimalNumbers;
//    }
//
//    public static void convertDecimalToInt(double[] numbers){
//        System.out.println("Enter decimal numbers:");
//        numbers = new double[scanner.nextInt()];
//        for (Double number:numbers){
//            System.out.println(number.intValue());
//        }
//    }

}
