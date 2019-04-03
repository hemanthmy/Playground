package com.htnameh.practice;


import java.util.Base64;

/**
 * @author hemanth
 * @since 21/12/18
 */
public class Solve {

    public static void main(String[] args) {
//        00:61:FD:5F:88:63:42:41:B7:DC:7B:02:AC:6D:0B:A7:BB:0A:18:DF
//        F0:46:78:50:AC:93:94:C0:C9:B0:31:57:13:AC:5C:97:38:DB:99:83

        byte[] sha1 = {(byte) 0xF0, 0x46, (byte) 0x78, (byte) 0x50, (byte) 0xAC, (byte) 0x93, (byte) 0x90, (byte) 0xC0, (byte) 0xC9, (byte) 0xB0,
                (byte) 0x31, (byte) 0x57, (byte) 0x13, (byte) 0xAC, (byte) 0x5C, (byte) 0x97, 0x38, (byte) 0xDB, (byte) 0x99, (byte) 0x83,};

        System.out.println("keyhashGooglePlaySignIn:" + Base64.getEncoder().encodeToString(sha1));

        String input = "htnameh";

        char[] inputArray = input.toCharArray();

        for (int start = 0, end = inputArray.length - 1; start < end; start++, end--) {
            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
        }

        System.out.println(inputArray);

        System.out.println(findMissing(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 8, -7, 3, 1},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 8, -7, 1}));

        System.out.println(findMissing(new int[]{-1, -2, -8, -7, -3, -6},
                new int[]{-1, -2, -8, -7, -3, -6}));

        // [4, 12, 8, 7, 3, 1]
        // [4, 12, 8, 3, 1]

        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    }

    private static int findMissing(int[] first, int[] second) {
        int sum = 0;

        int length = first.length > second.length ? second.length : first.length;

        if (length == first.length) {
            sum += second[second.length - 1];
        } else {
            sum += first[first.length - 1];
        }

        while (length > 0) {
            sum += first[length - 1];
            sum -= second[length - 1];
            length--;
        }

        return sum;
    }

}