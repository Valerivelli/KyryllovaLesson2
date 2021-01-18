package hw4;

import java.util.Arrays;

public class SumOfColums {
    public static void main(String[] args) {
        int array1[] = random();
        int array2[] = random();
        sumOfColumns2(array1, array2);
        System.out.println();
        sumOfColumns1(array1, array2);

    }

    private static void sumOfColumns1(int[] array1, int[] array2) {
        System.out.println(" col1 | col2 | Sum ");
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            if (i < array2.length && i < array1.length) {
                System.out.println("\t" + array1[i] + " |  " + array2[i] + "   | " + (array1[i] + array2[i]));
            } else if (i < array1.length) {
                System.out.println("\t" + array1[i] + " |  --   | " + array1[i]);
            } else {
                System.out.println("\t-- |  " + array2[i] + "   | " + array2[i]);
            }
        }

    }

    private static void sumOfColumns2(int[] array1, int[] array2) {
        int[][] result = new int[Math.max(array1.length, array2.length)][3];
        for (int i = 0; i < result.length; i++) {
            if (i < array2.length && i < array1.length) {
                result[i][0] = array1[i];
                result[i][1] = array2[i];
            } else if (i < array1.length) {
                result[i][0] = array1[i];
            } else {
                result[i][1] = array2[i];
            }
            result[i][2] = result[i][0] + result[i][1];
        }
        printArray(result);
    }

    private static void printArray(int[][] array) {
        for (int[] numbers : array) {
            System.out.println(Arrays.toString(numbers));
        }
    }

    private static int[] random() {
        int length = (int) (Math.random() * (21 - 5) + 5);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (91 - 10) + 10);
        }
        return array;
    }
}
