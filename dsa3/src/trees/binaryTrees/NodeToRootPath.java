package trees.binaryTrees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NodeToRootPath {
    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(fetchNodeToRootPath(root, 89));
    }
    public static ArrayList<Integer> fetchNodeToRootPath(Node node, int nodeValue) {
        if (node == null)
            return new ArrayList<>();
        if (node.data == nodeValue) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        ArrayList<Integer> leftListPath = fetchNodeToRootPath(node.leftChild, nodeValue);
         if (leftListPath.size() > 0) {
            leftListPath.add(node.data);
            return leftListPath;
        }
        ArrayList<Integer> rightListPath = fetchNodeToRootPath(node.rightChild, nodeValue);
        if (rightListPath.size() > 0) {
            rightListPath.add(node.data);
            return rightListPath;
        }
        return new ArrayList<>();
    }
}
