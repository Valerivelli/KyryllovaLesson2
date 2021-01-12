package com.kyryllova.homeworks.hw2;

import java.util.Scanner;

public class Logarithms {
    public static void main(String[] args) {
        //Using following make a program to calculate logarithm of b with the base of a
        //loga b = log10 b / log10 a

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("loga b = " + Math.log(b)/ Math.log(a));


    }
}
