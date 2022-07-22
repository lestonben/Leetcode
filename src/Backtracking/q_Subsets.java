package Backtracking;

/*
    https://leetcode.com/problems/subsets/
 */

import java.util.ArrayList;
import java.util.List;

public class q_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backTracking(resList, new ArrayList<>(), nums, 0);
        return resList;
    }

    public void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int current) {
        list.add(new ArrayList<>(tempList));

        for (int i=current; i<nums.length; i++) {
            tempList.add(nums[i]);
            backTracking(list, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
