package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class DigPow {

    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
        System.out.println(digPowWithString(46288, 3));
    }

    private static long digPow(int n, int p) {
        long total = 0;
        int input = 0;
        int oInput = n;

        while (n != 0) {
            int digit = n % 10;
            input = input * 10 + digit;
            n /= 10;
        }

        do {
            int rem = input % 10;
            input = input / 10;

            total += Math.pow(rem, p++);
        } while (input != 0);

        return total % oInput == 0 ? total / oInput : -1;
    }

    private static long digPowWithString(int n, int p) {
        String input = String.valueOf(n);

        long sum = 0;

        for (int i = 0; i < input.length(); i++) {
            sum += Math.pow(input.charAt(i) - '0', p++);
        }

        return sum % n == 0 ? sum / n : -1;
    }
}
