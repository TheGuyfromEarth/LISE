package graphs;

// Given a graph, determine whether a cycle exists in the graph or not.

import java.util.Scanner;

public class IsCyclic {

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
        System.out.println(isCyclic(graph));
    }

    public static boolean isCyclic(Graph graph) {
        boolean[] visited = new boolean[graph.adjacencyList.length];
        return dfs(graph, 0, visited, -1);
    }

    private static boolean dfs(Graph graph, int srcVertex, boolean[] visited, int prevVertex) {

        visited[srcVertex] = true;

        for (int neighbour : graph.adjacencyList[srcVertex]) {
            // check to make sure that we do not consider the prev vertex and the curr vertex a cycle
            if (visited[neighbour] && neighbour == prevVertex)
                continue;
                // unvisited
            else if (!visited[neighbour])
                dfs(graph, neighbour, visited, srcVertex);
                // cycle exists
            else
                return true;
        }
        return false;
    }
}
