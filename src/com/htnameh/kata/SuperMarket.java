package com.htnameh.kata;

import java.util.Arrays;

/**
 * @author hemanth
 * @since 12/12/18
 */
public class SuperMarket {

    public static int solveSuperMarketQueue(int[] customers, int counter) {
        if (customers.length == 0) {
            return 0;
        }

        if (customers.length == 1) {
            return customers[0];
        }

        if (customers.length <= counter) {
            return getTimeTaken(customers);
        }

        int smallestIndex = 0;
        int smallest = customers[0];
        int[] counterArray = new int[counter];

        for (int i = 0; i < counter; i++) {
            counterArray[i] = customers[i];
            if (customers[i] < smallest) {
                smallestIndex = i;
            }
        }

        for (int i = counter; i < customers.length; i++) {
            counterArray[smallestIndex] = counterArray[smallestIndex] + customers[i];
            int small = counterArray[smallestIndex];
            for (int j = 0; j < counterArray.length; j++) {
                if (counterArray[j] < small) {
                    smallestIndex = j;
                    small = counterArray[smallestIndex];
                }
            }
        }

        return getTimeTaken(counterArray);
    }

    private static int getTimeTaken(int[] counterArray) {
        int timeTaken = counterArray[0];
        for (int i = 1; i < counterArray.length; i++) {
            if (timeTaken <= counterArray[i]) {
                timeTaken = counterArray[i];
            }
        }
        return timeTaken;
    }

    public static int solveSuperMarketQueue2(int[] customers, int counter) {
        int[] result = new int[counter];
        for (int i = 0; i < customers.length; i++) {
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[counter - 1];
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(solveSuperMarketQueue(new int[]{2, 5, 4, 7, 2, 2, 2, 3, 2, 3}, 4));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(solveSuperMarketQueue2(new int[]{2, 5, 4, 7, 2, 2, 2, 3, 2, 3}, 4));
        System.out.println(System.currentTimeMillis() - start);
    }

}
