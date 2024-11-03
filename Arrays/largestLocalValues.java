public class largestLocalValues {
    public static void main(String[] args) {
        int[][] grid = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid.length - row >= 3 && grid[row].length - col >= 3) {
                    for (int i = row; i < 3; i++) {
                        for (int j = col; j < 3; j++) {
                            System.out.print(grid[i][j] + "\t");
                        }
                        System.out.println("");
                    }
                }

                System.out.println("");
            }

        }
    }

}
