package Sliding_Window;

/*
    https://leetcode.com/problems/minimum-size-subarray-sum/
 */

import java.util.*;

public class q08_Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int start = 0, temp = 0;
        for (int end=0; end<nums.length; end++) {
            temp += nums[end];

            while (end >= start && temp >= target) {
                res = Math.min(res, end-start+1);
                temp -= nums[start++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
