package com.htnameh.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 9/1/19
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] x = twoSum(new int[]{-3, 4, 3, 90}, 0);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (tempMap.getOrDefault(temp, -1) != -1) {
                result[0] = tempMap.get(temp);
                result[1] = i;
                break;
            }

            tempMap.put(nums[i], i);
        }

        return result;
    }
}
