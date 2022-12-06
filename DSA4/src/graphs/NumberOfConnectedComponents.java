package graphs;

// In the given graph, return the count of number of connected components.

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfConnectedComponents {
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

        // count connected components
        boolean[] visited = new boolean[numVertices];
        System.out.println(countConnectedComponents(graph, visited));
    }

    public static int countConnectedComponents(Graph graph, boolean[] visited){
        // perform DFS for all nodes
        int numConnectedComponents = 0;
        for(int node=0;node<graph.adjacencyList.length;node++){
            if(!visited[node]) {
                numConnectedComponents++;
                dfsUtil(graph, visited, node);
            }
        }
        return numConnectedComponents;
    }

    private static void dfsUtil(Graph graph, boolean[] visited, int srcVertex){
        visited[srcVertex] = true;

        ArrayList<Integer> arrList = graph.adjacencyList[srcVertex];
        for(int neighbour: arrList){
            if(!visited[neighbour])
                dfsUtil(graph, visited, neighbour);
        }
    }
}
