package com.kyryllova.homeworks.hw10;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {
    private String fileLogName = "log.txt";

    @Override
    public String log(String message) {
        String mes = super.log(message);
        writeToFile(mes);
        return mes;
    }

    @Override
    public String log(String message, LogLevel level) {
        String mes = super.log(message, level);
        writeToFile(mes);
        return mes;
    }

    private void writeToFile(String message) {
        try (FileWriter writer = new FileWriter(fileLogName, true)) {
            writer.write(message);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
