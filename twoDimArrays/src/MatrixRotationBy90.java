public class MatrixRotationBy90 {

    public static void main(String[] args) {

        int[][] mat = {{10, 20, 10},
                      {25, 5, -10},
                       {0, 80, 5}};

        transpose(mat);

        // reverse all rows
        for(int i=0;i< mat.length;i++)
            reverseRows(mat,i);

        // display
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] mat){
        for(int i=0;i< mat.length;i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                swap(mat,i,j);
            }
        }
    }

    private static void reverseRows(int[][] mat, int i){
        int low = 0;
        int high = mat.length-1;

        while(low<high){
            int temp = mat[i][low];
            mat[i][low] = mat[i][high];
            mat[i][high] = temp;
            low++;
            high--;
        }

    }

    private static void swap(int[][] mat, int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
