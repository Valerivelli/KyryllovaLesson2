package com.kyryllova.homeworks.hw10;

public class ConsoleLogger extends Logger {


    @Override
    public String log(String message) {
        String mes = super.log(message);
        System.out.println(mes);
        return mes;
    }

    @Override
    public String log(String message, LogLevel level) {
        String mes = super.log(message, level);
        System.out.println(mes);
        return mes;
    }
}
