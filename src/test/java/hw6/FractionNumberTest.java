package hw6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionNumberTest {
    private static FractionNumber fractionNumber1;
    private static FractionNumber fractionNumber2;
    private static FractionNumber fractionNumber3;


    @BeforeAll
    static void setUp() {
        fractionNumber1 = new FractionNumber(1, 3);
        fractionNumber2 = new FractionNumber(2, 3);
        fractionNumber3 = new FractionNumber(3, 4);
    }

    @Test
    void badFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1, 0));
    }

    @Test
    void testEquals() {
        assertEquals(new FractionNumber(1, 3), fractionNumber1);
        assertNotEquals(fractionNumber2, fractionNumber1);
        assertEquals(new FractionNumber(3, 9), fractionNumber1);
        assertEquals(new FractionNumber(3, 1), new FractionNumber(9, 3));
    }

    @Test
    void testPlusWithTheSameDenominator() {
        Fraction result = fractionNumber1.plus(fractionNumber2);
        assertEquals(new FractionNumber(3, 3), result);

    }

    @Test
    void testPlusWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.plus(fractionNumber3);
        assertEquals(new FractionNumber(13, 12), result);
    }

    @Test
    void testMinusWithTheSameDenominator() {
        Fraction result = fractionNumber1.minus(fractionNumber2);
        assertEquals(new FractionNumber(-1, 3), result);
    }

    @Test
    void testMinusWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.minus(fractionNumber3);
        assertEquals(new FractionNumber(-5, 12), result);
    }

    @Test
    void testMultiplyWithTheSameDenominator() {
        Fraction result = fractionNumber1.multiply(fractionNumber2);
        assertEquals(new FractionNumber(2, 9), result);
    }

    @Test
    void testMultiplyWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.multiply(fractionNumber3);
        assertEquals(new FractionNumber(3, 12), result);

    }


    @Test
    void testDivideWithTheSameDenominator() {
        Fraction result = fractionNumber1.divide(fractionNumber2);
        assertEquals(new FractionNumber(1, 2), result);
    }

    @Test
    void testDivideWithNotTheSameDenominator() {
        Fraction result = fractionNumber1.divide(fractionNumber3);
        assertEquals(new FractionNumber(4, 9), result);
    }
}