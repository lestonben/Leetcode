package Two_Pointers;

import java.util.*;

public class q03_Three_Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) { return new ArrayList<>(); }

        //使用双指针 前提需要排序小到大
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i=0; i<nums.length-2; i++) {
            //理解成 a+b+c=0 的原理 然后默认一个目标值为target (数学逻辑: a+b=0-c)
            if (i==0 || nums[i] != nums[i-1]) {
                int target = 0-nums[i];
                int left=i+1;
                int right=nums.length-1;
                while (left < right) {
                    if (nums[left]+nums[right] > target) { right--; }
                    else if (nums[left]+nums[right] < target) { left++; }
                    else {
                        res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        //避免重复值 组成一个3Sum
                        while (left < right && nums[left] == nums[left+1]) { left++; }
                        while (left < right && nums[right] == nums[right-1]) { right--; }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
