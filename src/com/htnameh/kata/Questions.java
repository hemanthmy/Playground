package com.htnameh.kata;

/**
 * @author hemanth
 * @since 15/12/18
 */
public class Questions {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}