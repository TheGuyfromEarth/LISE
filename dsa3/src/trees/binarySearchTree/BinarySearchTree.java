package trees.binarySearchTree;

public class BinarySearchTree {
    Node root;
    public void insertNode(Node node, int value) {
        Node nodeToBeInserted = new Node(value);
        if (root == null) {
            root = nodeToBeInserted;
            return;
        }
        if (node.data == value)
            return;
        if (value < node.data) {
            if (node.leftChild == null)
                node.leftChild = nodeToBeInserted;
            else
                insertNode(node.leftChild, value);
        } else if (value > node.data) {
            if (node.rightChild == null)
                node.rightChild = nodeToBeInserted;
            else
                insertNode(node.rightChild, value);
        }
    }
}
