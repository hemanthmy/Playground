package com.htnameh.hackerrank;

/**
 * @author hemanth
 * @since 28/1/19
 */
public class SwapNodes {

    public static void main(String[] args) {
        int[][] result = swapNodes(new int[][]{
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1},
        }, new int[]{2, 4});

        demo(new int[][]{
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1},
        }, 3);
    }

    private static void demo(int[][] indexes, int depth) {
        StringBuilder builder = new StringBuilder();
        if (depth == 1) {
            System.out.println(indexes[0][0] + ", " + indexes[0][1]);
        } else {
            for (int i = 0; i < indexes.length; i++) {

            }
        }
    }

    private static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = new int[queries.length][indexes.length];

        int depth = 1;
        int index = 0;

        for (int query : queries) {
            if (depth % query == 0) {
                int[] temp = indexes[index];

            }
            depth = 1;
        }

        return result;
    }

    /*private void printPreOrder(LinkedList node) {
        if (node == null) {
            return;
        }

        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }*/

}