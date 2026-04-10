package com.pluarlsight;

import java.util.Locale;
import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String first = myScanner.nextLine();
        System.out.print("Last Name: ");
        String last = myScanner.nextLine();

        String fullname = formatName(first, last);
        System.out.println(fullname);


    }
    public static String formatName(String first, String last) {
        return last + ", " + first;


    }
}
