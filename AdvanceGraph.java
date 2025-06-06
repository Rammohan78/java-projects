package app;

import java.util.*;

public class AdvanceGraph {

    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        void addEdge(int u, int v) {
            adjList.computeIfAbsent(u, ArrayList::new).add(v);
            adjList.computeIfAbsent(v, ArrayList::new).add(u);
        }

        void printGraph() {
            for (int node : adjList.keySet()) {
                System.out.println("Node " + node + " is connected to:");
                for (int neighbour : adjList.get(node)) {
                    System.out.println(neighbour + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph g1 = new Graph();
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(1, 4);
        g1.addEdge(1, 5);
        g1.addEdge(1, 6);
        g1.printGraph();
    }
}
