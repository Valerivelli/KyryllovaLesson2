package hw4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String pal = getPalindromeInput();
        char array[] = getArray(pal);
        boolean isPal = isPalindrome(array);

        if (isPal) {
            System.out.println("It`s a palindrome!");
        } else {
            System.out.println("It`s not a palindrome!");
        }

    }

    private static String getPalindromeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to check whether string is palindrome: ");
        String palindrome = scanner.nextLine();
        return palindrome;

    }

    private static char[] getArray(String palindrome) {
        char chArray[] = palindrome.toCharArray();
        return chArray;
    }

    private static boolean isPalindrome(char chArray[]) {
        int i = 0;
        int j = chArray.length - 1;
        for (; i < chArray.length / 2; i++, j--) {
            if (chArray[i] != chArray[j]) {
                return false;
            }
        }
        return true;
    }

}


