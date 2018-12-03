package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try {

            double downloadSpeed = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a Download Speed (MB/s)");
            downloadSpeed = Integer.parseInt(scanner.nextLine());
            System.out.println(+downloadSpeed);

            double fileSize = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a fileSize");

            int enterKbMbGb = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter: KB, MB and GB");

            double time = (downloadSpeed)
        } catch () {

        }
    }
}