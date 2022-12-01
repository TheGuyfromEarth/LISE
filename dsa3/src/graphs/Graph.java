package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Graph {

    // adjacency List
    ArrayList<Integer>[] adjacencyList;

    public Graph(int numVertices) {
        adjacencyList = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++)
            adjacencyList[i] = new ArrayList<>();
    }

    public void connectEdges(int sourceVertex, int destinationVertex) {
        ArrayList<Integer> sourceVertexList = adjacencyList[sourceVertex];
        sourceVertexList.add(destinationVertex);
        adjacencyList[destinationVertex].add(sourceVertex);
    }

    public void dfs(int sourceVertex) {
        boolean[] visited = new boolean[adjacencyList.length];
        dfsUtil(sourceVertex, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbour : adjacencyList[vertex]) {
            if (visited[neighbour] == false)
                dfsUtil(neighbour, visited);
        }
    }

    public void bfs(int sourceVertex) {

        boolean[] visited = new boolean[adjacencyList.length];

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            // remove
            int currVertex = queue.poll();

            // print
            System.out.print(currVertex + " ");

            // mark visited
            visited[currVertex] = true;

            // add neighbours
            List<Integer> neighbourList = adjacencyList[currVertex];

            for (int neighbour : neighbourList) {
                if (!visited[neighbour])
                    queue.add(neighbour);
            }
        }
    }
}
