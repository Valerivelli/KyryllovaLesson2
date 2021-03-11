package com.kyryllova.homeworks.hw15;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import java.io.Serializable;

@Builder
@Value
@RequiredArgsConstructor
public class Person implements Serializable {
    String name;
    String surname;
    int age;
    int height;
    int weight;
    String email;

    public String getDomain() {
        String[] parts = this.email.split("@");
        return parts[1];
    }
}