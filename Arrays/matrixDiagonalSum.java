//problem link: https://leetcode.com/problems/matrix-diagonal-sum/description/
public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { { 5 } };
        int left = 0;
        int right = 0;
        int mid = mat.length / 2;
        for (int i = 0; i < mat.length; i++) {
            left += mat[i][i];
            right += mat[i][mat.length - i - 1];
        }
        if (mat.length % 2 != 0)
            right -= mat[mid][mid];
        int result = left + right;
        System.out.println("left= " + left + "right = " + right);
        System.out.println(result);
    }
}
