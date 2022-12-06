package trees.binarySearchTree;

import trees.binaryTrees.Node;

public class BinarySearchTree {

    public Node insertNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        // check for duplicacy
        if (node.data == value)
            return node;
        else if (value < node.data) {
            if (node.leftChild == null) {
                node.leftChild = new Node(value);
            } else
                insertNode(node.leftChild, value);
        } else {
            if (node.rightChild == null) {
                node.rightChild = new Node(value);
            } else
                insertNode(node.rightChild, value);
        }
        return node;
    }

    public void displayInOrder(Node node) {
        if (node == null)
            return;
        displayInOrder(node.leftChild);
        System.out.print(node.data + " ");
        displayInOrder(node.rightChild);
    }

    public boolean search(Node node, int value) {
        if (node == null)
            return false;
        if (node.data == value)
            return true;
        if (value < node.data) {
            return search(node.leftChild, value);
        }
        return search(node.rightChild, value);
    }

    public int max(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        if (node.rightChild != null)
            return max(node.rightChild);
        return node.data;
    }

    public Node deleteNode(Node node, int value) {
        if (node == null)
            return null;
        if (node.data == value) {
            if (node.leftChild == null)
                return node.rightChild;
            else if (node.rightChild == null)
                return node.leftChild;
            else {
                // both the children are present
                // find replacement value
                int min = minValue(node.rightChild);
                node.data = min;
                deleteNode(node.rightChild, min);
            }
        }
        if (value < node.data)
            node.leftChild = deleteNode(node.leftChild, value);
        else
            node.rightChild = deleteNode(node.rightChild, value);
        return node;
    }

    public static int minValue(Node node) {
        if (node.leftChild != null)
            return minValue(node.leftChild);
        else
            return node.data;
    }
}
