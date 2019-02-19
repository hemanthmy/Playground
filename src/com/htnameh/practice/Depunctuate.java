package com.htnameh.practice;

/**
 * @author hemanth
 * @since 25/1/19
 */
public class Depunctuate {

    public static void main(String[] args) {
        String[] result = solution(new String[]{"Twinkle twinkle little star, How I wonder what you are?"});

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] solution(String[] array) {
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().trim();
        }

        return result;
    }
}
