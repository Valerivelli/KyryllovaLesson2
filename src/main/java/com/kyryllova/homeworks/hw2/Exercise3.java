package com.kyryllova.homeworks.hw2;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;

public class Exercise3 {
    static void findRoots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Try again!");
            return;
        }
        int x = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(x));

        double root1 = 0;
        double root2 = 0;

        if (x > 0) {
            root1 =  (-b + sqrt_val) / (2 * a);
            root2 = (-b - sqrt_val) / (2 * a);
        }
        else if (x == 0) {
            root1 = -(double) b / (2 * a);
            root2 = -(double) b / (2 * a);
        }
        else {
            root1 = -(double) b / (2 * a) + sqrt_val;
            root2 = -(double) b / (2 * a) + sqrt_val;
        }
        if(root1 > root2){
            System.out.println(root2 + "\n" + root1);
        }
        else {
            System.out.println(root1 + "\n" + root2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        findRoots(a, b, c);
    }
}
