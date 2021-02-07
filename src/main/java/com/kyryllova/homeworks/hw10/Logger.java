package com.kyryllova.homeworks.hw10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {
    public String log(String message) {
        return LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")) +
                " " + LogLevel.ALL + " : " + message;
    }

    public String log(String message, LogLevel level) {
        return LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")) +
                " " + level + " : " + message;
    }

    private LogLevel level;

    @Override
    public String toString() {
        return "Log level : " + level;
    }
}
