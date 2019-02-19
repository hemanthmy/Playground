package com.htnameh.practice;

import java.util.HashMap;

/**
 * @author hemanth
 * @since 15/2/19
 */
public class FindUnique {

    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{2, 1, 2, 3, 4, 4, 3, 3, 3, 3, 1}));
    }

    private static int findUnique(int[] input) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        for (int i : input) {
            integerIntegerHashMap.put(i, integerIntegerHashMap.getOrDefault(i, 0) + 1);
        }

        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integerIntegerHashMap.get(integer) == 1) {
                return integer;
            }
        }

        return -1;
    }

}