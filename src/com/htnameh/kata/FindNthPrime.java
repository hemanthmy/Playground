package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class FindNthPrime {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(nthPrime(100001));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static int nthPrime(int n) {
        int candidate, count;
        for (candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        // The candidate has been incremented once after the count reached n
        return candidate - 1;
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;

        int step = 4;
        int max = (int) Math.sqrt(n) + 1;

        for (int i = 5; i < max; step = 6 - step, i += step) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
