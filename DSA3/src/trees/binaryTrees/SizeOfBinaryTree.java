package trees.binaryTrees;

public class SizeOfBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(size(root));
    }

    public static int size(Node node){
        if(node == null)
            return 0;
        int leftSize = size(node.leftChild);
        int rightSize = size(node.rightChild);
        int totalSize = leftSize + rightSize + 1;
        return totalSize;
    }
}
