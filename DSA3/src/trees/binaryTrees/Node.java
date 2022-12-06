package trees.binaryTrees;

public class Node {
    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int data){
        this.data = data;
        leftChild = rightChild = null;
    }
}
