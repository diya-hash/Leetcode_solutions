
//problem link: https://leetcode.com/problems/largest-local-values-in-a-matrix/description/
import java.util.*;

public class largestLocalValues {
    public static void main(String[] args) {
        int[][] grid = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };
        int[][] result = new int[grid.length - 2][grid.length - 2];
        int count = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                int max = -1;
                if (grid.length - row >= 3 && grid[row].length - col >= 3) {
                    for (int i = row; i < row + 3; i++) {
                        for (int j = col; j < col + 3; j++) {
                            int r = row;
                            int c = col;
                            // System.out.print(grid[i][j] + "\t");
                            if (grid[i][j] > max) {
                                max = grid[i][j];
                            }
                        }
                        System.out.println("");
                    }
                }
                if (max > -1) {
                    // System.out.println("row = " + row + ", col = " + col);
                    result[row][col] = max;
                    // System.out.print(max + "\t");
                }

                System.out.println("");
            }

        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
