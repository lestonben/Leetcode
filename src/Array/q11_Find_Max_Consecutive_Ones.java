package Array;

/*
    https://leetcode.com/problems/max-consecutive-ones/
 */

public class q11_Find_Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i: nums) {
            if (i == 1) count++;
            else count=0;
            res = Math.max(res, count);
        }
        return res;
    }
}
