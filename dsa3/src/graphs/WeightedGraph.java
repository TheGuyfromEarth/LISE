package graphs;

import java.util.ArrayList;

public class WeightedGraph {

    ArrayList<WtPair>[] adjacencyList;

    public WeightedGraph(int numVertices){
        adjacencyList = new ArrayList[numVertices];
        for(int i=0;i<adjacencyList.length;i++)
            adjacencyList[i] = new ArrayList<>();
    }

    public void connectEdges(int source, int destination, int weight){
        // for source
        ArrayList<WtPair> wtPairArrayList =  adjacencyList[source];
        WtPair wtPair = new WtPair(source, destination, weight);
        wtPairArrayList.add(wtPair);

        // for destination
        adjacencyList[destination].add(new WtPair(destination, source,weight));
    }
}

class WtPair implements Comparable<WtPair>{

    int sourceVertex;
    int neighbourVertex;
    int weight;

    public WtPair(int sourceVertex, int neighbourVertex, int weight){
        this.sourceVertex = sourceVertex;
        this.neighbourVertex = neighbourVertex;
        this.weight = weight;
    }

    @Override
    public int compareTo(WtPair otherObj) {
        return this.weight- otherObj.weight;
    }
}