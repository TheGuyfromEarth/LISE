package graphs;

import java.util.*;

// used to find shortest distance from a given source to all other nodes in the graph
// (in terms of weight)
// valid for both directed and undirected graphs
public class DijkstrasAlgorithm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of vertices: ");
        int numVertices = input.nextInt();
        WeightedGraph graph = new WeightedGraph(numVertices);

        System.out.println("Enter number of edges: ");
        int numEdges = input.nextInt();

        List<WtPair> wtPairList = new ArrayList<>();

        for (int edge = 0; edge < numEdges; edge++) {
            int source = input.nextInt();
            int destination = input.nextInt();
            int weight = input.nextInt();
            wtPairList.add(new WtPair(source, destination, weight));
            graph.connectEdges(source, destination, weight);
        }

        // graph with nodes and desired edges having respective weights has been created
        System.out.println("Enter the source vertex: ");
        int srcVertex = input.nextInt();
        int[] dist = dijkstrasAlgorithm(graph, srcVertex);
        System.out.println(Arrays.toString(dist));
    }
    // Greedy Algorithm
    // time complexity -> O(|V| + |E|log|V|)
    public static int[] dijkstrasAlgorithm(WeightedGraph graph, int sourceVertex) {
        boolean[] visited = new boolean[graph.adjacencyList.length];
        int[] dist = new int[visited.length];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<WtPair> pq = new PriorityQueue<>();
        WtPair sourcePair = new WtPair(sourceVertex, sourceVertex, 0);
        dist[sourceVertex] = 0; // dist of source vertex with respect to itself will be always 0
        pq.add(sourcePair);

        while (!pq.isEmpty()) {

            WtPair currPair = pq.poll();

            if (visited[currPair.neighbourVertex])
                continue;

            visited[currPair.neighbourVertex] = true;

            for (WtPair neighbourPair : graph.adjacencyList[currPair.neighbourVertex]) {
                if (!visited[neighbourPair.neighbourVertex]) {
                    // Minimization of distance
                    if (dist[neighbourPair.neighbourVertex] > dist[neighbourPair.sourceVertex] + neighbourPair.weight)
                        dist[neighbourPair.neighbourVertex] = dist[neighbourPair.sourceVertex] + neighbourPair.weight;
                    pq.add(neighbourPair);
                }
            }
        }
        return dist;
    }
}
// source -> 0
// nbr -> 3
// intermediate -> 1

// 0 - 3 => infinity
// 0 - 1 => 10
// 1 - 3 => 5(wt)