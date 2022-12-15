package graphs;

import java.util.Scanner;
import java.util.Stack;

// 1) Topological Sort
// 2) Perform Transpose of graph
// 3) Perform DFS for all nodes according to stack

public class KosarajuAlgorithm {

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
        System.out.println(countStronglyConnectedComponents(graph));
    }

    public static int countStronglyConnectedComponents(Graph graph) {
        // topological sort
        Stack<Integer> stack = topologicalSort(graph);
        // transpose
        Graph transposeGraph = transposeGraph(graph);
        // perform DFS according to stack
        boolean[] visited = new boolean[transposeGraph.adjacencyList.length];
        int numStronglyConnectedComponents = 0;
        while (!stack.isEmpty()){
            int currVertex = stack.pop();
            if(!visited[currVertex]) {
                dfsTransposeGraph(transposeGraph, currVertex, visited);
                numStronglyConnectedComponents++;
            }
        }
        return numStronglyConnectedComponents;
    }

    private static void dfsTransposeGraph(Graph transposeGraph, int sourceVertex, boolean[] visited){

        visited[sourceVertex] = true;

        for(int neighbour: transposeGraph.adjacencyList[sourceVertex]){
            if(!visited[neighbour])
                dfsTransposeGraph(transposeGraph, neighbour, visited);
        }
    }

    private static Graph transposeGraph(Graph graph) {

        Graph transposeGraph = new Graph(graph.adjacencyList.length);

        for (int vertex = 0; vertex < graph.adjacencyList.length; vertex++) {
            for (int neighbour : graph.adjacencyList[vertex]) {
                transposeGraph.connectDirectedEdges(neighbour,vertex);
            }
        }
        return transposeGraph;
    }

    public static Stack<Integer> topologicalSort(Graph graph) {
        boolean[] visited = new boolean[graph.adjacencyList.length];
        Stack<Integer> stack = new Stack<>();
        dfs(graph, 0, visited, stack);
        return stack;
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
