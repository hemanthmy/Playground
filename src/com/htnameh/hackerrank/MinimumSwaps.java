package com.htnameh.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 1/4/19
 */
public class MinimumSwaps {

    public static void main(String[] args) {

    }

    private static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int i = 0;
        int minSwaps = 0;
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int j = 0; j < arr.length; j++) {
            integerMap.put(arr[j], j);
        }

        while (i < n) {
            if ((i + 1) != arr[i]) {
                minSwaps++;
                int temp = integerMap.get(arr[i]);
                integerMap.put(arr[i], integerMap.get(i + 1));
                integerMap.put(i + 1, temp);


            }
            i++;
        }

        return minSwaps;
    }

}