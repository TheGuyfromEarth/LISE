package dynamicProgramming;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinimumCostPath {
    public static void main(String[] args) {
        int[][] arr = {{4, 2, 1, 9},
                {3, 8, 9, 4},
                {5, 8, 7, 6},
                {1, 5, 8, 2}};
        int[][] dp = new int[arr.length][arr[0].length];
        System.out.println(minCostPath(arr, dp));
        printMinCostPaths(arr, dp);
    }

    public static int minCostPath(int[][] arr, int[][] dp) {

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if (i == arr.length - 1 && j == arr[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == arr.length - 1) {
                    dp[i][j] = arr[i][j] + dp[i][j + 1];
                } else if (j == arr[0].length - 1) {
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

    public static void printMinCostPaths(int[][] arr, int[][] dp) {
        // apply BFS
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0, 0, ""));
        int rightVal = 0;
        int downVal = 0;

        while (!queue.isEmpty()) {
            Pair currPair = queue.poll();

            if (currPair.row == arr.length - 1 && currPair.col == arr[0].length - 1) {
                System.out.println(currPair.path);
                continue;
            } else if (currPair.row == arr.length - 1) {
                queue.add(new Pair(currPair.row, currPair.col + 1, currPair.path + " R "));
            } else if (currPair.col == arr[0].length - 1) {
                queue.add(new Pair(currPair.row + 1, currPair.col, currPair.path + " D "));
            } else {
                rightVal = dp[currPair.row][currPair.col + 1];
                downVal = dp[currPair.row + 1][currPair.col];

                if (rightVal < downVal) {
                    queue.add(new Pair(currPair.row, currPair.col + 1, currPair.path + " R "));
                } else if (downVal < rightVal) {
                    queue.add(new Pair(currPair.row + 1, currPair.col, currPair.path + " D "));
                } else {
                    queue.add(new Pair(currPair.row + 1, currPair.col, currPair.path + " D "));
                    queue.add(new Pair(currPair.row, currPair.col + 1, currPair.path + " R "));
                }
            }
        }
    }
}

class Pair {

    int row;
    int col;
    String path;

    public Pair(int row, int col, String path) {
        this.row = row;
        this.col = col;
        this.path = path;
    }
}