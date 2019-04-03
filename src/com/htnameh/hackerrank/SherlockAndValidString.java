package com.htnameh.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hemanth
 * @since 20/3/19
 */
public class SherlockAndValidString {

    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("abcdefghhgfedecba"));
    }

    private static String isValid(String input) {
        char[] inputChars = input.toCharArray();
        int[] frequencyArr = new int[26];

        for (char inputChar : inputChars) {
            frequencyArr[inputChar - 97]++;
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for (int anInt : frequencyArr) {
            if (anInt != 0) {
                minFreq = Math.min(anInt, minFreq);
                maxFreq = Math.max(anInt, maxFreq);
            }
        }

        int minFreqCount = 0;
        int maxFreqCount = 0;
        Set<Integer> frequencyOfFrequencyValues = new HashSet<>();

        for (int anInt : frequencyArr) {
            if (anInt == minFreq) {
                minFreqCount++;
            }

            if (anInt == maxFreq) {
                maxFreqCount++;
            }

            if (anInt != 0) {
                frequencyOfFrequencyValues.add(anInt);
            }
        }

        if (frequencyOfFrequencyValues.size() > 2) {
            return "NO";
        } else if (frequencyOfFrequencyValues.size() == 1) {
            return "YES";
        } else if (minFreqCount == 1) {
            return "YES";
        } else if (maxFreq - maxFreqCount == minFreq) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
