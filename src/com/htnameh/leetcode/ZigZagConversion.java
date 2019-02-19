package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 8/2/19
 */
public class ZigZagConversion {

    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
        System.out.println(convert("PAYPALISHIRING", 5));
    }

    private static String convert(String s, int numRows) {
        if (numRows == s.length()) {
            return s;
        }

        StringBuilder builder = new StringBuilder();

        int index = 2;
        for (int i = 0; i < numRows; i++) {
            int currentIndex = i;

            while (currentIndex < s.length()) {
                builder.append(s.charAt(currentIndex));
                if ((numRows * 2) != index) {
                    currentIndex = currentIndex + ((numRows * 2) - index);
                } else {
                    currentIndex = currentIndex + ((numRows - 1) * 2);
                }
            }

            index += 2;
        }

        return builder.toString();
    }

}