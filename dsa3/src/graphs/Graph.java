package graphs;

import java.util.ArrayList;

public class Graph {

    // adjacency List
    ArrayList<Integer>[] adjacencyList;

    public Graph(int numVertices) {
        adjacencyList = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++)
            adjacencyList[i] = new ArrayList<>();
    }

    public void connectEdges(int sourceVertex, int destinationVertex) {
        adjacencyList[sourceVertex].add(destinationVertex);
        adjacencyList[destinationVertex].add(sourceVertex);
    }
}
