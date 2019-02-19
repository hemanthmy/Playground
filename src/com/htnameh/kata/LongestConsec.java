package com.htnameh.kata;

/**
 * @author hemanth
 * @since 17/1/19
 */
public class LongestConsec {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
    }

    private static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) {
            return "";
        }

        StringBuilder builder = new StringBuilder();

        int startIndex = 0;
        int longestLength = Integer.MIN_VALUE;

        for (int i = 0; i < strarr.length - (k - 1); i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += strarr[j].length();
            }

            if (temp > longestLength) {
                startIndex = i;
                longestLength = temp;
            }
        }

        while (k > 0) {
            builder.append(strarr[startIndex++]);
            k--;
        }

        return builder.toString();
    }

}