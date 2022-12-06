package trees.genericTrees;

public class HeightofTree {
    public static void main(String[] args) {
        Node root = Driver.getRoot();
        System.out.println(findHeight(root));
    }

    public static int findHeight(Node node){
        int maxHt = -1;
        for(Node child: node.children){
            int ht = findHeight(child);
            maxHt = Math.max(maxHt,ht);
        }
        maxHt = maxHt+1;
        return maxHt;
    }
}


