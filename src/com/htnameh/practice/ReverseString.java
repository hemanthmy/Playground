package com.htnameh.practice;

/**
 * @author hemanth
 * @since 7/2/19
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] result = reverseWithArray("abcde");

        for (char c : result) {
            System.out.print(c);
        }
    }

    private static char[] reverseWithArray(String input) {
        char[] output = new char[input.length()];

        for (int start = 0, end = input.length() - 1; start <= end; start++, end--) {
            output[start] = input.charAt(end);
            output[end] = input.charAt(start);
        }

        return output;
    }
}