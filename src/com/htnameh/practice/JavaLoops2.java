package com.htnameh.practice;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int previousValue = a + b;

            System.out.print(previousValue + " ");

            for (int j = 1; j < n; j++) {
                int value = (int) (Math.pow(2, j) * b);
                previousValue += value;
                System.out.print(previousValue + " ");
            }
        }
        in.close();
    }
}
