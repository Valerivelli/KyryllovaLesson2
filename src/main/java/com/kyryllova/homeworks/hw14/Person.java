package com.kyryllova.homeworks.hw14;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Person {
    String name;
    String surname;
    int age;
    int height;
    int weight;
    String email;

    public String getDomain() {
        String []parts =this.email.split("@");
        return parts[1];
    }

}
