package com.kyryllova.homeworks.hw12;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

@Slf4j
@Value
public class Cat {
    Queue<Mouse> stomach = new PriorityBlockingQueue<>(5, Comparator.comparingInt(Mouse::getKilocalories));

    public boolean eat(Mouse mouse) {
        if (stomach.size() < 5) {
            return stomach.offer(mouse);
        } else {
            log.info("Oh no! Stomach is full!");
            return false;
        }
    }

    public Mouse outOfStomach() {
        return stomach.poll();
    }
}
