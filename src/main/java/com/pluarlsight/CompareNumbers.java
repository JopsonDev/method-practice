package com.pluarlsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please provide number: ");
        int number = myScanner.nextInt();

        String evenNumber = "Even: " + isEven(number);
        System.out.println(evenNumber);
        
        String positiveNumber = "Positive: " + isPositive(number);
        System.out.println(positiveNumber);
    }
    public static boolean isEven(int number) {
       boolean even = number % 2 == 0;
       return even;
    }
    public  static boolean isPositive(double number) {
        boolean positive = number > 0;
        return positive;
    }
}
