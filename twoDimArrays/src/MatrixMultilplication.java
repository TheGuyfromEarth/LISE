public class MatrixMultilplication {

    public static void main(String[] args) {

        int[][] mat1 = {{1,10,5},
                        {6,1,3}};

        int[][] mat2 = {{7,10,1},
                        {9,0,-1},
                        {10,2,-1}};

        int[][] res;

        if(mat1[0].length == mat2.length)
        {
            res = new int[mat1.length][mat2[0].length];

            for(int i=0;i<res.length;i++){
                for(int j=0;j<res[0].length;j++){
                    for(int k=0;k<mat1[0].length;k++){
                        res[i][j] = res[i][j]+(mat1[i][k] * mat2[k][j]);
                    }
                }
            }

        }else {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        for(int i=0;i<res.length;i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
