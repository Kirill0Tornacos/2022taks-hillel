package com.hillel.homeworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;

        for (int i = 0; i < result; i++) {
            System.out.println("1");
        }
        System.out.println("Do you want to continue or stop? press 1 - continue, press 2 - stop");
        int num1 = scanner.nextInt();
        int num2 = 1;
        if (num1 == num2) {
            System.out.println("Input number:");
        } else {
            System.out.println("Your program has stopped");
        }

    }
}
