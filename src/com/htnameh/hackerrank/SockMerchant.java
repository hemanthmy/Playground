package com.htnameh.hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hemanth
 * @since 19/12/18
 */
public class SockMerchant {

    public static int solution(int n, int[] input) {
        int pairs = 0;

        Set<Integer> pairsMap = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int key = input[i];
            if (pairsMap.contains(key)) {
                pairs++;
                pairsMap.remove(key);
            } else {
                pairsMap.add(key);
            }
        }

        return pairs;
    }
}