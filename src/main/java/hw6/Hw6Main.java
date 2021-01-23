package hw6;

public class Hw6Main {
    public static void main(String[] args) {
        Fraction fraction1 = new FractionNumber(3, 5);
        Fraction fraction2 = new FractionNumber(2, 6);

        Fraction plusResult = fraction1.plus(fraction2);
        Fraction minusResult = fraction1.minus(fraction2);
        Fraction multiplyResult = fraction1.multiply(fraction2);
        Fraction divideResult = fraction1.divide(fraction2);

        System.out.println("Plus result : " + plusResult);
        System.out.println("Minus result : " + minusResult);
        System.out.println("Multiply result : " + multiplyResult);
        System.out.println("Divide result : " + divideResult);

    }
}
