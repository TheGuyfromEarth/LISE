package trees.binaryTrees;

public class DisplayBinaryTree {

    public static void main(String[] args) {
        Node root = getBinaryTree();
        displayTree(root);
    }

    public static void displayTree(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + "-> ");
        if (node.leftChild != null)
            System.out.print(node.leftChild.data);
        if (node.rightChild != null)
            System.out.print("," + node.rightChild.data);
        System.out.println();
        displayTree(node.leftChild);
        displayTree(node.rightChild);
    }

    public static Node getBinaryTree() {
        Integer[] arr = {10, 90, 67, null, null, 89, null, null, 100, null, null};
        Node root = BinaryTree.createTree(arr);
        return root;
    }
}
