package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class Vowels {

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

    private static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}
