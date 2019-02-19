package com.htnameh.kata;

/**
 * @author hemanth
 * @since 21/1/19
 */
public class ShorterPath {

    public static void main(String[] args) {
        String[] path = directions(new String[]{"S", "S", "N", "E", "W", "S", "N"});
        String[] path2 = directions(new String[]{"N", "W", "S", "E"});
        String[] path3 = directions(new String[]{"N", "N", "N", "N", "N", "E", "N", "N"});

        // S S W W N E S S S S
        String[] path4 = directions(new String[]{"E", "N", "S", "S", "E", "E", "E", "S", "W", "E"});
    }

    private static String[] directions(String[] goal) {
        if (goal.length == 0) {
            return new String[]{""};
        }

        int[] directions = new int[4];
        int length = 0;

        for (String currentPath : goal) {
            switch (currentPath) {
                case "N":
                    if (directions[1] == 0) {
                        directions[0]++;
                        length++;
                    } else {
                        directions[1]--;
                        length--;
                    }
                    break;
                case "S":
                    if (directions[0] == 0) {
                        directions[1]++;
                        length++;
                    } else {
                        directions[0]--;
                        length--;
                    }
                    break;
                case "E":
                    if (directions[3] == 0) {
                        directions[2]++;
                        length++;
                    } else {
                        directions[3]--;
                        length--;
                    }
                    break;
                case "W":
                    if (directions[2] == 0) {
                        directions[3]++;
                        length++;
                    } else {
                        directions[2]--;
                        length--;
                    }
                    break;
            }
        }

        String[] path = new String[length];

        int j;
        int n = directions[0];

        for (j = 0; j < n; j++) {
            path[j] = "N";
        }

        for (j = directions[0]; j < n + directions[1]; j++) {
            path[j] = "S";
        }

        n = n + directions[1];

        for (j = n; j < n + directions[2]; j++) {
            path[j] = "E";
        }

        n = n + directions[2];

        for (j = n; j < n + directions[3]; j++) {
            path[j] = "W";
        }

        return length == 0 ? new String[]{""} : path;
    }

}