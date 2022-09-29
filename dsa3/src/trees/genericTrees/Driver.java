package trees.genericTrees;

public class Driver {

    public static void main(String[] args) {
        GenericTree genericTree = new GenericTree();
        Node root = getRoot();
        System.out.println(root.data);
        genericTree.traverse(root);
    }

    public static Node getRoot(){
        GenericTree tree = new GenericTree();
        int[] arr = {10,20,40,-1,50,-1,-1,30,60,-1,70,-1,80,90,-1,-1,-1,-1};
        return tree.createTree(arr);
    }
}

//       10
//     20        30
//  40  50   60  70  80
//                  90
