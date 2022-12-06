package graphs;

// Hamiltonian Path: A path in which you traverse across all vertices in a graph and
// each vertex should be traversed only once.

// Hamiltonian Cycle: A path in which you traverse across all vertices in a graph and
// each vertex should be traversed only once, and the last vertex in the path should be
// one edge away from the source.

import java.util.HashSet;
import java.util.Scanner;

public class HamiltonianPaths {
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
        HashSet<Integer> hashSet = new HashSet<>();
        printHamiltonianPaths(graph, srcVertex, srcVertex, hashSet,""+srcVertex);
    }

    public static void printHamiltonianPaths(Graph graph, int currVertex, int orgSrcVertex, HashSet<Integer> visitedSet, String path){
        // DFS code
        if(visitedSet.size() == graph.adjacencyList.length - 1)
        {
            boolean isCycle = false;

            for(int nbr: graph.adjacencyList[currVertex]){
                if(nbr == orgSrcVertex) {
                    isCycle = true;
                    System.out.println("Hamiltonian Cycle: " + path);
                }
            }
            if(!isCycle)
                System.out.println("Hamiltonian Path: "+path);
            return;
        }

        visitedSet.add(currVertex);

        for(int neighbour: graph.adjacencyList[currVertex]){
            if(!visitedSet.contains(neighbour))
                printHamiltonianPaths(graph, neighbour, orgSrcVertex, visitedSet,path+" "+neighbour);
        }
        visitedSet.remove(currVertex);
    }
}
