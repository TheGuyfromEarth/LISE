package graphs;

public class LandWaterIslandProblem {
    public static void main(String[] args) {

        char[][] body = {
                {'L', 'L', 'L', 'W', 'W'},
                {'L', 'L', 'L', 'W', 'L'},
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'L', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'L'},
        };
        System.out.println(numIslands(body));
    }

    public static int numIslands(char[][] body) {
        int numIslands = 0;

        for (int i = 0; i < body.length; i++) {
            for (int j = 0; j < body[0].length; j++) {
                if (body[i][j] == 'L') {
                    numIslands++;
                    checkNeighbours(i, j, body);
                }
            }
        }
        return numIslands;
    }

    private static void checkNeighbours(int row, int col, char[][] body) {

        if (row < 0 || row >= body.length || col < 0 || col >= body[0].length || body[row][col] == 'W')
            return;

        body[row][col] = 'W';
        // north
        checkNeighbours(row - 1, col, body);
        // south
        checkNeighbours(row + 1, col, body);
        // east
        checkNeighbours(row, col + 1, body);
        // west
        checkNeighbours(row, col - 1, body);
    }
}
