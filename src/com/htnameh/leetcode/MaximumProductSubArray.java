package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 12/2/19
 */
public class MaximumProductSubArray {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
    }

    private static int maxProduct(int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        }

        int sum = inputArray[0];
        int result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            sum = Math.max(inputArray[i], sum * inputArray[i]);
            result = Math.max(sum, result);
        }

        return result;
    }

}