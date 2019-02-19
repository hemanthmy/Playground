package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println();
        longestCommonPrefix(new String[]{"dog", "racecar", "car"});
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int smallest = Integer.MAX_VALUE;

        for (String str : strs) {
            smallest = Math.min(smallest, str.length());
        }

        if (smallest == 0) {
            return "";
        }

        int prefixes = findPrefix(strs, smallest);

        if (prefixes == 0) {
            return "";
        }

        String temp = strs[0];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < prefixes; i++) {
            result.append(temp.charAt(i));
        }

        return result.toString();
    }

    private static int findPrefix(String[] strs, int smallest) {
        for (int i = 0; i < smallest; i++) {
            char key = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != key) {
                    return i;
                }
            }
        }

        return smallest;
    }

}