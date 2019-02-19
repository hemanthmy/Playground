package com.htnameh.graphs;

import java.util.*;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class SnakeLadderGame {

    private static boolean isGameOver = false;

    public static void main(String[] args) {
        Map<Integer, Integer> snakesOrLadders = new HashMap<>();

        // insert ladders
        snakesOrLadders.put(1, 38);
        snakesOrLadders.put(4, 14);
        snakesOrLadders.put(9, 31);
        snakesOrLadders.put(21, 42);
        snakesOrLadders.put(28, 84);
        snakesOrLadders.put(51, 67);
        snakesOrLadders.put(72, 91);
        snakesOrLadders.put(80, 99);

        // insert snakes
        snakesOrLadders.put(17, 7);
        snakesOrLadders.put(54, 34);
        snakesOrLadders.put(62, 19);
        snakesOrLadders.put(64, 60);
        snakesOrLadders.put(87, 36);
        snakesOrLadders.put(93, 73);
        snakesOrLadders.put(95, 75);
        snakesOrLadders.put(98, 79);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play with your friend on your own? [Y/N]");

        String answer = scanner.nextLine();

        boolean playOnOwn = false;

        if (answer.equalsIgnoreCase("y")) {
            playOnOwn = true;
        }

        System.out.print("Enter number of players : ");

        int numOfPlayers = scanner.nextInt();

        int[] playersIndex = new int[numOfPlayers + 1];
        Arrays.fill(playersIndex, 1);

        while (!isGameOver) {
            for (int i = 1; i <= numOfPlayers; i++) {
                if (playOnOwn) {
                    System.out.print("Player " + i + "s turn : ");
                    scanner.nextLine();
                }
                int dice = rollDice();

                System.out.println("Player " + i + " threw dice -> " + dice);

                int currentNode = playGame(snakesOrLadders, playersIndex[i], dice);

                System.out.println("Player " + i + " moved his pawn from " + playersIndex[i] + " to " + currentNode);

                if (currentNode == 100) {
                    isGameOver = true;
                    System.out.println();
                    System.out.println("==============================");
                    System.out.println("PLAYER " + i + " WON THE GAME");
                    System.out.println("==============================");
                    break;
                } else if (currentNode < 100) {
                    playersIndex[i] = currentNode;
                }
            }
        }
    }

    private static int playGame(Map<Integer, Integer> edges, int currentNode, int dice) {
        currentNode = currentNode + dice;

        if (edges.containsKey(currentNode)) {
            if (edges.get(currentNode) > currentNode) {
                System.out.println("    Found ladder -> " + currentNode);
                System.out.println("    Climbing ladder -> " + edges.get(currentNode));
            } else {
                System.out.println("    Found snake -> " + currentNode);
                System.out.println("    Bitten by snake -> " + edges.get(currentNode));
            }

            currentNode = edges.get(currentNode);
        }

        return currentNode;
    }

    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
