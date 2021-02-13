package com.kyryllova.homeworks.hw11;

import lombok.Getter;
import lombok.Value;

@Value
public class Mouse {
    String name;
    @Getter
    int kilocalories;
}
