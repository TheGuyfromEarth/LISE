package trees.genericTrees;

import java.util.ArrayList;

public class Node {
    int data;
    ArrayList<Node> children;

    public Node(int data){
        this.data = data;
        children = new ArrayList<>();
    }
}
