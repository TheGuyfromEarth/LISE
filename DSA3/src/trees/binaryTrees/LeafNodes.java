package trees.binaryTrees;

public class LeafNodes {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        leafNodes(root);
    }

    public static void leafNodes(Node node){
        if(node == null)
            return;
        if(node.leftChild == null && node.rightChild == null)
            System.out.print(node.data+" ");
        leafNodes(node.leftChild);
        leafNodes(node.rightChild);
    }
}
