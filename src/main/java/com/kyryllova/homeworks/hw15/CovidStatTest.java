package com.kyryllova.homeworks.hw15;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CovidStatTest {
    private ArrayList<Person> people;
    private CovidStat covid;

    @BeforeEach
    void SetUp(){
        Person person1 = new Person.PersonBuilder()
                .name("Eugene")
                .surname("Berezhny")
                .age(32)
                .height(175)
                .weight(81)
                .email("berezhnoy87@gmail.com")
                .build();
        Person person2 = new Person.PersonBuilder()
                .name("Mike")
                .surname("Krivoy")
                .age(45)
                .height(187)
                .weight(98)
                .email("qwerty123@gmail.com")
                .build();
        Person person3 = new Person.PersonBuilder()
                .name("Vasya")
                .surname("Krivoy")
                .age(18)
                .height(165)
                .weight(78)
                .email("iron.mike@gmail.com")
                .build();
        Person person4 = new Person.PersonBuilder()
                .name("Eugene")
                .surname("Ivanov")
                .age(36)
                .height(195)
                .weight(87)
                .email("mike@mail.ru")
                .build();

        people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        covid = new CovidStat(people);
    }

    @Test
    void getMostPopularName(){
        assertEquals(covid.getMostPopularName(), "Eugene");
    }

    @Test
    void getMostPopularSurname(){
        assertEquals(covid.getMostPopularSurname(), "Krivoy");
    }

    @Test
    void getMostPopularDomain(){
        assertEquals(covid.getMostPopularMailDomain(), "gmail.com");
    }

    @Test
    void getAverageAge(){
        assertEquals(covid.getAverageAge(), 32.75);
    }

    @Test
    void getAverageHeight(){
        assertEquals(covid.getAverageHeight(), 180.5);
    }

    @Test
    void getAverageWeight(){
        assertEquals(covid.getAverageWeight(), 86);
    }
}
