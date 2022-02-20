/**
 * Java 1. Home work #2
 *
 * @author Elena Rzhevskaya
 * version 19.02.2022
 */


public class HomeWork2 {
    public static void main(String[] args) {
        boolean result = checkSumSign(6, 18);
        System.out.println(result);
        isPositiveOrNegative(-20);
        boolean outcome = isNegative(-50);
        System.out.println(outcome);
        PrintFewWord("Elena", 7);
        DetermineLeapYear(2022);
    }

    static boolean checkSumSign(int a, int b) {
        int c = a + b;
        return (10 <= c) && (c <= 20);
    }

    static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("It's positive");
        } else {
            System.out.println("It's negative");
        }
    }

    static boolean isNegative(int a) {
        return (a < 0);
    }
    static void PrintFewWord(String word, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(word);
        }
    }
    static void DetermineLeapYear(int y) {
        if (y % 4 == 0) {
            if ((y % 100 != 0) || (y % 400 == 0)) {
                System.out.println("високосный");
            }
        }    else {
                System.out.println ("Невисокосный");
            }
    }

}