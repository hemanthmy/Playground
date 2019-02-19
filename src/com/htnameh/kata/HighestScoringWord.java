package com.htnameh.kata;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class HighestScoringWord {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(high("man i need a taxi up to ubud"));
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(high("take me to semynak"));
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("===========");

        start = System.currentTimeMillis();
        System.out.println(high2("man i need a taxi up to ubud"));
        System.out.println(high2("what time are we climbing up to the volcano"));
        System.out.println(high2("take me to semynak"));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static String high(String s) {
        String[] input = s.split(" ");

        int largestIndex = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            String str = input[i];
            int k = 0;
            for (int j = 0; j < str.length(); j++) {
                k += (int) str.charAt(j) - 96;
            }

            if (k > largest) {
                largest = k;
                largestIndex = i;
            }
        }

        return input[largestIndex];
    }

    private static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }
}