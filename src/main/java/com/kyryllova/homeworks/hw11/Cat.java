package com.kyryllova.homeworks.hw11;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

@Slf4j
public class Cat {
    ArrayDeque<Mouse> stomach = new ArrayDeque<>();
    HashSet<Integer> poop;

    int maxSize = 5;

    public void eat(Mouse mouse) {
        if (stomach.size() < maxSize) {
            stomach.push(mouse);
        } else {
            log.info("Oh no! Stomach is full!");
        }
    }

    public Mouse outOfStomach() {
        return stomach.removeLast();
    }

    public ArrayDeque<Mouse> clearStomach() {
        ArrayDeque<Mouse> mice = stomach.clone();
        stomach.clear();
        ArrayList<Integer> list = new ArrayList<>();

        for (Mouse item : mice) {
            list.add(item.getKilocalories());
        }
        poop = new HashSet<>(list);
        return mice;
    }

    public boolean findMouseByCalories(ArrayDeque<Mouse> mice, int kilocalories) {
        return poop.contains(kilocalories);
    }
}
