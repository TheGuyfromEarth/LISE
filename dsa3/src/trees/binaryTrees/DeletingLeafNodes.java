package trees.binaryTrees;

public class DeletingLeafNodes {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println("Before deleting leaf nodes");
        DisplayBinaryTree.displayTree(root);
        root = deleteLeafNodes(root);
        System.out.println("After deleting leaf nodes");
        DisplayBinaryTree.displayTree(root);
    }

    public static Node deleteLeafNodes(Node node) {
        if (node == null)
            return null;
        if (node.leftChild == null && node.rightChild == null) {
            return null;
        }
        node.leftChild = deleteLeafNodes(node.leftChild);
        node.rightChild = deleteLeafNodes(node.rightChild);
        return node;
    }
}



