package com.kyryllova.homeworks.hw12;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

@Slf4j
@Value
public class Cat {
    Queue<Mouse> stomach = new PriorityBlockingQueue<>(5, Comparator.comparingInt(Mouse::getKilocalories));

    int maxSize = 5;

    public boolean eat(Mouse mouse) {
        boolean flag = true;
        if (stomach.size() < maxSize) {
            stomach.offer(mouse);
        } else {
            flag = false;
            log.info("Oh no! Stomach is full!");
        }
        return flag;
    }

    public Mouse outOfStomach() {
        return stomach.poll();
    }
}
