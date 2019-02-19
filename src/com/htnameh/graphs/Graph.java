package com.htnameh.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class Graph {

    // a list of list to represent adjacency list
    public List<List<Integer>> adjacencyList = new ArrayList<>();
    public List<List<Node>> adjacencyNodeList = new ArrayList<>();

    // constructor to construct graph
    public Graph(List<Edge> edges, boolean isNode) {

        // allocate memory for adjacency list
        for (int i = 0; i < edges.size(); i++) {
            if (isNode) {
                adjacencyNodeList.add(new ArrayList<>());
            } else {
                adjacencyList.add(new ArrayList<>());
            }
        }

        // add edges to undirected graph
        for (Edge current : edges) {
            if (isNode) {
                adjacencyNodeList.get(current.src).add(new Node(current.dest, current.weight));
            } else {
                adjacencyList.get(current.src).add(current.dest);
            }
        }
    }

    Graph(List<Edge> edges, int N) {

        // allocate memory for adjacency list
        for (int i = 0; i < N; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // add edges to graph
        for (Edge edge : edges) {
            // Please note that directed is directed
            adjacencyList.get(edge.src).add(edge.dest);
        }
    }

    // print adjacency list representation of graph
    private static void printGraphWithNode(Graph graph) {
        int src = 0;

        int n = graph.adjacencyList.size();

        while (src < n) {
            for (Node edge : graph.adjacencyNodeList.get(src)) {
                System.out.print(src + " --> " + edge.value + " (" + edge.weight + ")\t");
            }

            System.out.println();
            src++;
        }
    }

    // print adjacency list representation of graph
    private static void printGraph(Graph graph) {
        int src = 0;

        int n = graph.adjacencyList.size();

        while (src < n) {
            for (Integer dest : graph.adjacencyList.get(src)) {
                System.out.print("(" + src + " --> " + dest + ")\t");
            }

            System.out.println();
            src++;
        }
    }

}
