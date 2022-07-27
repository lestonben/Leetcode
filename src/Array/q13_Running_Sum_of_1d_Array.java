package Array;/*
    https://leetcode.com/problems/running-sum-of-1d-array/
 */

import java.util.Arrays;

public class q13_Running_Sum_of_1d_Array {

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            res[i] = res[i-1]+nums[i];
        }
        return res;
    }
}
