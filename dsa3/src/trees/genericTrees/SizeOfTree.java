package trees.genericTrees;

public class SizeOfTree {

    public static void main(String[] args) {
        Node root = getRoot();
        System.out.println(getSize(root));
    }

    public static int getSize(Node node){
        int size = 0;

        for(Node child: node.children){
            int childSize = getSize(child);
            size += childSize;
        }
        size += 1;
        return size;
    }

    public static Node getRoot(){
        GenericTree tree = new GenericTree();
        int[] arr = {10,20,40,-1,50,-1,-1,30,60,-1,70,-1,80,90,-1,-1,-1,-1};
        return tree.createTree(arr);
    }
}
