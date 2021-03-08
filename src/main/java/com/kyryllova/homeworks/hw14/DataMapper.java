package com.kyryllova.homeworks.hw14;

public class DataMapper {
    public static Person map(String str) {
        try {
            String[] info = str.split(",");
            return new Person(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
