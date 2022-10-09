package trees.binarySearchTree;

import trees.binaryTrees.Node;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insertNode(root,20);
        root = bst.insertNode(root,32);
        root = bst.insertNode(root,10);
        root = bst.insertNode(root,78);
        root = bst.insertNode(root,30);
        bst.displayInOrder(root);
        System.out.println();
//        System.out.println(bst.search(root, 56));
//        System.out.println(bst.max(root));
//        root = bst.deleteNode(root,30);
//        root = bst.deleteNode(root,32);
        root = bst.deleteNode(root,20);
        bst.displayInOrder(root);
        System.out.println();
        System.out.println(root.data);

    }

    public static Node createBST(){
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insertNode(root,20);
        root = bst.insertNode(root,32);
        root = bst.insertNode(root,10);
        root = bst.insertNode(root,78);
        root = bst.insertNode(root,30);
        return root;
    }
}
