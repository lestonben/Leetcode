package Backtracking;

import java.util.*;

/*
    https://leetcode.com/problems/subsets-ii/
 */

public class q03_Subsets_II {

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,4,4,4}));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backTracking(resList, new ArrayList<>(), nums, 0);
        return resList;
    }

    public static void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int current) {
        list.add(new ArrayList<>(tempList));

        for (int i=current; i<nums.length; i++) {
            if (i > current && nums[i] == nums[i-1]) { continue; }
            tempList.add(nums[i]);
            backTracking(list, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
