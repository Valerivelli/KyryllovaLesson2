package com.kyryllova.homeworks.hw3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int year = InputCentury();
        int century = CalculateCenturyFromYear(year);
        PrintResult(century, year);

    }

    private static int InputCentury() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        return scanner.nextInt();
    }

    private static int CalculateCenturyFromYear(int year) {
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }
        return century;
    }

    private static void PrintResult(int century, int year) {
        System.out.println("Century From Year " + year + " is " + century);
    }
}
