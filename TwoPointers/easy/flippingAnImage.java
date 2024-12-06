package Leetcode_solutions.TwoPointers;

public class flippingAnImage {
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };

        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat[i].length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
            System.out.println("");
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = 0;
                } else {
                    mat[i][j] = 1;
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.err.println("");
        }
    }
}