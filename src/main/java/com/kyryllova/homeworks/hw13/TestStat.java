package com.kyryllova.homeworks.hw13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStat {
    private Integer[] intData;
    private Double[] doubleData;

    @BeforeEach
    public void settingValue() {
        intData = new Integer[]{1, 8, 16, 33, 2};
        doubleData = new Double[]{1.0, 8.0, 16.0, 33.0};
    }

    @Test
    void printData() {
        new Stat<>(intData).printData();
        new Stat<>(doubleData).printData();
    }

    @Test
    void average() {
        assertEquals(12, new Stat<>(intData).average());
        assertEquals(14.5, new Stat<>(doubleData).average());
    }

    @Test
    void isSameAverage() {
        Stat<Integer> integerStat = new Stat<>(intData);
    }

}
