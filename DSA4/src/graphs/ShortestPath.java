package graphs;

// Given a graph, determine the shortest path in terms of no of edges
// between given source and destination.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPath {

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
        int[] distance = new int[numVertices];
        Arrays.fill(distance,-1);
        System.out.println(shortestPath(graph, distance, srcVertex, destVertex));
    }

    public static int shortestPath(Graph graph, int[] distance, int srcVertex, int destVertex){
        // bfs code
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(srcVertex);
        distance[srcVertex] = 0;

        while (!queue.isEmpty()){
            int curVertex = queue.poll();

            for(int neighbour: graph.adjacencyList[curVertex]){
                if(distance[neighbour]==-1) {
                    queue.add(neighbour);
                    distance[neighbour] = distance[curVertex] + 1;
                }

                if(neighbour == destVertex)
                    return distance[neighbour];
            }
        }
        return distance[destVertex];
    }
}
