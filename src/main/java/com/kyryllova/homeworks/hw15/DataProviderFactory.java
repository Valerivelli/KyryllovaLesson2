package com.kyryllova.homeworks.hw15;

public class DataProviderFactory {
    DataProvider getInstance(String filename) {
        String[] split = filename.split(".");

        if (split.length > 0 && "csv".equals(split[split.length - 1])) {
            return new CsvDataProvider(filename);
        } else {
            return new SerializationDataProvider(filename);
        }
    }
}
