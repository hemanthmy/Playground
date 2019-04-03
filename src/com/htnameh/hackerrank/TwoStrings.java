package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 26/3/19
 */
public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "bye"));
    }

    private static String twoStrings(String s1, String s2) {
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                return "YES";
        }
        return "NO";
    }
}