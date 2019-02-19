package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class WaterJug {

    public static void main(String[] args) {
        System.out.println(canMeasureWater(3, 5, 4));
        System.out.println(canMeasureWater(2, 6, 5));
        System.out.println(canMeasureWater(34, 5, 6));
    }

    private static boolean canMeasureWater(int x, int y, int z) {
        System.out.println();
        if (x == 0) {
            return y == z;
        }
        if (y == 0) {
            return x == z;
        }
        if (x == y) {
            return x == z;
        }

        return (z % Math.abs(x - y)) == 0;
    }
}
