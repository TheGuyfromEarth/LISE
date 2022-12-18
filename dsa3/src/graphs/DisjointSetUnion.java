package graphs;

// Disjoint Set Union has 3 main operations:
// 1) make
// 2) find
// 3) union

public class DisjointSetUnion {
    int[] parent;
    int[] size;

    public DisjointSetUnion(int numVertices){
        parent = new int[numVertices];
        size = new int[numVertices];
    }

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
            size[parentB]+=size[parentA];
        }
        else {
            parent[parentB] = parentA;
            size[parentA]+=size[parentB];
        }
    }

}

// time complexity (amortized time complexity) => O(alpha(V))
// where alpha(V) is called as Reverse Ackerman Function
// And practically, it is observed its value turns out to be 4