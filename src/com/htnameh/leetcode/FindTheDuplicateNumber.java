package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 12/2/19
 */
public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 2, 2, 2}));
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

    private static int findDuplicate(int[] nums) {
        int result = ((nums.length - 1) * nums.length) / 2;
        for (int num : nums) {
            result -= num;
        }

        return Math.abs(result);
    }

}