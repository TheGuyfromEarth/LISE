package trees.genericTrees;


import java.util.Stack;

public class GenericTree {

    public Node createTree(int[] arr) {

        Stack<Node> stack = new Stack<>();
        Node root = null;

        for (int i : arr) {
            if (i == -1) {
                stack.pop();
            } else {
                Node node = new Node(i);
                Node peek = null;
                if (stack.isEmpty()) {
                    root = node;
                } else {
                    peek = stack.peek();
                    peek.children.add(node);
                }
                stack.push(node);
            }
        }
        return root;
    }

    public void traverse(Node node) {
        System.out.print(node.data + "->");
        for (Node child : node.children) {
            System.out.print(child.data + ",");
        }
        System.out.println();
        for (Node child : node.children) {
            traverse(child);
        }
    }

}
