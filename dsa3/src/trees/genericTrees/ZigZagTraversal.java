package trees.genericTrees;

import java.util.Stack;

public class ZigZagTraversal {
    public static void main(String[] args) {
        Node root = Driver.getRoot();
        zigZagTraversal(root);
    }

    public static void zigZagTraversal(Node root){
        Stack<Node> mainStack = new Stack<>();
        Stack<Node> childStack = new Stack<>();
        mainStack.push(root);
        int level = 0;

        while(!mainStack.isEmpty()){

            Node node = mainStack.pop();
            System.out.print(node.data+" ");
            if(level%2==0){
                for(int i = 0; i<node.children.size();i++){
                    childStack.push(node.children.get(i));
                }
            }
            else{
                for(int i = node.children.size()-1; i>=0;i--){
                    childStack.push(node.children.get(i));
                }
            }
            if(mainStack.isEmpty()){
                // mainStack points to child stack and child stack is freshly initialized again
                mainStack = childStack;
                childStack = new Stack<>();
                level++;
            }
        }

    }
}
