package com.kyryllova.homeworks.hw14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TestHw14 {
    private String path = "data.csv";
   @Test
    void testAverageAge(){
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(41,stat.getAverageAge());
    }
    @Test
    void testAverageHeight(){
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(165.75,stat.getAverageHeight());
    }
    @Test
    void testAverageWeight(){
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(77.5,stat.getAverageWeight());
    }
    @Test
    void testPopularEmail(){
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals("gmail.com",stat.getMostPopularMailDomain());
    }
    @Test
    void testPopularName(){
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals("Mike",stat.getMostPopularName());
    }
}
