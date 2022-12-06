package trees.binaryTrees;

public class SumofBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(sum(root));
    }
    public static int sum(Node node){
        if(node == null)
            return 0;
        int leftSum = sum(node.leftChild);
        int rightSum = sum(node.rightChild);
        return leftSum+rightSum+node.data;
    }
}
