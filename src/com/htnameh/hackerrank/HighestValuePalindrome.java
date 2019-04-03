package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 20/3/19
 */
public class HighestValuePalindrome {

    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("092282", 6, 3));
        System.out.println(highestValuePalindrome("3943", 4, 1));
        System.out.println(highestValuePalindrome("0011", 4, 1));
    }

    private static String highestValuePalindrome(String s, int n, int k) {
        char[] charArr = s.toCharArray();
        int count = k;

        for (int start = 0, end = charArr.length - 1; start < end; start++, end--) {
            if (charArr[start] != charArr[end]) {
                char maxChar = charArr[start] > charArr[end] ? charArr[start] : charArr[end];
                charArr[start] = maxChar;
                charArr[end] = maxChar;
                count--;
            }
        }

        if (count < 0) {
            return "-1";
        } else {
            return String.valueOf(charArr);
        }
    }

}