package graphs;

// There are certain people in a group where people are represented by graph vertices. At t=0, given
// that person 0 is already infected, then considering that by each second, it's neighbours get infected,
// return the count of infected persons at t = n.

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InfectedSpread {
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

        // input for time instant
        System.out.println("Enter the time instant: ");
        int finalTime = input.nextInt();
        System.out.println(numPersonsInfected(graph, finalTime));
    }

    public static int numPersonsInfected(Graph graph, int finalTime) {
        boolean[] visited = new boolean[graph.adjacencyList.length];
        return bfs(graph, visited, finalTime);
    }

    private static int bfs(Graph graph, boolean[] visited, int finalTime) {
        int count = 0;
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {
            Pair currPair = queue.poll();

            if (visited[currPair.vertex])
                continue;

            if (currPair.timeInstant > finalTime)
                return count;

            visited[currPair.vertex] = true;
            count++;

            for (int neighbour : graph.adjacencyList[currPair.vertex]) {
                if (!visited[neighbour]) {
                    queue.add(new Pair(neighbour, currPair.timeInstant + 1));
                }
            }
        }
        return count;
    }
}

class Pair {
    int vertex;
    int timeInstant;

    public Pair(int vertex, int timeInstant) {
        this.vertex = vertex;
        this.timeInstant = timeInstant;
    }
}