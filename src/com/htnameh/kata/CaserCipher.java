package com.htnameh.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author hemanth
 * @since 7/1/19
 */
public class CaserCipher {

    private static String[] lowerCase = new String[]{"a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z"};

    private static String[] upperCase = new String[]{"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) {
        String u = "I should have known that you would have a perfect answer for me!!!";
        System.out.println(u);
        List<String> encrypt = encrypt(u, 1);
        System.out.println(encrypt);
        System.out.print(deEncrypt(encrypt, 1));
    }

    private static List<String> encrypt(String text, int s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> result = new ArrayList<>();

        int start = 0;
        int currentIndex = 0;
        int length = text.length();
        int threshHold = length / 4;
        int spaceIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            currentIndex++;
            if (Pattern.compile("[a-zA-Z0-9]").matcher(text.charAt(i) + "").matches()) {
                if (Character.isUpperCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            s++ - 65) % 26 + 65);
                    stringBuilder.append(ch);
                } else {
                    char ch = (char) (((int) text.charAt(i) +
                            s++ - 97) % 26 + 97);
                    stringBuilder.append(ch);
                }
            } else {
                s++;
                stringBuilder.append(text.charAt(i));
                if (text.charAt(i) == ' ') {
                    // 16 -> 14
                    // [2, 7, 5, 6, 5, 4, 6, 5, 2, 8, 7, 4, 6]
                    //     14   |
                    // I should have known
                    // I should have |

                    if (currentIndex > threshHold) {
                        if (start + currentIndex > length) {
                            result.add(stringBuilder.substring(start));
                        } else {
                            String substring = stringBuilder.substring(start, spaceIndex + 1);

                            result.add(substring);

                            start = spaceIndex + 1;
                            threshHold = threshHold - (threshHold - substring.length());
                            currentIndex = 0;
                        }
                    } else if (currentIndex - 1 == threshHold) {
                        currentIndex = currentIndex - 1;

                        if (start + currentIndex > length) {
                            result.add(stringBuilder.substring(start));
                        } else {
                            String substring = stringBuilder.substring(start, spaceIndex + 1);

                            result.add(substring);

                            start = spaceIndex + 1;
                            threshHold = threshHold - (threshHold - substring.length());
                            currentIndex = 0;
                        }
                    }

                    spaceIndex = i;
                }
            }
        }

        return result;
    }

    private static String deEncrypt(List<String> list, int s) {
        StringBuilder result = new StringBuilder();
        StringBuilder text = new StringBuilder();
        for (String t : list) {
            text.append(t);
        }
        for (int i = 0; i < text.length(); i++) {
            if (Pattern.compile("[a-zA-Z0-9]").matcher(text.charAt(i) + "").matches()) {
                if (Character.isUpperCase(text.charAt(i))) {
                    int charAt = (int) text.charAt(i);

                    int temp = (charAt - 65) - s++;

                    if (temp < 0) {
                        temp = Math.abs(26 - (Math.abs(temp) % 26)) % 26;
                    } else if (temp >= 26) {
                        temp = temp % 26;
                    }

                    result.append(upperCase[temp]);
                } else {
                    int charAt = (int) text.charAt(i);

                    int temp = (charAt - 97) - s++;

                    if (temp < 0) {
                        temp = Math.abs(26 - (Math.abs(temp) % 26)) % 26;
                    } else if (temp >= 26) {
                        temp = temp % 26;
                    }

                    result.append(lowerCase[temp]);
                }
            } else {
                s++;
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }
}