package Binary_Search;

/*
    https://leetcode.com/problems/intersection-of-two-arrays/
 */

import java.util.*;

public class q05_Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums1) {
            if (binarySearch(nums2, i)) {
                set.add(i);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) { return true; }

            if (nums[mid] > target) { high = mid-1; }
            else { low = mid+1; }
        }
        return false;
    }
}
