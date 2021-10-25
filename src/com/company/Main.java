package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void z1() {
        System.out.print("Please enter circle radius: ");
        double rad = input.nextDouble();
        System.out.println("\nThe circle's radius is " + Math.pow(rad, 2) * Math.PI);
    }

    public static void z2() {
        System.out.print("Please enter the first number: ");
        double a = input.nextDouble();
        System.out.print("\nPlease enter the second number: ");
        double b = input.nextDouble();

        System.out.println(a + "/" + b + " equals " + (a / b));
    }

    public static void z3() {
        System.out.println("Ile masz lat?");
        int wiek = input.nextInt();
        if (wiek < 18) {
            System.out.println("nie możesz głosować");
        } else if (wiek >= 18 && wiek < 35) {
            System.out.println("możesz głosować, ale nie możesz zostać wybranym na prezydenta");
        } else {
            System.out.println("możesz kandydować na prezydenta państwa");
        }
    }

    public static void z4() {
        int tmp;
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\nEnter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i;
            while (j >= 0 && numbers[j] > numbers[j + 1]) {
                tmp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = tmp;
                j--;
            }
        }

        System.out.print("\nThe numbers provided in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void z5() {
        double tmp;
        double[] numbers = new double[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\nEnter length of side " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i;
            while (j >= 0 && numbers[j] > numbers[j + 1]) {
                tmp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = tmp;
                j--;
            }
        }

        if (numbers[0] + numbers[1] < numbers[2]) {
            System.out.println("\nThe triangle can be created.");
        } else {
            System.out.println("\nThe triangle can not be created.");
        }

    }

    public static void z6() {
        double tmp;
        double[] numbers = new double[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\nEnter length of side " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i;
            while (j >= 0 && numbers[j] > numbers[j + 1]) {
                tmp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = tmp;
                j--;
            }
        }

        if (Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2) == Math.pow(numbers[2], 2)) {
            System.out.println("\nThe right triangle can be created.");
        } else {
            System.out.println("\nThe right triangle can not be created.");
        }
    }

    public static void z7() {
        System.out.print("The equation is ax^2 + bx + c.\nPlease enter a: ");
        double a = input.nextDouble();
        System.out.print("Please enter b: ");
        double b = input.nextDouble();
        System.out.print("Please enter c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (a == 0) {
            System.out.println("\nThe equation is linear with one root at " + (-c));
        }else if (delta < 0) {
            System.out.println("\nThe equation has no roots.");
        } else if (delta == 0) {
            System.out.println("\nThe equation has one root at x = " + ((-b) / (2 * a)));
        } else if (delta > 0) {
            System.out.println("\nThe equation has two roots at x1 = " + ((Math.sqrt(delta) - b) / (2 * a)) + " and x2 = " + ((-Math.sqrt(delta) - b) / (2 * a)));
        }

    }

    public static void main(String[] args) {
        z1();
        z2();
        z3();
        z4();
        z5();
        z6();
        z7();
    }
}
