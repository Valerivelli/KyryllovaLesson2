package hw4;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(isStong(145));
    }

    private static boolean isStong(int num) {
        return num == factorialOfSum(num);
    }

    private static int factorialOfSum(int num) {
        int result = 0;
        while (num > 0) {
            result = +factorial(num % 10);
            num /= 10;
        }
        return result;
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        }
        return factorial(num - 1) * num;
    }
}
