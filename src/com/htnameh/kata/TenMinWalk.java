package com.htnameh.kata;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class TenMinWalk {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(isValidWithFilter(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        System.out.println(isValidWithSwitch(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        Character[] charObjectArray =
                String.valueOf(walk).chars().mapToObj(c -> (char) c).toArray(Character[]::new);

        Map<Character, Long> charCountMap = Arrays.stream(charObjectArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (charCountMap.containsKey('n') && charCountMap.containsKey('s') &&
                charCountMap.get('n').equals(charCountMap.get('s'))) {
            if (charCountMap.containsKey('w') && charCountMap.containsKey('e')) {
                return charCountMap.get('w').equals(charCountMap.get('e'));
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    private static boolean isValidWithFilter(char[] walk) {
        String s = new String(walk);
        return s.chars().filter(p -> p == 'n').count() == s.chars().filter(p -> p == 's').count() &&
                s.chars().filter(p -> p == 'e').count() == s.chars().filter(p -> p == 'w').count() && s.chars().count() == 10;
    }

    private static boolean isValidWithSwitch(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0, y = 0;
        for (char c: walk) {
            switch (c) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'w': x++; break;
                case 'e': x--; break;
            }
        }

        return x == 0 && y == 0;
    }
}
