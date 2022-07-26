
/*
     https://leetcode.com/problems/find-pivot-index/
*/

public class q_Find_Pivot_Index {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        for (int i: nums) right += i;

        for (int i=0; i<nums.length; i++) {
            if (i != 0) left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }

    /*

            1 7 3 6 5 6
            ^
          0 = 7+3+6+5+6 (false)
              ^
            1 = 3+6+5+6 (false)
                ^
            1+7 = 6+5+6 (false)
                  ^
            1+7+3 = 5+6 (true) return pivot (3);

     */
}
