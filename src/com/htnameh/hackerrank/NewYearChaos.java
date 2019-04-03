package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 1/4/19
 */
public class NewYearChaos {

    public static void main(String[] args) {
        minimumBribes(new int[]{2, 1, 5, 3, 4});
    }

    private static void minimumBribes(int[] q) {
        int answer = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

}