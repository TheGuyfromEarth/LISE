package trees.binaryTrees;

import java.util.Scanner;

public class CountLeafNodesActualSolution {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int numNodes = input.nextInt();
        int count = 0;
        for (int i = 1; i <= numNodes; i++) {
            int leftChild = input.nextInt();
            int rightChild = input.nextInt();
            if (leftChild == -1 && rightChild == -1)
                count++;

        }
        System.out.println(count);
    }
}