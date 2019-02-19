package com.htnameh.practice;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class LargestDifference {

    public static void main(String[] args) {
        int[] inputArray = new int[]{18, 6, 15, 7, 5, 1, 17};

        int largestDiff = 0;
        int pos1 = 0, pos2 = 0;

        for (int i = 1; i < inputArray.length; i++) {
            int value = inputArray[i];

            for (int j = i - 1; j >= 0; j--) {
                int abs = Math.abs(value - inputArray[j]);
                if (largestDiff < abs) {
                    largestDiff = abs;
                    pos1 = i;
                    pos2 = j;
                }
            }
        }

        System.out.print("Largest difference is : " + largestDiff);
        System.out.println(" between " + inputArray[pos1] + ", " + inputArray[pos2]);
    }
}
