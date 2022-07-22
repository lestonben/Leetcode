package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    https://leetcode.com/problems/permutations-ii/
 */

public class q05_Permutations_II {

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,1,2}));
        System.out.println(permuteUnique(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backTracking(resList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resList;
    }

    public static void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] visited) {
        if (tempList.size()==nums.length) {
            list.add(new ArrayList<>(tempList));
        }

        for (int i=0; i<nums.length; i++) {
            if (visited[i] || i > 0 && nums[i] == nums[i-1] && !visited[i-1]) {
                continue;
            }

            visited[i] = true;
            tempList.add(nums[i]);
            backTracking(list, tempList, nums, visited);
            visited[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }
}
