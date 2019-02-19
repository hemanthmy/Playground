package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class AlternatingSplitEncryption {

    static String encrypt(String text, int n) {
        if (text == null) {
            return null;
        }

        if (text.isEmpty()) {
            return "";
        }

        if (n <= 0) {
            return text;
        }

        StringBuilder builder;

        do {
            builder = new StringBuilder();
            int index = 1;
            for (int j = 0; j <= text.length(); j++) {
                if (index <= text.length() - 1) {
                    builder.append(text.charAt(index));
                    index += 2;
                } else {
                    index = 0;
                }
            }
            text = builder.toString();
            n--;
        } while (n != 0);

        return builder.toString();
    }

    static String decrypt(String text, int n) {
        if (text == null) {
            return null;
        }

        if (text.isEmpty()) {
            return "";
        }

        if (n <= 0) {
            return text;
        }

        char[] charArray = new char[text.length()];

        do {
            int index = 1;
            for (int j = 0; j <= text.length() - 1; j++) {
                if (index >= text.length()) {
                    index = 0;
                }

                charArray[index] = text.charAt(j);
                index += 2;
            }
            text = new String(charArray);
            n--;
        } while (n != 0);

        return new String(charArray);
    }
}
