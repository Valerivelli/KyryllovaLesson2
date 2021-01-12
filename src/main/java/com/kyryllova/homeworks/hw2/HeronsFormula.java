package com.kyryllova.homeworks.hw2;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int p = (a + b + c)/2;

        System.out.println("S = " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));

    }
}
