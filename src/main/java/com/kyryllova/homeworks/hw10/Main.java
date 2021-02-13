package com.kyryllova.homeworks.hw10;

public class Main {
    public static void main(String[] args) {
        Logger log = new ConsoleLogger();
        log.log("Try");
        log.log("Try!", LogLevel.WARN);

        Logger log1 = new FileLogger();
        log1.log("File");
        log1.log("File1", LogLevel.ERROR);
    }
}
