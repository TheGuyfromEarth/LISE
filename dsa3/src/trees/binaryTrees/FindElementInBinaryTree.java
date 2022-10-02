package trees.binaryTrees;

public class FindElementInBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(findElement(root, 100));
    }

    public static boolean findElement(Node node, int searchValue) {
        if (node == null)
            return false;
        // check if root equals the search value
        if (node.data == searchValue)
            return true;
        // check if left child has the search value
        boolean resLeftSide = findElement(node.leftChild, searchValue);
        if (resLeftSide)
            return true;
        // check if right child has the search value
        boolean resRightSide = findElement(node.rightChild, searchValue);
        if (resRightSide)
            return true;

        return false;
    }
}
