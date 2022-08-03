package Sliding_Window;

/*
    https://leetcode.com/problems/subarray-product-less-than-k/
 */

public class q07_Subarray_Product_Less_Than_K {

    public static void main(String[] args) {
        System.out.println(numSubArrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }

    public static int numSubArrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int start = 0, temp = 1;
        for (int end=0; end<nums.length; end++) {
            temp *= nums[end];
            while (end >= start && temp >= k) {
                temp /= nums[start++];
            }
            count += end-start+1;
        }
        return count;
    }

    /*
            Scenario:   10  5  2  6
                  end = ^ (10)         --> 0-0+1 = 1 [10]
                  end =     ^ (50)     --> 1-0+1 = 2 [5],[10,5]
                  end =        ^ (100) --> 2-1+1 = 2 [2],[5,2]
                start = ^ (100/10)     --> 1
                  end =           ^    --> 3-1+1 = 3 [6],[2,6],[5,2,6]
     */
}
