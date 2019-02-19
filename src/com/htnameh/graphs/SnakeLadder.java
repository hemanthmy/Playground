package com.htnameh.graphs;

import java.util.*;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class SnakeLadder {

    public static void main(String[] args) {
        // snakes and ladders are represented using a map.
        Map<Integer, Integer> ladder = new HashMap<>();
        Map<Integer, Integer> snake = new HashMap<>();

        // insert ladders into the map
        ladder.put(1, 38);
        ladder.put(4, 14);
        ladder.put(9, 31);
        ladder.put(21, 42);
        ladder.put(28, 84);
        ladder.put(51, 67);
        ladder.put(72, 91);
        ladder.put(80, 99);

        // insert snakes into the map
        snake.put(17, 7);
        snake.put(54, 34);
        snake.put(62, 19);
        snake.put(64, 60);
        snake.put(87, 36);
        snake.put(93, 73);
        snake.put(95, 75);
        snake.put(98, 79);

        findSolution(ladder, snake);
    }

    private static void BFS(Graph graph, int source, int N) {
        // create a queue used to do BFS
        Queue<Node> q = new ArrayDeque<>();

        // stores vertex is discovered or not
        boolean[] discovered = new boolean[N + 1];

        // mark source vertex as discovered
        discovered[source] = true;

        // assign minimum distance of source vertex as 0 and
        // push it into the queue
        Node node = new Node(source, 0);
        q.add(node);

        // run till queue is not empty
        while (!q.isEmpty()) {
            // pop front node from queue
            node = q.poll();

            // Stop BFS if we have reached last node
            if (node.value == N) {
                System.out.println(node.weight);
                break;
            }

            // do for every adjacent node of current node
            for (int u : graph.adjacencyList.get(node.value)) {
                if (!discovered[u]) {
                    // mark it discovered & push it into queue
                    discovered[u] = true;

                    // assign minimum distance of current node
                    // as minimum distance of parent node + 1
                    Node n = new Node(u, node.weight + 1);
                    q.add(n);
                }
            }
        }
    }

    private static void findSolution(Map<Integer, Integer> ladder,
                                     Map<Integer, Integer> snake) {
        // Number of vertices in the graph
        int N = 10 * 10;

        // find all edges involved and store them in a vector
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= 6 && i + j <= N; j++) {

                // update destination if there is any ladder
                // or snake from current position.
                int dest;

                int _ladder = (ladder.get(i + j) != null) ?
                        ladder.get(i + j) : 0;

                int _snake = (snake.get(i + j) != null) ?
                        snake.get(i + j) : 0;

                if (_ladder != 0 || _snake != 0)
                    dest = _ladder + _snake;
                else
                    dest = i + j;

                // add edge from src to dest
                edges.add(new Edge(i, dest));
            }
        }

        // construct directed graph
        Graph g = new Graph(edges, N);

        // Find Shortest path between 1 and 100 using BFS
        BFS(g, 1, N);
    }

}