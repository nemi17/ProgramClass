package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        try {
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double num2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double num3 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double num4 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double total = num1 + num2 + num3 + num4;
            System.out.println("Your total is: " + total);
        } catch (NumberFormatException ex) {
            System.out.println("Is not a number.");
        }
    }
}