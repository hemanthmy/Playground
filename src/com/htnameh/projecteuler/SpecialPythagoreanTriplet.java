package com.htnameh.projecteuler;

/**
 * @author hemanth
 * @since 4/1/19
 */
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        boolean isOver = false;
        int a = 1, b = 1, c = 1;

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                c = 1000 - (i + j);

                if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(c, 2)) {

                    a = i;
                    b = j;
                    isOver = true;
                    break;
                }
            }

            if (isOver) {
                break;
            }
        }

        System.out.println(a * b * c);
    }
}
