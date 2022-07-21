package Array;
/*
    https://leetcode.com/problems/find-peak-element/
 */

public class q05_Find_Peak_Element {

    public int findPeakElement(int[] nums) {
        int peak = 0;

        for (int i=0; i<nums.length; i++) {
            if (i==0 || nums[i] > nums[peak]) {
                peak = i;
            }
        }
        return peak;
    }
}
