package trees.genericTrees;

public class MaxInTree {

    public static void main(String[] args) {
        Node root = Driver.getRoot();
        System.out.println(getMax(root));
    }

    public static int getMax(Node node){
        int max = Integer.MIN_VALUE;

        for(Node child: node.children){
            int childMax = getMax(child);
            max = Math.max(max,childMax);
        }
        max = Math.max(max,node.data);
        return max;
    }
}
