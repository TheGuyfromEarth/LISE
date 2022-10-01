package trees.binaryTrees;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        Integer[] arr = {10, 90, 67, null, null, 89, null, null, 100, null, null};
        Node root = createTree(arr);
        System.out.println(root.data);
        System.out.println(root.leftChild.data);
        System.out.println(root.rightChild.data);
    }

    public static Node createTree(Integer[] arr) {
        // (10,2)
        Stack<TreeNode> stack = new Stack<>();
        Node root = null;
        for (Integer i : arr) {
            if (i == null) {
                TreeNode treeNode = stack.peek();
                treeNode.level++;
            } else {
                Node node = new Node(i);
                if (stack.isEmpty()) {
                    root = node;
                    stack.push(new TreeNode(root));
                } else {
                    TreeNode treeNode = stack.peek();
                    int peekLevel = treeNode.level;
                    while (peekLevel == 3) {
                        stack.pop();
                        treeNode = stack.peek();
                        peekLevel = treeNode.level;
                    }
                    if (peekLevel == 2) {
                        treeNode.level++;
                        treeNode.node.rightChild = node;
                    } else {
                        treeNode.level++;
                        treeNode.node.leftChild = node;
                    }
                    stack.push(new TreeNode(node));
                }
            }
        }
        return root;
    }
}

class TreeNode {
    Node node;
    int level = 1;

    public TreeNode(Node node) {
        this.node = node;
    }
}
