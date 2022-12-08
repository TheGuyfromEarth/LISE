package graphs;

import java.util.*;

// used to create MST (Minimum Spanning Tree)
public class KruskalsAlgorithm {

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
            wtPairList.add(new WtPair(source,destination,weight));
            graph.connectEdges(source, destination, weight);
        }

        // graph with nodes and desired edges having respective weights has been created
        createMST(graph, wtPairList);

    }

    public static void createMST(WeightedGraph graph, List<WtPair> wtPairList){
        int totWt = 0;
        // create all vertices
        DisjointSetUnion dsu = new DisjointSetUnion(graph.adjacencyList.length);

        for(int i = 0; i<graph.adjacencyList.length; i++)
            dsu.make(i);

        Collections.sort(wtPairList);

        for(WtPair wtPair: wtPairList){
            int sourceParent = dsu.find(wtPair.sourceVertex);
            int destParent = dsu.find(wtPair.neighbourVertex);

            if(sourceParent == destParent)
            {
                // they belong to same set, hence will create a cycle
                continue;
            }else{
                // they belong to two different sets, hence can be used in MST and perform union
                dsu.union(wtPair.sourceVertex, wtPair.neighbourVertex);
                System.out.println("Source: "+wtPair.sourceVertex+" dest: "+wtPair.neighbourVertex);
                totWt+=wtPair.weight;
            }
        }
        System.out.println("totWt = "+totWt);
    }
}
