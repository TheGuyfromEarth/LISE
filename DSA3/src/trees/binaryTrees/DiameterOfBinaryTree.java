package trees.binaryTrees;

// diameter of a tree -> longest possible path between any two nodes (dia may or may not include the root)

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        Node root = DisplayBinaryTree.getBinaryTree();
        DisplayBinaryTree.displayTree(root);
//        System.out.println(findDiameter(root));
        System.out.println(findDiaPair(root).dia);
    }

    public static int findDiameter(Node node) {
        if (node == null)
            return 0;

        // find left Diameter (dia of left sub tree)
        int leftDia = findDiameter(node.leftChild);
        // find right Diameter (dia of right sub tree)
        int rightDia = findDiameter(node.rightChild);
        int diaThroughRoot = HeightOfBinaryTree.height(node.leftChild) + HeightOfBinaryTree.height(node.rightChild) + 2;
        return Math.max(diaThroughRoot, Math.max(leftDia, rightDia));
    }

    public static Pair findDiaPair(Node node) {
        if (node == null) {
            return new Pair(0, -1);
        }
        Pair leftDiaPair = findDiaPair(node.leftChild);
        Pair rightDiaPair = findDiaPair(node.rightChild);
        int diaThroughRoot = leftDiaPair.height + rightDiaPair.height + 2;
        int dia = Math.max(diaThroughRoot, Math.max(leftDiaPair.dia, rightDiaPair.dia));
        int height = Math.max(leftDiaPair.height, rightDiaPair.height) + 1;
        return new Pair(dia, height);
    }
}

class Pair {
    int dia;
    int height;

    public Pair(int dia, int ht) {
        this.dia = dia;
        height = ht;
    }
}


//     10
//  90    100
//67  89