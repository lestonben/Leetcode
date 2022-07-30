package Binary_Search;
/*
    https://leetcode.com/problems/find-peak-element/
 */

public class q09_Find_Peak_Element {

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 0) { return 0; }

        int low = 0, high = len-1;
        while (low < high) {
            int mid = (low+high)/2;

            if (nums[mid] < nums[mid+1]) { low = mid+1; }
            else { high = mid; }
        }
        return low;
    }
}
