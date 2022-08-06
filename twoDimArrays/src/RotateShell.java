import java.util.Arrays;

public class RotateShell {
    public static void main(String[] args) {

        int[][] mat = {{10, 20, 30, 40, 50},
                {-10, 0, 1, 2, 1},
                {0, 10, 15, -10, 20},
                {5, 10, 0, 20, 20},
                {0, 40, 50, 10, -10}};

        int shellNo = 2;
        int k = 2;

        // Solution
        int upperLeftCorner = shellNo - 1;
        int bottomRightCorner = mat.length - shellNo ;
        int dim = bottomRightCorner - upperLeftCorner + 1 ;

        int[] arr = new int[(dim * 4) - 4];
        int index = 0;

        // left  boundary
        for (int row = upperLeftCorner, col = upperLeftCorner; row <= bottomRightCorner; row++) {
            arr[index] = mat[row][col];
            index++;
        }

        // bottom boundary
        for (int row = bottomRightCorner, col = upperLeftCorner+1; col <= bottomRightCorner; col++) {
            arr[index] = mat[row][col];
            index++;
        }
        // right boundary
        for (int row = bottomRightCorner-1, col = bottomRightCorner; row >= upperLeftCorner; row--) {
            arr[index] = mat[row][col];
            index++;
        }
        // top boundary
        for (int row = upperLeftCorner, col = bottomRightCorner-1; col > upperLeftCorner; col--) {
            arr[index] = mat[row][col];
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
