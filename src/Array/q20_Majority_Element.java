package Array;

/*
    https://leetcode.com/problems/majority-element/
 */

import java.util.HashMap;
import java.util.Map;

public class q20_Majority_Element {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) { return nums[0]; }

        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
            if (map.get(res) == null || map.get(i) > map.get(res)) {
                res = i;
            }
        }
        return res;
    }
}
