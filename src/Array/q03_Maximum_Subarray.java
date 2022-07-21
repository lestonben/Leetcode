package Array;

/*
    https://leetcode.com/problems/maximum-subarray/
 */

public class q03_Maximum_Subarray {

    public int maxSubArray(int[] nums) {
        int max = 0;

        for (int i=0; i<nums.length; i++) {
            int curr = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                curr += nums[j];
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
