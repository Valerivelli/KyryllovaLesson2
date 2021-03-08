package com.kyryllova.homeworks.hw15;

public class DataMapper {
    public static Person map(String str) {
        try {
            String[] info = str.split(",");
            return new Person.PersonBuilder()
                    .name(info[0])
                    .surname(info[1])
                    .age(Integer.valueOf(info[2]))
                    .height(Integer.valueOf(info[3]))
                    .weight(Integer.valueOf(info[4]))
                    .email(info[5])
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
