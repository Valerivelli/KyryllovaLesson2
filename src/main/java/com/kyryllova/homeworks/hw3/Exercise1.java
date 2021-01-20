package com.kyryllova.homeworks.hw3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double weight = GetWeight();
        double height = GetHeight();
        double bmi = CalculateBMI(weight, height);
        String result = FindSuitableType(bmi);
        PrintResult(result);
    }

    private static double GetWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in kilogram: ");
        return scanner.nextDouble();
    }

    private static double GetHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height in metres: ");
        return scanner.nextDouble();
    }

    private static double CalculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String FindSuitableType(double bmi) {
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi > 18.5 && bmi <= 25.0) {
            return "Normal";
        } else if (bmi > 25.0 && bmi <= 30.0) {
            return "Overweight";
        } else
            return "Obese";
    }

    private static void PrintResult(String result) {
        System.out.println(result);
    }
}


