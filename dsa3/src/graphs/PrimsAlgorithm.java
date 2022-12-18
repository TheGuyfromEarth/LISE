package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgorithm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of vertices: ");
        int numVertices = input.nextInt();
        WeightedGraph graph = new WeightedGraph(numVertices);

        System.out.println("Enter number of edges: ");
        int numEdges = input.nextInt();

        for (int edge = 0; edge < numEdges; edge++) {
            int source = input.nextInt();
            int destination = input.nextInt();
            int weight = input.nextInt();
            graph.connectEdges(source, destination, weight);
        }

        // graph with nodes and desired edges having respective weights has been created
        primsAlgorithm(graph);
    }

    // time complexity => O(|V|+|E|log|E|) (tc of our code)
    // time complexity => O(|V|+|E|log|V|) (standard prim's algorithm)
    public static void primsAlgorithm(WeightedGraph wtGraph){
        boolean[] visited = new boolean[wtGraph.adjacencyList.length];
                PriorityQueue<WtPair> pq = new PriorityQueue<>();
                WtPair sourcePair = new WtPair(0,0,0); // hardcoding the source
                pq.add(sourcePair);
                int totWt = 0;

                while (!pq.isEmpty()){
                    WtPair currPair = pq.poll();

                    if(visited[currPair.neighbourVertex])
                        continue;

                    visited[currPair.neighbourVertex] = true;
                    // to avoid very first case where source and neighbour are same (0)
                    if(currPair.sourceVertex != currPair.neighbourVertex) {
                        System.out.println("From " + currPair.sourceVertex + " to " + currPair.neighbourVertex);
                        totWt+=currPair.weight;
                    }

                    for(WtPair neighbourPair: wtGraph.adjacencyList[currPair.neighbourVertex]){
                        if(!visited[neighbourPair.neighbourVertex])
                            pq.add(neighbourPair);
            }
        }
        System.out.println("Tot Wt: "+totWt);
    }
}
