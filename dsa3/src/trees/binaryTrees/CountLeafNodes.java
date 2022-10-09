package trees.binaryTrees;

import java.util.Scanner;

public class CountLeafNodes {
        public static void main (String[] args) {
            // Your code here
            Scanner input = new Scanner(System.in);
            int numNodes = input.nextInt();// 4

            int N = 3;
            MyNode[] arr = new MyNode[numNodes+1];

            for(int i=1;i<arr.length;i++){
                arr[i] = new MyNode(i);
            }

            for(int i = 1;i<=numNodes;i++){
                int leftChild = input.nextInt();
                int rightChild = input.nextInt();
                MyNode node = arr[i];
                if(leftChild != -1)
                    node.leftChild = arr[leftChild];
                if(rightChild != -1)
                    node.rightChild = arr[rightChild];
            }
            System.out.println(countLeafNodes(arr[1]));
        }

        public static int countLeafNodes(MyNode node){
            if(node == null)
                return 0;
            if(node.leftChild == null && node.rightChild==null)
                return 1;

            int leftLeafNodes = countLeafNodes(node.leftChild);
            int rightLeafNodes = countLeafNodes(node.rightChild);
            return leftLeafNodes+rightLeafNodes;
        }
    }
    class MyNode{
        int data;
        MyNode leftChild;
        MyNode rightChild;

        public MyNode(int value){
            data = value;
            leftChild = rightChild = null;
        }
    }