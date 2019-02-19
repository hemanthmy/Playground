package com.htnameh.kata;

/**
 * @author hemanth
 * @since 18/1/19
 */
public class VasyaClerk {

    public static void main(String[] args) {
//        System.out.println(tickets(new int[]{25, 25, 50}));
//        System.out.println(tickets(new int[]{25, 100}));
//        System.out.println(tickets(new int[]{25, 25, 25, 25, 100, 100}));
        System.out.println(tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
//        System.out.println(tickets(new int[]{25, 25, 100}));
    }

    private static String tickets(int[] peopleInLine) {
        int[] changesLeft = new int[]{0, 0};

        for (int people : peopleInLine) {
            if (people == 25) {
                changesLeft[0]++;
            } else if (people == 50) {
                if (changesLeft[0] < 1) {
                    return "NO";
                } else {
                    changesLeft[0]--;
                    changesLeft[1]++;
                }
            } else {
                if (changesLeft[0] > 1 && changesLeft[1] > 0) {
                    changesLeft[0]--;
                    changesLeft[1]--;
                } else if (changesLeft[0] > 2) {
                    changesLeft[0]--;
                    changesLeft[0]--;
                    changesLeft[0]--;
                } else {
                    return "NO";
                }
            }
        }

        return changesLeft[0] <= 0 ? "NO" : "YES";
    }

}