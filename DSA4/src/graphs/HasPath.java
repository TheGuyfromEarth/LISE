package graphs;

// Given a graph, and a source and destination vertex, return whether there
// exists a path between the two vertices.

import java.util.Scanner;

public class HasPath {
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

        // hasPath...........

        System.out.println("Enter the source vertex: ");
        int srcVertex = input.nextInt();

        System.out.println("Enter the destination vertex: ");
        int destVertex = input.nextInt();
        boolean[] visited = new boolean[graph.adjacencyList.length];
        System.out.println(hasPath(graph, srcVertex, destVertex, visited));
    }

    public static boolean hasPath(Graph graph, int srcVertex, int destVertex,boolean[] visited){
        // perform DFS
        if(srcVertex == destVertex)
            return true;

        visited[srcVertex] = true;

        for(int neighbour: graph.adjacencyList[srcVertex]){
            if(!visited[neighbour])
                if(hasPath(graph, neighbour, destVertex, visited))
                    return true;
        }
        return false;
    }
}
