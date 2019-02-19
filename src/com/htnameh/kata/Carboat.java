package com.htnameh.kata;

/**
 * @author hemanth
 * @since 8/1/19
 */
public class Carboat {

    public static void main(String[] args) {
        int m = 10000;
        int n = 9950;
        System.out.println(howMuch(m, n));
    }

    private static String howMuch(int m, int n) {
        StringBuilder result = new StringBuilder("[");

        if (m > n) {
            m = m + n;
            n = m - n;
            m = m - n;
        }

        for (int i = m; i <= n; i++) {
            if ((i % 7 == 2) && (i % 9 == 1)) {
                result.append("[M: ")
                        .append(i)
                        .append(" B: ")
                        .append(i / 7)
                        .append(" C: ")
                        .append(i / 9)
                        .append("]");
            }
        }

        return result.append("]").toString();
    }

}