package com.htnameh.sorting;

/**
 * @author hemanth
 * @since 2/1/19
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }

    private static void sort(int[] input, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(input, low, high);

            sort(input, low, pivotIndex - 1);
            sort(input, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] input, int low, int high) {
        int pivot = input[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (input[j] <= pivot) {
                i++;
                if (i != j) {
                    swap(input, i, j);
                }
            }
        }

        swap(input, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int input : arr) System.out.print(input + " ");
        System.out.println();
    }

}
