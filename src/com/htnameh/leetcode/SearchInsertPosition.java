package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 14/1/19
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    private static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, (nums.length - 1) / 2, target);
    }

    private static int binarySearch(int nums[], int low, int high, int mid, int target) {
        if (high >= low) {
            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                return binarySearch(nums, low, mid - 1, low + ((mid - 1) - low) / 2, target);

            return binarySearch(nums, mid + 1, high, (mid + 1) + (high - (mid + 1)) / 2, target);
        }

        return mid;
    }
}
