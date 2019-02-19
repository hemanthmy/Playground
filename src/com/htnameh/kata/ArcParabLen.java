package com.htnameh.kata;

/**
 * @author hemanth
 * @since 21/1/19
 */
public class ArcParabLen {

    public static void main(String[] args) {
        System.out.println(lenCurve(10));

        // 1.478197397
    }

    private static double lenCurve(int n) {
        double parabolicLength = 0.0;
        double x1 = 0.0;
        double x2 = 0.0;
        double offset = 1d / n;

        for (double i = 0; i < n; i++) {
            x2 += offset;
            parabolicLength += Math.sqrt((x2 - x1) * (x2 - x1) + (x2 * x2 - x1 * x1) * (x2 * x2 - x1 * x1));
            x1 += offset;
        }

        System.out.println(parabolicLength);

        return parabolicLength;
    }

}