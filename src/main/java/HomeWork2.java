/**
 * Java 1. Home work #2
 *
 * @author Elena Rzhevskaya
 * version 19.02.2022
 */


public class HomeWork2 {
    public static void main(String[] args) {
        boolean result = checkSumSign(-1, 21);
        System.out.println(result);
        boolean result2 = checkSumSign(3, 18);
        System.out.println(result2);
        boolean result3 = checkSumSign(20, 0);
        System.out.println(result3);

        isPositiveOrNegative(-20);
        boolean outcome = isNegative(50);
        System.out.println(outcome);
        printFewWord("Elena", 7);
        boolean year = determineLeapYear(2022);
        System.out.println(year);

    }

    static boolean checkSumSign(int a, int b) {
        int c = a + b;
        return (c >= 10) && (c <= 20);
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0? "It's positive" : "It's negative");
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void printFewWord(String word, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(word);
        }
    }
    static boolean determineLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}