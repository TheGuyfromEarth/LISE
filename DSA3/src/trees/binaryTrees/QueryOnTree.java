package trees.binaryTrees;

import java.util.Scanner;

public class QueryOnTree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Q = input.nextInt();

        QueryNode[] arr = new QueryNode[N + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = new QueryNode(0);
        }

        for (int i = 1; i <= N; i++) {
            int leftChild = input.nextInt();
            int rightChild = input.nextInt();
            if (leftChild != -1)
                arr[i].leftChild = arr[leftChild];
            if (rightChild != -1)
                arr[i].rightChild = arr[rightChild];
        }
        System.out.println();

        // for input of queries
        for(int i=0;i<Q;i++){
            int typeQuery = input.nextInt();
            int x = 0;
            if(typeQuery == 1) {
                int u = input.nextInt();
                x = input.nextInt();
                addData(arr,arr[u],x);
                arr[u].data+=x;

            }else{
                x = input.nextInt();
                System.out.println(arr[x].data);
            }
        }

    }

    private static void addData(QueryNode[] arr,QueryNode u,int x){
        if(u == null)
            return;

        if(u.leftChild!=null) {
            addData(arr,u.leftChild,x);
            u.leftChild.data += x;
        }
        if(u.rightChild!=null) {
            addData(arr,u.rightChild,x);
            u.rightChild.data += x;
        }
    }
}


class QueryNode {
    int data = 0;
    QueryNode leftChild;
    QueryNode rightChild;

    public QueryNode(int data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}
