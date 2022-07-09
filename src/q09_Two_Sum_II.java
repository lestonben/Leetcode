public class q09_Two_Sum_II {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        //使用双指针
        int left = 0;
        int right = nums.length-1;

        //条件是当左右没有跨越边
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) { right--; }
            else if (sum < target) { left++; }
            else {
                //分配对应index，从1开始计算 那么就会+1
                res[0] = left+1;
                res[1] = right+1;
                break;
            }
        }
        return res;
    }
}
