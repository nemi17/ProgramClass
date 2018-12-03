package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        try {
            double input1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double input2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double input3 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double input4 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a number");

            double total = input1 + input2 + input3 + input4;
            System.out.println("Your total is: " + total);

        } catch (NumberFormatException ex) {
            System.out.println(ex + "is not an input");
            return;
        }

    }
}