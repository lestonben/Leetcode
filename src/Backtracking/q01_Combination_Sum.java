package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/combination-sum/
 */

public class q01_Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        backTracking(resList, new ArrayList<>(), candidates, target, 0);
        return resList;
    }

    public void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int current) {
        if (target == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        else if (target < 0) { //over the required amount (negative value) then return
            return;
        }

        for (int i=current; i<candidates.length; i++) {
            tempList.add(candidates[i]);
            backTracking(list, tempList, candidates, target-candidates[i], i);
            tempList.remove(tempList.size()-1);
        }
    }
}
