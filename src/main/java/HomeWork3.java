/*
*Java 1. Home work #3
 *
 * @author Elena Rzhevskaya
 * version 24.02.2022
 *
 */
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        // Task1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task1:");
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] > 0) ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Task2:");
        to100(100);

        System.out.println("Task3:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr3));
        six(arr3);

        System.out.println("Task4:");
        int[][] matrix = new int[5][5];
        printMatrix(matrix);

        System.out.println("Task5:");
        lenAndInitialValue(10, 3);

    }

    //Task2
    static void to100(int max) {
        int[] t = new int[max];
        for (int i = 0; i < 100; i++) {
            t[i] = i;
            System.out.print(t[i] + " ");

        }
    }

    //Task3
    static void six(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (arr3[i] < 6) ? arr3[i] * 2 : arr3[i];
        }
        System.out.println(Arrays.toString(arr3));
    }

    //Task4
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][j] = 1;
                matrix[j][matrix.length - j - 1] = 1;
            }
            for (i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }
    //Task5
    static int[] lenAndInitialValue(int len, int initialValue) {
        int[] arr4 = new int[len];
        for (int i = 0; i < len; i++) {
            arr4[i] = initialValue;
            System.out.print("[" + i + "]" + " ");

        }
        return arr4;
    }





}

















