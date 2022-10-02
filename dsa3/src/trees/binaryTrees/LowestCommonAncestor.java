package trees.binaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(lowestCommonAncestor(root, 67,89));
    }

    public static int lowestCommonAncestor(Node node,int nodeVal1, int nodeVal2){
        ArrayList<Integer> list1 = NodeToRootPath.fetchNodeToRootPath(node,nodeVal1);
        ArrayList<Integer> list2 = NodeToRootPath.fetchNodeToRootPath(node,nodeVal2);
        int i = list1.size()-1;
        int j = list2.size()-1;
        while(i>=0 && j>=0 && list1.get(i)==list2.get(j)){
            i--;
            j--;
        }
        i++;
        return list1.get(i);
    }
}
