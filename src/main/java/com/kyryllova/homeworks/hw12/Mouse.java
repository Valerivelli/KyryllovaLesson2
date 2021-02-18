package com.kyryllova.homeworks.hw12;

import lombok.Getter;
import lombok.Value;

@Value
public class Mouse {
    String name;
    @Getter
    int kilocalories;
}
