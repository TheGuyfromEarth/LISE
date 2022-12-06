package trees.binaryTrees;

public class HeightOfBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(height(root));
    }

    public static int height(Node node){
        if(node == null)
            return -1;
        int leftHt = height(node.leftChild);
        int rightHt = height(node.rightChild);
        return Math.max(leftHt,rightHt)+1;
    }
}
