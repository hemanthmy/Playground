package com.htnameh.kata;

/**
 * @author hemanth
 * @since 17/1/19
 */
public class BouncingBall {

    public static void main(String[] args) {
//        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
    }

    private static int bouncingBall(double h, double bounce, double window) {
        if (h < window || bounce >= 1.0 || bounce < 0 || h <= 0) {
            return -1;
        }

        int count = 0;

        while (h > window) {
            System.out.println(h);
            h = h * bounce;
            count++;
        }

        return (count * 2) - 1;
    }

}