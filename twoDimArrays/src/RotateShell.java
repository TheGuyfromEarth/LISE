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
        int[] arr = createOneDArray(mat, shellNo);
        arr = rotateArray(arr, k);
        transferFromOneDArrayToShell(arr, mat, shellNo);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    private static int[] createOneDArray(int[][] mat, int shellNo) {
        int upperLeftCorner = shellNo - 1;
        int bottomRightCorner = mat.length - shellNo;
        int dim = bottomRightCorner - upperLeftCorner + 1;

        int[] arr = new int[(dim * 4) - 4];
        int index = 0;

        // left  boundary
        for (int row = upperLeftCorner, col = upperLeftCorner; row <= bottomRightCorner; row++) {
            arr[index] = mat[row][col];
            index++;
        }

        // bottom boundary
        for (int row = bottomRightCorner, col = upperLeftCorner + 1; col <= bottomRightCorner; col++) {
            arr[index] = mat[row][col];
            index++;
        }
        // right boundary
        for (int row = bottomRightCorner - 1, col = bottomRightCorner; row >= upperLeftCorner; row--) {
            arr[index] = mat[row][col];
            index++;
        }
        // top boundary
        for (int row = upperLeftCorner, col = bottomRightCorner - 1; col > upperLeftCorner; col--) {
            arr[index] = mat[row][col];
            index++;
        }
        return arr;
    }

    private static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int part1EndIndx = n - k - 1;
        int part2BegIndx = n - k;

        // reverse part1
        reverse(arr, 0, part1EndIndx);
        // reverse part2
        reverse(arr, part2BegIndx, n - 1);
        // reverse entire array
        reverse(arr, 0, n - 1);

        return arr;
    }

    private static void transferFromOneDArrayToShell(int[] arr, int[][] mat, int shellNo) {
        int upperLeftCorner = shellNo - 1;
        int bottomRightCorner = mat.length - shellNo;

        int index = 0;

        // left  boundary
        for (int row = upperLeftCorner, col = upperLeftCorner; row <= bottomRightCorner; row++) {
            mat[row][col] = arr[index];
            index++;
        }

        // bottom boundary
        for (int row = bottomRightCorner, col = upperLeftCorner + 1; col <= bottomRightCorner; col++) {
            mat[row][col] = arr[index];
            index++;
        }
        // right boundary
        for (int row = bottomRightCorner - 1, col = bottomRightCorner; row >= upperLeftCorner; row--) {
            mat[row][col] = arr[index];
            index++;
        }
        // top boundary
        for (int row = upperLeftCorner, col = bottomRightCorner - 1; col > upperLeftCorner; col--) {
            mat[row][col] = arr[index];
            index++;
        }
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}



