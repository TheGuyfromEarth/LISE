package graphs;

// Disjoint Set Union has 3 main operations:
// 1) make
// 2) find
// 3) union

public class DisjointSetUnion {
    int[] parent;
    int[] size;

    // to create a vertex/node
    public void make(int vertex){
        // update parent of vertex as itself
        parent[vertex] = vertex;
        size[vertex] = 1;
    }

    // return the parent of given vertex
    public int find(int vertex){
        if(parent[vertex] == vertex)
            return vertex;
        // Path Compression
        return parent[vertex] = find(parent[vertex]);
    }

    // perform union(combine) two sets into one
    public void union(int vertexA, int vertexB){
        int parentA = find(vertexA);
        int parentB = find(vertexB);

        // union by size
        if(size[parentA]<size[parentB]) {
            parent[parentA] = parentB;
            size[parentA]+=parentB;
        }
        else {
            parent[parentB] = parentA;
            size[parentB]+=parentA;
        }
    }

}
