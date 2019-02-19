package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 9/1/19
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    private static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            result = result * 10 + rem;

            if (result < -2147483648 || result > 2147483647) {
                return 0;
            }
        }

        return (int) result;
    }
}