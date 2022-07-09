public class q06_Product_of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) { return new int[]{}; }

        //使用空间array方式
        int[] dp = new int[nums.length];
        dp[0] = 1;

        //乘左边的所有值
        for (int i=1; i<nums.length; i++) {
            dp[i] = dp[i-1] * nums[i-1];
        }
        //乘右边的的值
        int tempRight = 1;
        for (int i=nums.length-1; i>=0; i--) {
            dp[i] *= tempRight;
            tempRight *= nums[i];
        }
        return dp;
    }
}
