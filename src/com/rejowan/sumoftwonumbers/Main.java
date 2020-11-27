package com.rejowan.sumoftwonumbers;

import java.util.Scanner;

public class Main {

    // sum of two integer number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Number: \n");

        int a = sc.nextInt();

        System.out.println("Enter 2nd Number: \n");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is " + sum);

    }
}
