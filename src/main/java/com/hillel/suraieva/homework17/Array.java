package com.hillel.suraieva.homework17;

public class Array {
    public static double getAverage(int[][] array) {
        double srednee = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                srednee += array[i][j];
                k++;
            }

        }
        return srednee / k;
    }

    public static boolean isSame(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}
