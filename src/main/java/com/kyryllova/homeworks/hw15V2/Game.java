package com.kyryllova.homeworks.hw15V2;

import java.util.Scanner;

class Game {
    public static Scanner scanner = new Scanner(System.in);
    static int win = 0;
    static int loose = 0;
    static int tie = 0;

    public static void main(String[] args) {
        System.out.println("Hello! The Game \"RockPaperScissors\" starting...");

        User user = new User();
        Computer computer = new Computer();

        user.GetUserName();
        int count = user.GetUsersGameCount();

        for (int i = 0; i < count; i++) {
            PrintGameInfo();
            int userChoice = user.GetUserChoice();

            if (userChoice == -1) {
                System.out.println("Game over!");
                PrintResultGame();
                return;
            }

            int computerChoice = computer.getComputerChoice();
            Result result = Rules.GetResult(userChoice, computerChoice);
            CheckResultGame(result);
        }
        PrintResultGame();
    }

    private static String PrintGameInfo() {
        System.out.println("Choose the corresponding number: ");
        System.out.println("Rock : 1");
        System.out.println("Paper : 2");
        System.out.println("Scissors : 3");
        System.out.println("If you chose \"-1\" ,your game will be over!");
        return null;
    }

    private static void CheckResultGame(Result result) {
        if (result == Result.WIN) {
            win++;
        } else if (result == Result.LOOSE) {
            loose++;
        } else tie++;
    }

    private static void PrintResultGame() {
        System.out.println("You won : " + win);
        System.out.println("You lose : " + loose);
        System.out.println("Tie is : " + tie);
    }

}

