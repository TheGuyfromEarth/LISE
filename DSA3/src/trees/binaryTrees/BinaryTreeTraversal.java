package trees.binaryTrees;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        Integer[] arr = {10,20,40,null,null,50,null,null,30,null,70,null,null};
        Node root = BinaryTree.createTree(arr);
//        preOrderTraversal(root);
//        postOrderTraversal(root);
        inOrderTraversal(root);
    }

    public static void preOrderTraversal(Node node){
        if(node == null)
            return;
        // pre call area
        System.out.print(node.data+" ");
        preOrderTraversal(node.leftChild);
        // in call area
        preOrderTraversal(node.rightChild);
        // post call area
    }

    public static void postOrderTraversal(Node node){
        if(node == null)
            return;
        // pre call area
        postOrderTraversal(node.leftChild);
        // in call area
        postOrderTraversal(node.rightChild);
        System.out.print(node.data+" ");
        // post call area
    }

    public static void inOrderTraversal(Node node){
        if(node == null)
            return;
        // pre call area
        inOrderTraversal(node.leftChild);
        // in call area
        System.out.print(node.data+" ");
        inOrderTraversal(node.rightChild);
        // post call area
    }
}

