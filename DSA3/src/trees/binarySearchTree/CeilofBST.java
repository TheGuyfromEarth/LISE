package trees.binarySearchTree;

import java.util.Scanner;

public class CeilofBST {
    static int answer = -1;

    public static void main(String[] args) {
        // Your code here
        Scanner inp = new Scanner(System.in);
        int numNodes = inp.nextInt();
        Node root = null;

        for (int i = 0; i < numNodes; i++) {
            root = insertNode(root, inp.nextInt());
        }

        int num = inp.nextInt();

        findCeil(root, num);
        System.out.println(answer);
    }

    public static Node insertNode(Node node, int value) {
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

    public static void findCeil(Node node, int num) {
        if (node.data == num) {
            answer = num;
            return;
        }
        if (num < node.data) {
            answer = node.data;
            if (node.leftChild != null)
                findCeil(node.leftChild, num);
        } else {
            if (node.rightChild != null)
                findCeil(node.rightChild, num);
        }

    }
}

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}
