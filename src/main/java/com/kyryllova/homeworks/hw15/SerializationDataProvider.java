package com.kyryllova.homeworks.hw15;

import lombok.RequiredArgsConstructor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

@RequiredArgsConstructor
public class SerializationDataProvider implements DataProvider{
    private final String fileName;

    @Override
    public ArrayList<Person> provide() {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            ArrayList<Person> arrayList = (ArrayList<Person>) oos.readObject();
            return arrayList;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
