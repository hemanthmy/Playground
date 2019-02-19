package com.htnameh.kata;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 24/1/19
 */
public class BuddyPairs {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(buddy(381, 4318));
        System.out.println(buddy(2382, 3679));
        System.out.println(buddy(1071625, 1103735));
        System.out.println(System.nanoTime()- start);

        start = System.nanoTime();
        System.out.println(buddy2(381, 4318));
        System.out.println(buddy2(2382, 3679));
        System.out.println(buddy2(1071625, 1103735));
        System.out.println(System.nanoTime()- start);
    }

    private static String buddy(long start, long limit) {
        Map<Long, Integer> map = new HashMap<>();

        for (long i = start; i <= limit; i++) {
            if (map.containsKey(i)) {
                String temp2 = getResultString(map, i);
                if (temp2 != null) return temp2;
            } else {
                int value = sumOfProperDivisors(i);
                map.put(i, value);
                if (value - 1 > i) {
                    String temp2 = getResultString(map, i);
                    if (temp2 != null) return temp2;
                }
            }
        }

        return "Nothing";
    }

    private static String getResultString(Map<Long, Integer> map, long i) {
        int temp = map.get(i);
        if (map.containsKey(temp - 1L)) {
            int temp2 = map.get(temp - 1L);
            if (temp2 - 1 == i) {
                return "(" + i + " " + (temp2 - 1) + ")";
            }
        } else {
            int value = sumOfProperDivisors(temp - 1L);
            map.put(temp - 1L, value);
            if (value - 1 == i) {
                return "(" + i + " " + (temp - 1) + ")";
            }
        }
        return null;
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

    private static String buddy2(long start, long limit) {
        long A;
        long B;

        for (long i = start; i <= limit; i++) {
            A = i;
            B = divSum(i) - 1;
            if ((A + 1 == divSum(B)) & (B > A)) return ("(" + A + " " + B + ")");
        }

        return "Nothing";
    }

    public static long divSum(long A) {
        long divSum = 0;
        for (long i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                divSum = divSum + i + A / i;
            }
            if (i * i == A) divSum = divSum - i;
        }
        divSum++;
        return divSum;
    }

}