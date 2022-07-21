package Binary_Search;
/*
    https://leetcode.com/problems/search-a-2d-matrix/
 */

public class q02_Search_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[row].length-1;

        while (row <= matrix.length-1 && col >= 0) {
            int current = matrix[row][col];

            if (current < target) { row++; }
            else if (current > target) { col--; }
            else { return true; }
        }
        return false;
    }
}
