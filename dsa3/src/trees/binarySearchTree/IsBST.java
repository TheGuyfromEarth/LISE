package trees.binarySearchTree;

import trees.binaryTrees.DisplayBinaryTree;
import trees.binaryTrees.Node;

public class IsBST {

    public static void main(String[] args) {
//        Node root = Driver.createBST();
        trees.binaryTrees.Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(isBST(root).isBST);
    }

    public static Pair isBST(Node node) {
        if(node == null){
            Pair pair = new Pair(node);
            pair.max = Integer.MIN_VALUE;
            pair.min = Integer.MAX_VALUE;
            pair.isBST = true;
            return pair;
        }

        Pair leftTreePair = isBST(node.leftChild);
        Pair rightTreePair = isBST(node.rightChild);
        boolean isNodeBST = node.data > (leftTreePair.node!=null?leftTreePair.node.data:Integer.MIN_VALUE) && node.data < (rightTreePair.node!=null?rightTreePair.node.data:Integer.MAX_VALUE);
        boolean isTreeBST = leftTreePair.isBST && rightTreePair.isBST;
        boolean isInRangeBST = node.data > leftTreePair.max && node.data < rightTreePair.min;
        boolean isOverAllBST = isNodeBST && isTreeBST && isInRangeBST;
        Pair pair = new Pair(node);
        pair.isBST = isOverAllBST;
        pair.min = Math.min(node.data, Math.min(leftTreePair.min, rightTreePair.min));
        pair.max = Math.max(node.data, Math.max(leftTreePair.max, rightTreePair.max));
        return pair;
    }
}

class Pair {
    Node node;
    boolean isBST;
    int max;
    int min;

    public Pair(Node node) {
        this.node = node;
    }
}
