package Dynamic_Programming;

/*
    https://leetcode.com/problems/unique-paths/
 */

public class q04_Unique_Paths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i=0; i<m; i++) {
            dp[i][0] = 1;
        }

        for (int j=0; j<n; j++) {
            dp[0][j] = 1;
        }

        for (int i=1; i<m; i++) {
            for (int j=1; j<m; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    /*
        If 3*3 scenario
            0 1 2
            x 1 1  0
            1 1 1  1
            1 1 y  2
        dp[1][1] = dp[0][1] + dp[1][0]
                 = 1 + 1
                 = 2
        dp[1][2] = dp[0][2] + dp[1][1]
                 = 1 + 2
                 = 3
        dp[2][1] = dp[1][1] + dp[2][0]
                 = 2 + 1
                 = 3
        dp[2][2] = dp[1][2] + dp[2][1]
                 = 3 + 3
                 = 6

     */
}
