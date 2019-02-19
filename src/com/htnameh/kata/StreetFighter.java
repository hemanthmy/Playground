package com.htnameh.kata;

/**
 * @author hemanth
 * @since 10/1/19
 */
public class StreetFighter {

    public static void main(String[] args) {
        String[][] fighters = new String[][]{
                new String[] {       "",    "Ryu",  "E.Honda",  "Blanka",   "Guile", ""      },
                new String[] { "Balrog",    "Ken",  "Chun Li", "Zangief", "Dhalsim", "Sagat" },
                new String[] {   "Vega", "T.Hawk", "Fei Long",  "Deejay",   "Cammy", "M.Bison"      },
        };

        String[] moves = new String[] { "down", "down", "down", "down" };
        int[] position = new int[] {1,5};

        String[] strings = superStreetFighterize(fighters, position, moves);

        for (String string : strings) {
            System.out.print(string + " ");
        }
    }

    // { "Ryu", "Guile", "Ryu", "Guile", "Blanka" }

    private static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {
        if (moves.length == 0) {
            return new String[]{};
        }

        String[] result = new String[moves.length];

        int row = position[0];
        int col = position[1];

        int numOfRows = fighters.length;
        int numOfCols = fighters[0].length;

        int tempPos;
        String fighter;

        for (int i = 0; i < moves.length; i++) {
            String moveInstruction = moves[i];
            switch (moveInstruction) {
                case "up":
                    if (row == 0) {
                        result[i] = fighters[row][col];
                        break;
                    }

                    tempPos = row - 1;

                    fighter = fighters[tempPos][col];

                    if (fighter.equals("")) {
                        result[i] = fighters[row][col];
                        break;
                    }

                    result[i] = fighter;
                    row = tempPos;

                    break;
                case "down":
                    if (row == numOfRows - 1) {
                        result[i] = fighters[row][col];
                        break;
                    }

                    tempPos = row + 1;

                    fighter = fighters[tempPos][col];

                    if (fighter.equals("")) {
                        result[i] = fighters[row][col];
                        break;
                    }

                    result[i] = fighter;
                    row = tempPos;
                    break;
                case "left":
                    tempPos = col - 1;

                    if (tempPos < 0) {
                        tempPos = numOfCols - 1;
                    }

                    fighter = fighters[row][tempPos];

                    while (fighter.equals("")) {
                        tempPos = tempPos - 1;

                        if (tempPos < 0) {
                            tempPos = numOfCols - 1;
                        }

                        fighter = fighters[row][tempPos];
                    }

                    result[i] = fighter;
                    col = tempPos;

                    break;
                case "right":
                    tempPos = col + 1;

                    if (tempPos == numOfCols) {
                        tempPos = 0;
                    }

                    fighter = fighters[row][tempPos];

                    while (fighter.equals("")) {
                        tempPos = tempPos + 1;

                        if (tempPos == numOfCols) {
                            tempPos = 0;
                        }

                        fighter = fighters[row][tempPos];
                    }

                    result[i] = fighter;
                    col = tempPos;
                    break;
            }
        }

        return result;
    }
}
