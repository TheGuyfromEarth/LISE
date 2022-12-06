package trees.genericTrees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node root = Driver.getRoot();
        levelOrderTraversal(root);
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);

            while(!queue.isEmpty()){
                // we perform RPA
                Node node = queue.remove();
                System.out.print(node.data+" ");
                for(Node child: node.children){
                    queue.add(child);
                }
            }
        }
    }
}
