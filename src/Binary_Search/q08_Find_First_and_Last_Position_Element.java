package Binary_Search;

/*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */

public class q08_Find_First_and_Last_Position_Element {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = binarySearchFirst(nums, target);
        res[1] = binarySearchLast(nums, target);
        return res;
    }

    public int binarySearchFirst(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int res = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) { res = mid; }
            if (nums[mid] < target) { low = mid+1; }
            else { high = mid-1; }
        }
        return res;
    }

    public int binarySearchLast(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int res = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) { res = mid; }
            if (nums[mid] > target) { high = mid-1; }
            else { low = mid+1; }
        }
        return res;
    }
}
