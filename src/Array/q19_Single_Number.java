package Array;

/*
    https://leetcode.com/problems/single-number/
 */

import java.util.*;

public class q19_Single_Number {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums) { map.put(i, map.getOrDefault(i,0)+1); }

        for (Map.Entry<Integer, Integer> data: map.entrySet()) {
            if (data.getValue() == 1) { return data.getKey(); }
        }
        return 0;
    }
}
