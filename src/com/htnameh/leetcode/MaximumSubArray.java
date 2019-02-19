package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 1/1/19
 */
public class MaximumSubArray {

    public static void main(String[] args) {
//        System.out.println(findMaxSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
//        System.out.println(findMaxSubArray2(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        System.out.println(findMaxSubArray(new int[]{-2, -3, -4, -1, -2, -1, -5, -3}));
        System.out.println(findMaxSubArray2(new int[]{-2, -3, -4, -1, -2, -1, -5, -3}));
    }

    private static int findMaxSubArray(int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        }

        int sum = 0;
        int[] solutions = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += inputArray[i];
            solutions[i] = sum;
        }

        int result = solutions[0];

        for (int i = 1; i < solutions.length; i++) {
            if (result < solutions[i]) {
                result = solutions[i];
            }
        }

        return result;
    }

    private static int findMaxSubArray2(int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        }

        int sum = inputArray[0];
        int result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            sum = Math.max(inputArray[i], sum + inputArray[i]);
            result = Math.max(sum, result);
        }

        return result;
    }
}
