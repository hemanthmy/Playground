package com.htnameh.practice;

/**
 * @author hemanth
 * @since 28/1/19
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(48608));
    }

    private static int reverse(int num) {
        int result = -1;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            if (result > 0) {
                result = (result * 10) + rem;
            } else {
                result = rem;
            }
        }

        return result;
    }

}