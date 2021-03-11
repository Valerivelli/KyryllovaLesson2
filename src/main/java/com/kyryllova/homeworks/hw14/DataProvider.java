package com.kyryllova.homeworks.hw14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataProvider {

    public static ArrayList<Person> provide() {
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
