package com.kyryllova.homeworks.hw15;

import java.util.*;
import java.util.stream.Collectors;

public class CovidStat implements MostPopular {

    private final ArrayList<Person> finalArray;

    public CovidStat(ArrayList<Person> finalArray) {
        this.finalArray = finalArray;
    }

    @Override
    public String getMostPopularName() {
        Set<Map.Entry<String, Integer>> set = finalArray.stream()
                .collect(Collectors.toMap(p -> p.getName(), word -> 1, Integer::sum)).entrySet();
        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }

    @Override
    public String getMostPopularSurname() {
        Set<Map.Entry<String, Integer>> set = finalArray.stream()
                .collect(Collectors.toMap(p -> p.getSurname(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }

    @Override
    public String getMostPopularMailDomain() {
        Set<Map.Entry<String, Integer>> set = finalArray.stream()
                .collect(Collectors.toMap(p -> p.getDomain(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }


    @Override
    public double getAverageAge() {
        double average = 0;
        for (Person dataItem : finalArray) {
            average += dataItem.getAge();
        }
        return average / finalArray.size();
    }


    @Override
    public double getAverageHeight() {
        double average = 0;
        for (Person dataItem : finalArray) {
            average += dataItem.getHeight();
        }
        return average / finalArray.size();
    }

    @Override
    public double getAverageWeight() {
        double average = 0;
        for (Person dataItem : finalArray) {
            average += dataItem.getWeight();
        }
        return average / finalArray.size();
    }


}

