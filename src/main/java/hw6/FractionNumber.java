package hw6;

import java.util.Objects;
import java.util.Scanner;

public class FractionNumber implements Fraction {
//    class FractionNumber имплементит интерфейс Fraction, который бы представлял тип даных "Простая Дробь"
//    В классе должно быть две поля.В классе должны быть методы (plus, minus, multiply, divide)
//    Также, в классе должен быть метод toString, который печатает дробь в виде "2/3" .Сделать этот тип данных неизменяемым (immutable)

    private int numerator;
    private int denominator;


    public FractionNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Zero in the denominator!");
        }
        if (denominator % numerator == 0){
            denominator = denominator/numerator;
            numerator = 1;
        }
        if(numerator % denominator == 0){
            numerator = numerator/denominator;
            denominator = 1;
        }

        this.numerator = numerator;
        this.denominator = denominator;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return numerator == that.numerator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public Fraction plus(Fraction item) {
        Fraction fractionNumber;
        if (denominator == item.getDenominator()) {
            fractionNumber = new FractionNumber(numerator + item.getNumerator(), denominator);
        } else {
            int commonDenominator = denominator * item.getDenominator();
            int newNumerator1 = numerator * item.getDenominator();
            int newNumerator2 = item.getNumerator() * denominator;

            fractionNumber = new FractionNumber(newNumerator1 + newNumerator2, commonDenominator);
        }
        return fractionNumber;
    }

    @Override
    public Fraction minus(Fraction item) {
        Fraction fractionNumber;
        if (denominator == item.getDenominator()) {
            fractionNumber = new FractionNumber(numerator - item.getNumerator(), denominator);
        } else {
            int commonDenominator = denominator * item.getDenominator();
            int newNumerator1 = numerator * item.getDenominator();
            int newNumerator2 = item.getNumerator() * denominator;
            fractionNumber = new FractionNumber(newNumerator1 - newNumerator2, commonDenominator);
        }
        return fractionNumber;
    }

    @Override
    public Fraction multiply(Fraction item) {
        return new FractionNumber(numerator * item.getNumerator(), denominator * item.getDenominator());
    }

    @Override
    public Fraction divide(Fraction item) {
        return new FractionNumber(numerator * item.getDenominator(), item.getNumerator() * denominator);
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

interface Fraction {
    public Fraction plus(Fraction item);

    public Fraction minus(Fraction item);

    public Fraction multiply(Fraction item);//умножение

    public Fraction divide(Fraction item);//деление

    public int getNumerator();

    public int getDenominator();
}