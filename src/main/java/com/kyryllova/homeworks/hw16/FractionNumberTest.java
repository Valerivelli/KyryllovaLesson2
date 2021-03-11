package com.kyryllova.homeworks.hw16;

import hw6.Fraction;
import hw6.FractionNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionNumberTest {
    private static FractionNumber fractionNumber1;
    private static FractionNumber fractionNumber2;
    private static FractionNumber fractionNumber3;


    @BeforeAll
    static void setUp() {
        fractionNumber1 = new FractionNumber(1, 3);
        fractionNumber2 = new FractionNumber(2, 3);
        fractionNumber3 = new FractionNumber(3, 4);
    }

    @MyTest
    void badFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1, 0));
    }

    @MyTest
    void testEquals() {
        assertEquals(new FractionNumber(1, 3), fractionNumber1);
        assertNotEquals(fractionNumber2, fractionNumber1);
        assertEquals(new FractionNumber(3, 9), fractionNumber1);
        assertEquals(new FractionNumber(3, 1), new FractionNumber(9, 3));
    }

    @MyTest
    void testPlusWithTheSameDenominator() {
        Fraction result = fractionNumber1.plus(fractionNumber2);
        assertEquals(new FractionNumber(3, 3), result);
        assertEquals(new FractionNumber(1, 1), result);

    }

    @MyTest
    void testPlusWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.plus(fractionNumber3);
        assertEquals(new FractionNumber(13, 12), result);
    }

    @MyTest
    void testMinusWithTheSameDenominator() {
        Fraction result = fractionNumber1.minus(fractionNumber2);
        assertEquals(new FractionNumber(-1, 3), result);
    }

    @MyTest
    void testMinusWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.minus(fractionNumber3);
        assertEquals(new FractionNumber(-5, 12), result);
    }

    @MyTest
    void testMultiplyWithTheSameDenominator() {
        Fraction result = fractionNumber1.multiply(fractionNumber2);
        assertEquals(new FractionNumber(2, 9), result);
    }

    @MyTest
    void testMultiplyWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.multiply(fractionNumber3);
        assertEquals(new FractionNumber(3, 12), result);

    }


    @MyTest
    void testDivideWithTheSameDenominator() {
        Fraction result = fractionNumber1.divide(fractionNumber2);
        assertEquals(new FractionNumber(1, 2), result);
    }

    @MyTest
    void testDivideWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.divide(fractionNumber3);
        assertEquals(new FractionNumber(4, 9), result);
    }
}
