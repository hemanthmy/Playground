package com.htnameh.leetcode;

/**
 * @author hemanth
 * @since 24/1/19
 */
public class RectangleArea {

    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        System.out.println(computeArea(0, 0, 0, 0, -1, -1, 1, 1));
        System.out.println(computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
    }

    private static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rect1Area = (A - C) * (B - D);
        int rect2Area = (E - G) * (F - H);

        if (A >= G || E >= C || B <= H || F <= D) {
            return rect1Area + rect2Area;
        }
        if (rect1Area == 0) {
            return rect2Area;
        } else if (rect2Area == 0) {
            return rect1Area;
        } else {
            int smallRectArea = (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
            return rect1Area + rect2Area - smallRectArea;
        }
    }
}
