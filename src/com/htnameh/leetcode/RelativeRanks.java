package com.htnameh.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 18/1/19
 */
public class RelativeRanks {

    public static void main(String[] args) {
        String[] results = findRelativeRanks(new int[]{1, 2, 3, 4, 5});

        for (String result : results) {
            System.out.println(result);
        }
    }

    private static String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        String[] results = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);

        int rank = nums.length;

        for (int num : nums) {
            if (rank > 3) {
                results[map.get(num)] = String.valueOf(rank--);
            } else {
                if (rank == 3) {
                    results[map.get(num)] = "Bronze Medal";
                }
                if (rank == 2) {
                    results[map.get(num)] = "Silver Medal";
                }
                if (rank == 1) {
                    results[map.get(num)] = "Gold Medal";
                }
                rank--;
            }
        }

        return results;
    }

}