package com.htnameh.practice;

/**
 * @author hemanth
 * @since 1/1/19
 */
public class ReverseTheWords {

    public static void main(String[] args) {
        char[] inputArray = new char[]{'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        System.out.println(inputArray);

        reverseTheWords(inputArray);

        System.out.println(inputArray);
    }

    private static void reverseTheWords(char[] inputArray) {
        reverseString(inputArray, 0, inputArray.length - 1);
        reverseWords(inputArray);
    }

    private static void reverseString(char[] inputArray, int start, int end) {
        while (start < end) {
            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseWords(char[] inputArray) {
        int wf, wt;
        int current = 0;
        while (current < inputArray.length) {
            wf = current;
            wt = indexOf(inputArray, ' ', wf);
            if (-1 == wt) {
                reverseString(inputArray, wf, inputArray.length - 1);
                current = inputArray.length;
            } else {
                reverseString(inputArray, wf, wt - 1);
                current = wt + 1;
            }
        }
    }

    private static int indexOf(char[] inputArray, char sentinal, int start) {
        for (int i = start; i < inputArray.length; i++) {
            if (sentinal == inputArray[i]) {
                return i;
            }
        }
        return -1;
    }

}