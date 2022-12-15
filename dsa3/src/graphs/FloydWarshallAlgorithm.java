package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// All Pair Shortest distance Algorithm
// valid for both directed and undirected graphs
public class FloydWarshallAlgorithm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of vertices: ");
        int numVertices = input.nextInt();
        WeightedGraph graph = new WeightedGraph(numVertices);

        System.out.println("Enter number of edges: ");
        int numEdges = input.nextInt();

        List<WtPair> wtPairList = new ArrayList<>();

        for (int edge = 0; edge < numEdges; edge++) {
            int source = input.nextInt();
            int destination = input.nextInt();
            int weight = input.nextInt();
            wtPairList.add(new WtPair(source, destination, weight));
            graph.connectEdges(source, destination, weight);
        }

        // graph with nodes and desired edges having respective weights has been created
        int[][] dpDist = floydWarsallAlgorithm(graph);
        for (int row = 0; row < dpDist.length; row++) {
            for (int col = 0; col < dpDist.length; col++) {
                System.out.print(dpDist[row][col]+" ");
            }
            System.out.println();
        }
    }

    // time complexity = O(V^3)
    public static int[][] floydWarsallAlgorithm(WeightedGraph graph) {
        int[][] dpDist = new int[graph.adjacencyList.length][graph.adjacencyList.length];

        for (int row = 0; row < dpDist.length; row++) {
            for (int col = 0; col < dpDist.length; col++) {
                if(row == col) // self vertex
                    dpDist[row][col] = 0;
                else
                    dpDist[row][col] = Integer.MAX_VALUE; // marking with infinity
            }
        }

        for (int index = 0; index < graph.adjacencyList.length; index++) {
            // mark distance dp for direct edges
            for (WtPair neighbourPair : graph.adjacencyList[index]) {
                dpDist[neighbourPair.sourceVertex][neighbourPair.neighbourVertex] = neighbourPair.weight;
            }
        }

        // for indirect edges weight minimization
        for (int k = 0; k < graph.adjacencyList.length; k++) {
            for (int row = 0; row < dpDist.length; row++) {
                for (int col = 0; col < dpDist.length; col++) {
                    if(row == k || col == k)
                        continue;
                    if(dpDist[row][k]!=Integer.MAX_VALUE && dpDist[k][col]!=Integer.MAX_VALUE)
                        dpDist[row][col] = Math.min(dpDist[row][col], dpDist[row][k] + dpDist[k][col]);
                }
            }
        }
        return dpDist;
    }
}
