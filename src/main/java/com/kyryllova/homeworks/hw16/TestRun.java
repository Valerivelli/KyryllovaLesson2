package com.kyryllova.homeworks.hw16;

import lombok.extern.slf4j.Slf4j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
public class TestRun {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("D:\\загрузки\\JavaRushTasks\\2.JavaCore\\KyryllovaLesson2\\src\\main\\java\\com\\kyryllova\\homeworks\\hw16\\FractionNumberTest.java");
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method:declaredMethods) {
                if (method.isAnnotationPresent(MyTest.class)){
                    String name = method.getName();
                    log.debug(name);
                    try {
                        method.invoke(null);
                        log.debug(name+" "+"DONE");
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                        log.debug(name+" "+"FAILED");
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
