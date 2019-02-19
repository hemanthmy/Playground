package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 25/1/19
 */
public class DecodedStringAtIndex {

    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3", 10));
        System.out.println(decodeAtIndex("ha22", 5));
        System.out.println(decodeAtIndex("a23", 6));
//        System.out.println(decodeAtIndex("a2345678999999999999999", 1));
//        System.out.println(decodeAtIndex("y959q969u3hb22odq595", 222280369));
    }

    private static String decodeAtIndex(String s, int k) {
        StringBuilder builder = new StringBuilder();

        int index = k;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (k <= 0) {
                break;
            }

            if ((int) ch >= 97 && (int) ch <= 122) {
                builder.append(ch);
                k--;
            } else {
                int numericValue = Character.getNumericValue(ch);
                for (int j = 1; j < numericValue; j++) {
                    if (k == 0) {
                        break;
                    }
                    for (int w = 0; w < builder.length(); w++) {
                        k--;
                        index--;
                        if (k == 1) {
                            break;
                        }
                    }
                }
            }
        }

        return String.valueOf(builder.toString().charAt(index - 1));
    }
}
