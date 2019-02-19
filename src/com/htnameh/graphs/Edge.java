package com.htnameh.graphs;

/**
 * @author hemanth
 * @since 3/1/19
 */
public class Edge {

    int src, dest, weight;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

}