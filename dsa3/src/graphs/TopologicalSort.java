package graphs;

// Topological Sort is referred to that permutation of graph
// in which all vertices of edges represented by u,v are present
// such that u always appears before v in the topological sort.

import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {

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
            graph.connectDirectedEdges(source, destination);
        }

        // graph with nodes and desired edges has been created

        topologicalSort(graph);
    }

    public static void topologicalSort(Graph graph) {
        boolean[] visited = new boolean[graph.adjacencyList.length];
        Stack<Integer> stack = new Stack<>();
        dfs(graph, 0, visited, stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void dfs(Graph graph, int sourceVertex, boolean[] visited, Stack<Integer> stack) {
        visited[sourceVertex] = true;

        for (int neighbourVertex : graph.adjacencyList[sourceVertex]) {
            if (!visited[neighbourVertex]) {
                dfs(graph, neighbourVertex, visited, stack);
            }
        }
        stack.push(sourceVertex);
    }
}
