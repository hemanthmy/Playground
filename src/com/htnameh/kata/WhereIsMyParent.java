package com.htnameh.kata;

import java.util.TreeMap;

/**
 * @author hemanth
 * @since 17/1/19
 */
public class WhereIsMyParent {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(findChildren("AaaaaZazzz"));
        System.out.println(findChildren("CbcBcbaA"));
        System.out.println(findChildren("xXfuUuuF"));
        System.out.println(findChildren(""));
        System.out.println(System.nanoTime() - start);

        System.out.println("======================");

        start = System.nanoTime();
        System.out.println(findChildren2("AaaaaZazzz"));
        System.out.println(findChildren2("CbcBcbaA"));
        System.out.println(findChildren2("xXfuUuuF"));
        System.out.println(findChildren2(""));
        System.out.println(System.nanoTime() - start);

        System.out.println("======================");

        start = System.nanoTime();
        System.out.println(findChildren3("AaaaaZazzz"));
        System.out.println(findChildren3("CbcBcbaA"));
        System.out.println(findChildren3("xXfuUuuF"));
        System.out.println(findChildren3(""));
        System.out.println(System.nanoTime() - start);
    }

    private static String findChildren3(final String text) {
        if (text.isEmpty()) {
            return "";
        }

        int[] counter = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            if (key - 32 >= 65 && key - 32 <= 90) {
                int index = key - 97;
                counter[index]++;
            }
        }

        String[] output = new String[text.length()];

        int index = 0;

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                output[index] = String.valueOf((char) (i + 65));
                index++;

                for (int j = 0; j < counter[i]; j++) {
                    output[index] = String.valueOf((char) (i + 97));
                    index++;
                }
            }
        }

        return String.join("", output);
    }

    private static String findChildren2(final String text) {
        if (text.isEmpty()) {
            return "";
        }

        int[] counter = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            if (key >= 65 && key <= 90) {
                int index = key - 65;
                counter[index]++;
            }

            if (key - 32 >= 65 && key - 32 <= 90) {
                int index = key - 97;
                counter[index]++;
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                builder.append((char) (i + 65));

                for (int j = 0; j < counter[i] - 1; j++) {
                    builder.append((char) (i + 97));
                }
            }
        }

        return builder.toString();
    }

    private static String findChildren(final String text) {
        if (text.isEmpty()) {
            return "";
        }

        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            if (key >= 65 && key <= 90) {
                treeMap.put(key, treeMap.getOrDefault(key, 0));
            } else if (key - 32 >= 65 && key - 32 <= 90) {
                char k = (char) (key - 32);
                treeMap.put(k, treeMap.getOrDefault(k, 0) + 1);
            }
        }

        StringBuilder builder = new StringBuilder();

        for (Character character : treeMap.keySet()) {
            builder.append(character);

            int c = treeMap.get(character);

            for (int i = 0; i < c; i++) {
                builder.append(character.toString().toLowerCase());
            }
        }

        return builder.toString();
    }

}