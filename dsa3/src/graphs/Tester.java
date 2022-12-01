package graphs;

import java.util.Scanner;

public class Tester {

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

        // 1) Traverse across this graph
        //  a) DFS -> Depth First Search
        //  b) BFS -> Breadth First Search

        // 1a) DFS
        System.out.println("Enter the source vertex: ");
        int srcVertex = input.nextInt();
//        graph.dfs(srcVertex);
        graph.bfs(srcVertex);

    }
}
