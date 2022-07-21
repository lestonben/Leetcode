package Array;

/*
    https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;
import java.util.Map;

public class q01_Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        //使用map的方式 key-扣除第一个值之后的剩下的差别值 value-第一个值的index
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            //检查是否当前的值 可以扣除为0
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            //否则继续存放进map
            int diff = target-nums[i];
            map.put(diff, i);
        }
        return new int[]{};
    }
}
