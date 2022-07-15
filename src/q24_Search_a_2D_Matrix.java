public class q24_Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length;

        while (r < matrix.length && c >= 0) {
            int val = matrix[r][c];
            if (val == target) {
                return true;
            }
            else if (val > target) {
                c--;
            }
            else {
                r++;
            }
        }
        return false;
    }
}
