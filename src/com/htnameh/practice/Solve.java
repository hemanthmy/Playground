package com.htnameh.practice;


/**
 * @author hemanth
 * @since 21/12/18
 */
public class Solve {

    public static void main(String[] args) {
        // 00:61:FD:5F:88:63:42:41:B7:DC:7B:02:AC:6D:0B:A7:BB:0A:18:DF

        /*byte[] sha1 = { 0x00, 0x61, (byte)0xFD, 0x5F, (byte)0x88, 0x63, 0x42, 0x41, (byte)0xB7, (byte)0xDC, (byte)0x7B, 0x02, (byte)0xAC, 0x6D, 0x0B, (byte)0xA7, (byte)0xBB, 0x0A, (byte)0x18, (byte)0xDF };

        System.out.println("keyhashGooglePlaySignIn:"+ Base64.getEncoder().encodeToString(sha1));*/

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