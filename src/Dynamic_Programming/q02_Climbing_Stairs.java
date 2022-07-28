package Dynamic_Programming;

/*
    https://leetcode.com/problems/climbing-stairs/
 */

public class q02_Climbing_Stairs {

    public int climbStairs(int n) {
        if (n <= 2) { return n; }

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n+1];
    }

    /*
        can either climb 1 or 2 steps
        if 2, then got 2
        if 3, then got 3
        if 4, then got 5
        if 5, then got 8
        if 6, then got 13  ...From here: can formulate that, res = (n-1) + (n-2)
     */
}
