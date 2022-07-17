public class TimeComplexityExamples {

    public static void main(String[] args) {

        // Print a Statement
        System.out.println("Learning TC"); // O(1)

        // Print the elements in a fixed array // O(1)
        int[] arr = new int[5];

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        // Print the elements in a array // O(n) 1<=n<=10^5
        int n = 100;
        int[] arr1 = new int[n];

        for (int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }

        // add two arrays together  1<=p,q<=10^5  // O(p)

        int p = 100; // O(1)
        int q = 100; // O(1)
        int[] array1 = new int[p]; // O(1)
        int[] array2 = new int[q]; // O(1)
        int[] array3 = new int[q]; // O(1)

        for (int i=0;i< array1.length;i++){ // O(p)
          array3[i] = array1[i]+array2[i]; // O(1)
             System.out.println(array3[i]); // O(1)
        }

        // nested loop //  1<=n<=10^5 // O(n^2)
        for(int i=0;i<=n;i++){ // O(n)
            for(int j=0;j<=n;j++){ // O(n)
                System.out.println(i+j); // O(1)
            }
        }
    }
}
