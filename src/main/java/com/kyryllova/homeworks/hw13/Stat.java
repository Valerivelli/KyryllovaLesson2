package com.kyryllova.homeworks.hw13;

import java.util.Arrays;

public class Stat<T extends Number> {
    private T[] data;

    public Stat(T[] data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public double average() {
        double average = 0;
        for (T dataItem : data) {
            average += dataItem.doubleValue();
        }
        return average / data.length;
    }

    public boolean isSameAverage(Stat<?> stat) {
        return this.average() == stat.average();
    }
}
