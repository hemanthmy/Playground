package com.htnameh.practice;

/**
 * @author hemanth
 * @since 1/1/19
 */
public class FindPower {

    public static void main(String[] args) {
        System.out.println(pow(2, 0));
        System.out.println(pow(2, 2));
        System.out.println(pow(2, 3));
        System.out.println(pow(2, -3));
        System.out.println(pow(2, -4));
        System.out.println(pow(-3, 2));
        System.out.println(pow(-3, 3));
        System.out.println(pow(-3, -3));
        System.out.println(pow(-3, -4));
    }

    private static double pow(int a, int b) {
        boolean isNegative = b < 0;
        b = isNegative ? b * -1 : b;

        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b == 2) {
            return a * a;
        }

        double result;

        if (b % 2 == 0) {
            result = pow(a, b / 2) * pow(a, b / 2);
        } else {
            result = a * pow(a, b - 1);
        }

        return isNegative ? 1 / result : result;
    }
}
