package com.kyryllova.homeworks.hw15V2;

import java.util.Random;

public class Computer {
    private int computerChoice;

    public int getComputerChoice() {
        this.computerChoice = GameAction.ROCK + (int) (Math.random() * GameAction.SCISSORS - GameAction.ROCK + 1);
        return this.computerChoice;
    }
}
