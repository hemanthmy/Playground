package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class SpinWords {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(spinWords("Welcome"));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static String spinWords(String sentence) {
        String[] inputArray = sentence.split(" ");

        StringBuilder builder = new StringBuilder();
        StringBuilder builderReverser;

        for (String s : inputArray) {
            builderReverser = new StringBuilder();
            if (s.length() >= 5) {
                builderReverser.append(s);
                builder.append(builderReverser.reverse()).append(" ");
            } else {
                builder.append(s).append(" ");
            }
        }

        return builder.toString().trim();
    }
}
