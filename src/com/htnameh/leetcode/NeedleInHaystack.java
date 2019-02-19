package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 14/1/19
 */
public class NeedleInHaystack {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
//        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("aaaab", "bba"));
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) {
                return 0;
            }
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() - 1 < haystack.length() &&
                        haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

}