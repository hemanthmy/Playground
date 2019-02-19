package com.htnameh.kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class DescendingOrder {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(sortDesc(1254859723));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(sortDescWithStream(1254859723));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(sortDescWithCollections(1254859723));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static long sortDesc(final int num) {
        String str = String.valueOf(num);

        char[] tempArray = str.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        StringBuilder result = new StringBuilder();

        for (int i = tempArray.length - 1; i >= 0; i--) {
            result.append(tempArray[i]);
        }

        return Long.parseLong(result.toString());
    }

    private static long sortDescWithStream(final int num) {
        return Long.parseLong(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    private static long sortDescWithCollections(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Long.valueOf(String.join("", array));
    }
}
