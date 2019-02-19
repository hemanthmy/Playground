package com.htnameh.practice;

public class AnagramCheck {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.printf("Is '%s' and '%s' are anagram ? : %s %n", "yu*4#%ssBt", "#*sB4sy%tu", isAnagram("yu*4#%ssBt", "#*sB4sy%tu"));
        long endTime = System.currentTimeMillis();

        System.out.printf("Time taken in isAnagram method '%d' %n", endTime - startTime);

        startTime = System.currentTimeMillis();
        System.out.printf("Is '%s' and '%s' are anagram ? : %s %n", "yu*4#%ssBt", "#*sB4sy%tu", checkTwoStringsAreAnagram("yu*4#%ssBt", "#*sB4sy%tu"));
        endTime = System.currentTimeMillis();

        System.out.printf("Time taken in checkTwoStringsAreAnagram method '%d' %n", endTime - startTime);
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        char[] chars = firstWord.toCharArray();

        for (char aChar : chars) {
            int index = secondWord.indexOf(aChar);

            if (index != -1) {
                secondWord = secondWord.substring(0, index) + secondWord.substring(index + 1);
            } else {
                return false;
            }
        }

        return secondWord.isEmpty();
    }

    public static boolean checkTwoStringsAreAnagram(String firstWord, String secondWord) {
        if (firstWord == null || secondWord == null) {
            return false;
        }

        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        int[] charFrequency = new int[256];

        for (int i = 0; i < firstWord.length(); i++) {
            /* increment frequency count in the first string */
            charFrequency[firstWord.charAt(i)]++;
            /* decrement frequency count in the second string */
            charFrequency[secondWord.charAt(i)]--;
        }

        /* Check the frequency array */
        for (int i = 0; i  <  256; i++){
            if (charFrequency[i] != 0)
                /* Character set not same - Not an anagram */
                return false;
        }
        /* Strings are anagram */
        return true;
    }

}
