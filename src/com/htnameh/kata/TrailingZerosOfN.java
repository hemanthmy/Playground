package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class TrailingZerosOfN {

    public static void main(String[] args) {
        System.out.println(zeros(6));
        System.out.println(zeros(14));
    }

    private static int zeros(int n) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }
}
