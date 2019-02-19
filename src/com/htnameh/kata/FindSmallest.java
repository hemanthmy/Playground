package com.htnameh.kata;

/**
 * @author hemanth
 * @since 13/12/18
 */
public class FindSmallest {

    public static void smallest(long n) {
        String[] input = String.valueOf(n).split("");

        String smallestNum = input[0];
        int index = 0;

        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(smallestNum) > Integer.parseInt(input[i])) {
                smallestNum = input[i];
            }
        }

        System.out.println(smallestNum);
    }

    public static void main(String[] args) {
        smallest(10000);
    }
}
