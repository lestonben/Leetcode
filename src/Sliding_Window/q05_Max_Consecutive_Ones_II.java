package Sliding_Window;

/*
    https://leetcode.com/problems/max-consecutive-ones-iii/
 */

public class q05_Max_Consecutive_Ones_II {

    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0, start = 0, count = 0;

        for (int end=0; end<nums.length; end++) {
            if (nums[end] == 0) { count++; }
            while (count > k) {
                if (nums[start] == 0) { count--; }
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }


    /*
            [ 1 1 1 0 0 0 1 1 1 1 0 ]    k = 2 (replaceable number of elements)
                        ^         ^
            [      ...  1 1 1 1 1 1 ]    or
                      ^ ^
            [     ... 1 1 1 1 1 1 0 ]

            ans: 6 elements
     */
}
