package trees.binaryTrees;

public class DeletingLeafNodes {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println("Before deleting leaf nodes");
        DisplayBinaryTree.displayTree(root);
        deleteLeafNodes(root);
        System.out.println("After deleting leaf nodes");
        DisplayBinaryTree.displayTree(root);
    }

    public static void deleteLeafNodes(Node node) {
        if (node == null)
            return;
        if (node.leftChild == null && node.rightChild == null) {
            node = null;
            return;
        }
        deleteLeafNodes(node.leftChild);
        deleteLeafNodes(node.rightChild);
    }
}