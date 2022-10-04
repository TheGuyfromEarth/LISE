package trees.binaryTrees;

// diameter of a tree -> longest possible path between any two nodes (dia may or may not include the root)

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        System.out.println(findDiameter(root));
    }

    public static int findDiameter(Node node) {
        if(node == null)
            return 0;

        // find left Diameter (dia of left sub tree)
        int leftDia = findDiameter(node.leftChild);
        // find right Diameter (dia of right sub tree)
        int rightDia = findDiameter(node.rightChild);
        int diaThroughRoot = HeightOfBinaryTree.height(node.leftChild)+HeightOfBinaryTree.height(node.rightChild)+2;
        return Math.max(diaThroughRoot,Math.max(leftDia,rightDia));
    }
}
