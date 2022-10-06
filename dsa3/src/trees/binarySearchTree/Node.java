package trees.binarySearchTree;

public class Node {
    int data;
    Node leftChild;
    Node rightChild;

    int count;

    public Node(int data){
        this.data = data;
        leftChild = rightChild = null;
    }
}
