package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 11/1/19
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));

        System.out.println();

        for (int num : nums) {
            System.out.print(num);
        }
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int currentIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[currentIndex]) {
                currentIndex++;
                nums[currentIndex] = nums[i];
            }
        }

        return currentIndex + 1;
    }

}
