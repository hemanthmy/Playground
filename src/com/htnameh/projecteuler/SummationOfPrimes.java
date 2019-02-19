package com.htnameh.projecteuler;

/**
 * @author hemanth
 * @since 4/1/19
 */
public class SummationOfPrimes {

    public static void main(String[] args) {
        int n = 2000000;

        long total = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                if (isPrime(i)) {
                    total += n;
                }
            }
        }

        System.out.println(total);
    }

    private static boolean isPrime(int n) {
        int max = (int) Math.sqrt(n) + 1;

        for (int i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
