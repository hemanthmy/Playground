package com.htnameh.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 26/3/19
 */
public class RansomNote {

    public static void main(String[] args) {
        checkMagazine("give me one grand today night".split(" "),
                "give one grand today".split(" "));
        checkMagazine("two times three is not four".split(" "),
                "two times two is four".split(" "));
        checkMagazine("ive got a lovely bunch of coconuts".split(" "),
                "ive got some coconuts".split(" "));
        checkMagazine("abc abc def abc".split(" "),
                "abc abc def".split(" "));
    }

    private static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (String str : magazine) {
            stringIntegerMap.put(str, stringIntegerMap.getOrDefault(str, 0) + 1);
        }

        String result = "Yes";

        for (String str : note) {
            if (stringIntegerMap.containsKey(str)
                    && stringIntegerMap.get(str) != 0) {
                stringIntegerMap.put(str, stringIntegerMap.getOrDefault(str, 0) - 1);
            } else {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }

}