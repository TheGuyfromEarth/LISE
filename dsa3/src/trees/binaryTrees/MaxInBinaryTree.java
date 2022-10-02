package trees.binaryTrees;

public class MaxInBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(max(root));
    }
    public static int max(Node node){
        if(node == null)
            return Integer.MIN_VALUE;

        int leftMax = max(node.leftChild);
        int rightMax = max(node.rightChild);
        int childMax = Math.max(leftMax,rightMax);
        int max = Math.max(childMax,node.data);
        return max;
    }
}
