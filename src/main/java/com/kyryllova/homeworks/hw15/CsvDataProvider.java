package com.kyryllova.homeworks.hw15;

import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@RequiredArgsConstructor
public class CsvDataProvider implements DataProvider{
    private final String fileName;

    @Override
    public ArrayList<Person> provide() {
        ArrayList<Person> people = new ArrayList<>();

        String path = "src\\main\\java\\com\\kyryllova\\homeworks\\hw14\\data.csv";
        try (FileReader fileReader = new FileReader(path);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String str;
            while ((str = reader.readLine()) != null) {
                people.add(DataMapper.map(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

}
