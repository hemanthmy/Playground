package com.htnameh.kata;

/**
 * @author hemanth
 * @since 18/1/19
 */
public class SpellingBee {

    public static void main(String[] args) {
        char[][] hive = new char[][]{
                {'e', 'b', ' ', 'e', ' ', 'b', 'e', ' ', 'e'},
                {'e', ' ', 'e', ' ', 'e', ' ', 'e', 'e', 'b'},
                {'e', 'b', ' ', ' ', ' ', 'e', 'e', 'e', 'b'},
                {'b', ' ', 'e', ' ', ' ', 'e', 'b', 'e', 'e'},
                {'e', 'e', 'e', 'e', ' ', 'b', ' ', ' ', 'b'},
                {'b', ' ', 'e', 'e', 'b', ' ', ' ', 'e', 'e'},
                {'e', 'b', 'b', ' ', ' ', 'e', 'e', 'e', ' '},
                {'e', ' ', ' ', ' ', 'b', 'e', 'b', 'e', 'e'},
                {'e', 'b', ' ', 'e', 'b', 'e', 'e', ' ', ' '}
        };

        System.out.println(howManyBees(hive));
    }

    private static int howManyBees(final char[][] hive) {
        if (hive == null || hive.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < hive.length; i++) {
            for (int j = 0; j < hive[0].length; j++) {
                if (hive[i][j] == 'b') {
                    System.out.println(i);
                    if (i >= 2) {
                        // check up
                        if (hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e') {
                            count++;
                        }
                    }
                    if (j >= 2) {
                        // check left
                        if (hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e') {
                            count++;
                        }
                    }
                    if (i <= hive.length - 3) {
                        // check down
                        if (hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e') {
                            count++;
                        }
                    }
                    if (j <= hive[0].length - 2) {
                        // check right
                        if (hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e') {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

}