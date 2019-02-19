package com.htnameh.graphs;

import java.util.LinkedList;

/**
 * @author hemanth
 * @since 4/1/19
 */
public class DFS {

    private LinkedList<Integer>[] adjLists;
    private boolean[] visited;

    private DFS(int numVertices) {
        adjLists = new LinkedList[numVertices];
        visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.depthFirstSearch(0);
    }

    private void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    private void depthFirstSearch(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        for (Integer adj : adjLists[vertex]) {
            if (!visited[adj]) {
                depthFirstSearch(adj);
            }
        }
    }

}