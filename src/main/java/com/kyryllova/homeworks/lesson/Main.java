package com.kyryllova.homeworks.lesson;

import com.kyryllova.homeworks.hw11.Cat;
import com.kyryllova.homeworks.hw11.Mouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("name1", 1);
        Mouse mouse1 = new Mouse("name2", 460);
        Mouse mouse2 = new Mouse("name3", 12);
        Mouse mouse3 = new Mouse("name4", 15);
        Mouse mouse4 = new Mouse("name5", 71);
        Mouse mouse5 = new Mouse("name6", 61);

        Cat cat = new Cat();

        cat.eat(mouse);
        cat.eat(mouse1);
        cat.eat(mouse2);
        cat.eat(mouse3);
        cat.eat(mouse4);
       // cat.eat(mouse5);

        ArrayDeque<Mouse> mice = cat.clearStomach();
        boolean peremennaya = cat.findMouseByCalories(mice, 460);
        if (peremennaya ){
            System.out.println("Found");
        }
        else{
            System.out.println("not found");
        }
    }
    }

