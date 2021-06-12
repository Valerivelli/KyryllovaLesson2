package com.kyryllova.homeworks.hw15V2;

import java.util.Scanner;

public class User {
    private int userChoice;
    private String userName;
    private int userGameCount;

    public void GetUserName() {
        System.out.println("Please enter your name: ");
        this.userName = Game.scanner.nextLine();
    }

    public int GetUsersGameCount() {
        System.out.println("How much games you want to play?");
        this.userGameCount = Game.scanner.nextInt();
        return this.userGameCount;
    }

    public int GetUserChoice() {
        do {
            this.userChoice = Game.scanner.nextInt();
            if (this.userChoice >= -1 && this.userChoice <= 3) {
                break;
            }
            System.out.println("Choose correct value!");
        }
        while (true);
        return this.userChoice;
    }
}
