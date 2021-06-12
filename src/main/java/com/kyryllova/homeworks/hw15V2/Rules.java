package com.kyryllova.homeworks.hw15V2;

public class Rules {
    public static Result GetResult(int userChoice, int computerChoice) {
        Result result;
        if (userChoice == GameAction.ROCK) {
            result = CheckUserRockInput(computerChoice);
        } else if (userChoice == GameAction.PAPER) {
            result = CheckUserPaperInput(computerChoice);
        } else result = CheckUserScissorsInput(computerChoice);
        return result;
    }

    private static Result CheckUserRockInput(int computerChoice) {
        System.out.println("You chose Rock");
        if (computerChoice == GameAction.ROCK) {
            System.out.println("Computer player chose Rock");
            System.out.println("It's a tie!");
            return Result.TIE;
        } else if (computerChoice == GameAction.PAPER) {
            System.out.println("Computer chose Paper");
            System.out.println("Paper eats Rock. You loose!");
            return Result.LOOSE;
        } else {
            System.out.println("Computer player chose Scissors");
            System.out.println("Rock eats Scissors. You win!");
            return Result.WIN;
        }
    }

    private static Result CheckUserPaperInput(int computerChoice) {
        System.out.println("You chose Paper");
        if (computerChoice == GameAction.ROCK) {
            System.out.println("Computer player chose Rock");
            System.out.println("Paper eats Rock. You win!");
            return Result.WIN;
        } else if (computerChoice == GameAction.PAPER) {
            System.out.println("Computer player chose Paper");
            System.out.println("It's a tie!");
            return Result.TIE;
        } else {
            System.out.println("Computer player chose Scissors");
            System.out.println("Scissors eats Paper. You loose!");
            return Result.LOOSE;
        }
    }

    private static Result CheckUserScissorsInput(int computerAction) {
        System.out.println("You chose Scissors");
        if (computerAction == GameAction.ROCK) {
            System.out.println("Computer player chose Rock");
            System.out.println("Rock eats Scissors. You loose!");
            return Result.LOOSE;
        } else if (computerAction == GameAction.PAPER) {
            System.out.println("Computer player chose Paper");
            System.out.println("Scissors eats Paper. You win!");
            return Result.WIN;
        } else {
            System.out.println("Computer player chose Scissors");
            System.out.println("It's a tie!");
            return Result.TIE;
        }
    }
}
