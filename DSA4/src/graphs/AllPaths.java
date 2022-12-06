package graphs;

// Given a graph, and a source and destination vertex, print all the possible paths
// between the two vertices.

import java.util.Scanner;

public class AllPaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of vertices: ");
        int numVertices = input.nextInt();
        Graph graph = new Graph(numVertices);

        System.out.println("Enter number of edges: ");
        int numEdges = input.nextInt();

        for (int edge = 0; edge < numEdges; edge++) {
            int source = input.nextInt();
            int destination = input.nextInt();
            graph.connectEdges(source, destination);
        }

        // graph with nodes and desired edges has been created

        System.out.println("Enter the source vertex: ");
        int srcVertex = input.nextInt();

        System.out.println("Enter the destination vertex: ");
        int destVertex = input.nextInt();

        // allPaths.....
        boolean[] visited = new boolean[numVertices];
        printAllPaths(graph, srcVertex, destVertex, visited, ""+srcVertex);
    }

    public static void printAllPaths(Graph graph, int srcVertex, int destVertex, boolean[] visited, String path) {
        if (srcVertex == destVertex) {
            // print path
            System.out.println(path);
            return;
        }
        visited[srcVertex] = true;
        for (int neighbour : graph.adjacencyList[srcVertex]) {
            if (!visited[neighbour]) {
                printAllPaths(graph, neighbour, destVertex, visited,path+" "+neighbour);
            }
        }
        visited[srcVertex] = false;
    }
}
