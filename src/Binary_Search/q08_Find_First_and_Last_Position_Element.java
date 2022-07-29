package Binary_Search;

/*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */

public class q08_Find_First_and_Last_Position_Element {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchFirst(nums,target), searchLast(nums,target)};
    }

    public int searchFirst(int[] nums, int target) {
        int res = -1;
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) { res = mid; }

            if (nums[mid] >= target) { high = mid-1; }
            else { low = mid+1; }
        }
        return res;
    }

    public int searchLast(int[] nums, int target) {
        int res = -1;
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) { res = mid; }

            if (nums[mid] <= target) { low = mid+1; }
            else { high = mid-1; }
        }
        return res;
    }

    /*
            Scenario: 5 7 7 8 8 10   Target: 8

              First = (0+5)/2 -> 2
                    = (3+5)/2 -> 4   (nums[mid] >= target) so high = mid-1
                    = (3+3)/2 -> 3   (nums[mid] >= target) so high = mid-1
              return as 3 < 2, so first = 3

              Last = (0+5)/2 -> 2
                   = (3+5)/2 -> 4    (nums[mid] <= target) so low = mid+1
                   = (5+5)/2 -> 5
              return as 5 < 4, so last = 4

     */
}
