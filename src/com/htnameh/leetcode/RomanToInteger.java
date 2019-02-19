package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class RomanToInteger {

    //I - 1
    //V - 5
    //X - 10
    //L - 50
    //C - 100
    //D - 500
    //M - 1000

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      // 3
        System.out.println(romanToInt("IV"));       // 4
        System.out.println(romanToInt("IX"));       // 9
        System.out.println(romanToInt("LVIII"));    // 58
        System.out.println(romanToInt("MCMXCIV"));  // 1994
    }

    private static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                result += 1;
            } else if (ch == 'V') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result += 3;
                } else {
                    result += 5;
                }
            } else if (ch == 'X') {
                if (i != 0 && s.charAt(i - 1) == 'I') {
                    result += 8;
                } else {
                    result += 10;
                }
            } else if (ch == 'L') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result += 30;
                } else {
                    result += 50;
                }
            } else if (ch == 'C') {
                if (i != 0 && s.charAt(i - 1) == 'X') {
                    result += 80;
                } else {
                    result += 100;
                }
            } else if (ch == 'D') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result += 300;
                } else {
                    result += 500;
                }
            } else if (ch == 'M') {
                if (i != 0 && s.charAt(i - 1) == 'C') {
                    result += 800;
                } else {
                    result += 1000;
                }
            }
        }

        return result;
    }

}