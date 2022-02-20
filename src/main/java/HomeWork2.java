public class HomeWork2 {
    public static void main(String[] args) {
        boolean result = checkSumSign(6, 18);
        System.out.println(result);
        isPositiveOrNegative(-20);
        boolean outcome = isNegative(-50);
        System.out.println(outcome);
        PrintFewWord("Elena", 7);
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

}