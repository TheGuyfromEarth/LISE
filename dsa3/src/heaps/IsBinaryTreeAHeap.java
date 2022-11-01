package heaps;

import trees.binaryTrees.BinaryTree;
import trees.binaryTrees.Node;

public class IsBinaryTreeAHeap {
    public static void main(String[] args) {
        Integer[] arr = {10, 90, 67, null, null, 89, null, null, 100, null, null};
        Node root = BinaryTree.createTree(arr);
        System.out.println(isBinaryTreeHeap(root));
    }

    public static boolean isBinaryTreeHeap(Node node){
        int count = count(node);
        return isCompleteBinaryTree(node, 0, count);
    }

    private static boolean isCompleteBinaryTree(Node node, int index,int count){
        if(node == null)
            return true;
        if(index >= count)
            return false;
        if(node.leftChild!=null) {
            if (!isCompleteBinaryTree(node.leftChild, 2 * index + 1, count))
                return false;
        }
        if(node.rightChild!=null) {
            if (!isCompleteBinaryTree(node.rightChild, 2 * index + 2, count))
                return false;
        }
        return true;
    }

    private static int count(Node node){
        if(node == null)
            return 0;
        int leftSubTreeCount = count(node.leftChild);
        int rightSubTreeCount = count(node.rightChild);
        return leftSubTreeCount+rightSubTreeCount+1;
    }
}

//     20
//  10     8
// 6     40

// n = 5 (0 to 4)