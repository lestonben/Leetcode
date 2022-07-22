package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/permutations/
 */

public class q_Permutations_of_Integers {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backTracking(resList, new ArrayList<>(), nums);
        return resList;
    }

    public static void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        }

        for (int i=0; i<nums.length; i++) {
            if (tempList.contains(nums[i])) { continue; }
            tempList.add(nums[i]);
            backTracking(list, tempList, nums);
            tempList.remove(tempList.size()-1);
        }
    }
}
