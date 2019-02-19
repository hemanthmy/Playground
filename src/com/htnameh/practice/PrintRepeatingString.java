package com.htnameh.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintRepeatingString {

    public static void main(String[] args) {
        printDuplicateStringUsingHashMap("Java");
        printDuplicateStringUsingHashMap("Programming");
        printDuplicateStringUsingHashMap("Combination");
    }

    private static void printDuplicateStringUsingHashMap(String string) {
        char[] charArray = string.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        for (char character : charArray) {
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else {
                charMap.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("Finding duplicate characters in '%s' %n", string);
        for (Map.Entry<Character, Integer> characterIntegerEntry : entrySet) {
            if (characterIntegerEntry.getValue() > 1) {
                System.out.printf("%s : %d %n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
            }
        }
    }
}
