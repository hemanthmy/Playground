package com.htnameh.kata;

/**
 * @author hemanth
 * @since 16/1/19
 */
public class Spiral {

    public static void main(String[] args) {
        int[][] spiral = printSpiral(10);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[0].length; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] printSpiral(int n) {
        int[][] spiral = new int[n][n];

        int i = 0;
        int j = 0;

        while (i != n / 2 && j != n / 2) {

        }

        return spiral;
    }
}