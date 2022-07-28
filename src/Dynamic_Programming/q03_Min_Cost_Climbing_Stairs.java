package Dynamic_Programming;

/*
    https://leetcode.com/problems/min-cost-climbing-stairs/
 */

public class q03_Min_Cost_Climbing_Stairs {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i=2; i<cost.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[cost.length-2], dp[cost.length-1]);
    }

    /*
        If the cost consists of [10,15,20]
        Then, it is either to start from index 0 or 1
        If we begin with 10 (index 0)
        And only can either make 1 or 2 moves, still unable to reach the peak
        However, we choose 15 (index 1)
        Can directly make 2 moves to reach the peak (lower cost)
        Instead of choosing 10 + 15
        For making 1 + 2 moves (higher cost)
     */
}
