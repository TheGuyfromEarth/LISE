package trees.binaryTrees;

public class PrintNodesKlevelsBelow {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        int k = 2;
        printNodesKLevelsBelow(root,k);
    }

    public static void printNodesKLevelsBelow(Node node, int k){
         if(node == null)
             return;
         if(k == 0)
             System.out.print(node.data+" ");
         printNodesKLevelsBelow(node.leftChild,k-1);
         printNodesKLevelsBelow(node.rightChild,k-1);
    }
}