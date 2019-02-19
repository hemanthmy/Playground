package com.htnameh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author hemanth
 * @since 9/1/19
 */
public class LongestSubstringWithoutDuplicates {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));           // 0
        System.out.println(lengthOfLongestSubstring(" "));          // 1
        System.out.println(lengthOfLongestSubstring("  "));         // 1
        System.out.println(lengthOfLongestSubstring("abcabcbb"));   // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));      // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));     // 3
        System.out.println(lengthOfLongestSubstring("dvdf"));       // 3
        System.out.println(lengthOfLongestSubstring("au"));         // 2
        System.out.println(lengthOfLongestSubstring("abba"));       // 2
        System.out.println(lengthOfLongestSubstring("cdd"));        // 2
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int largestSubStringLength = 0;

        Set<Character> characterSet = new CopyOnWriteArraySet<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);

            if (!characterSet.add(key)) {
                largestSubStringLength = Math.max(largestSubStringLength, characterSet.size());

                for (char ch : characterSet) {
                    if (ch == key) {
                        characterSet.remove(ch);
                        characterSet.add(key);
                        break;
                    } else {
                        characterSet.remove(ch);
                    }
                }
            }
        }

        largestSubStringLength = Math.max(largestSubStringLength, characterSet.size());

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (characterIntegerMap.containsKey(s.charAt(i))) {
                j = Math.max(characterIntegerMap.get(s.charAt(i)), j);
            }

            largestSubStringLength = Math.max(largestSubStringLength, i - j + 1);

            characterIntegerMap.put(s.charAt(i), i + 1);
        }

        return largestSubStringLength;
    }
}
