package com.kyryllova.homeworks.hw3;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        double hour = GetUserInput();
        int result = CalculateWaterAmount(hour);
        PrintResult(result);

    }

    private static double GetUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hours: ");
        return scanner.nextDouble();
    }

    private static int CalculateWaterAmount(double hour) {
        final double coef = 0.5;
        return (int) Math.floor(hour * coef);
    }

    private static void PrintResult(int result) {
        System.out.println(result);
    }
}
