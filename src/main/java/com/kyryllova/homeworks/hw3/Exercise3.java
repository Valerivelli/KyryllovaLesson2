package com.kyryllova.homeworks.hw3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = GetAge();
        String result = DescribeAge(age);
        PrintResult(result);
    }

    private static int GetAge() {
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            age = scanner.nextInt();
        }
        while (age <= 0);
        return age;
    }

    private static String DescribeAge(int age) {
        if (age <= 12) {
            return "You're a(n) kid";
        } else if (age >= 13 && age <= 17) {
            return "You're a(n) teenager";
        } else if (age >= 18 && age <= 64) {
            return "You're a(n) adult";
        } else return "You're a(n) elderly";
    }

    private static void PrintResult(String result) {
        System.out.println(result);
    }
}
