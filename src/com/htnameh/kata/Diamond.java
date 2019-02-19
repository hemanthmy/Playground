package com.htnameh.kata;

/**
 * @author hemanth
 * @since 12/12/18
 */
public class Diamond {

    public static void main(String[] args) {
        System.out.println(printDiamond(5));
    }

    public static String printDiamond(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        n = (n + 1) / 2;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                builder.append(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                builder.append("*");
            }
            builder.append("\n");

        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                builder.append(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
