package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 22/3/19
 */
public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abb", "def"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("tree", "cats"));
    }

    private static boolean isIsomorphic(String s, String t) {
        int[] mem1 = new int[256];
        int[] mem2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (mem1[s.charAt(i)] != mem2[t.charAt(i)]) {
                return false;
            }
            mem1[s.charAt(i)] = i + 1;
            mem2[t.charAt(i)] = i + 1;
        }
        return true;
    }

}
