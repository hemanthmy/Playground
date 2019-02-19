package com.htnameh.kata;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class Dashatize {

    public static void main(String[] args) {
        System.out.println(dashatize(5311));
    }

    private static String dashatize(int num) {
        String input = String.valueOf(num);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1' || input.charAt(i) == '3'
                    || input.charAt(i) == '5' || input.charAt(i) == '7'
                    || input.charAt(i) == '9') {

            }
        }
        return input;
    }

}