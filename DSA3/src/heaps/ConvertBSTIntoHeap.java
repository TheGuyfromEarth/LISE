package heaps;

import trees.binarySearchTree.Driver;
import trees.binaryTrees.Node;

import java.util.ArrayList;
import java.util.List;

// 1) The given BST will always be a complete binary tree.
// 2) Left child of parent will always be lesser than right child.
// 3) Consider min heap
public class ConvertBSTIntoHeap {
    static int index = 0;
    public static void main(String[] args) {
        Node root = Driver.createBST();
        List<Integer> arrList = new ArrayList<>();
        inorderTraversal(root,arrList);
        System.out.println(arrList);
        convertToHeap(arrList,root);
        System.out.println(root.data);
    }

    public static void inorderTraversal(Node node, List<Integer> arrList){
            if(node == null)
                return;
            inorderTraversal(node.leftChild,arrList);
            arrList.add(node.data);
            inorderTraversal(node.rightChild,arrList);
    }

    public static void convertToHeap(List<Integer> arrList, Node node){
        if(node == null)
            return;
        convertToHeap(arrList,node.leftChild);
        convertToHeap(arrList,node.rightChild);
        node.data = arrList.get(index);
        index++;
    }

}


// Parent<Left<Right
// Root Left Right

//    Root
//  L     R
// LL

//    78
// 40   50
//10 32