package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 19/12/18
 */
public class GarysHike {

    static int solution(int n, String s) {
        int valleys = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                start++;
            } else {
                start--;
            }

            if (start == 0 && s.charAt(i) == 'U') {
                valleys++;
            }
        }

        return valleys;
    }
}
