package com.htnameh.projecteuler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 24/1/19
 */
public class AmicableNumbers {

    public static void main(String[] args) {
        System.out.println(buddy(1, 1000));
    }

    private static long buddy(long start, long limit) {
        long sum = 0;
        Map<Long, Integer> map = new HashMap<>();

        for (long i = start; i <= limit; i++) {
            if (map.containsKey(i)) {
                sum += getResultString(map, i);
            } else {
                int value = sumOfProperDivisors(i);
                map.put(i, value);
                sum += getResultString(map, i);
            }
        }

        return sum;
    }

    private static long getResultString(Map<Long, Integer> map, long i) {
        long temp = map.get(i);
        if (map.containsKey(temp)) {
            int temp2 = map.get(temp);
            if (temp2 == i) {
                return temp2;
            }
        } else {
            int value = sumOfProperDivisors(temp);
            map.put(temp, value);
            if (value == i) {
                return temp;
            }
        }
        return 0;
    }

    private static int sumOfProperDivisors(long n) {
        int sum = 1;
        for (long i = 2; i < (n / i); i++) {
            if (n % i == 0) {
                sum += i + (n / i);
            }
        }

        return sum;
    }

}