import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class q07_Longest_Consecutive_Sequence {

    public int longestConsecutive(int[] nums) {
        // 存放进set
        Set<Integer> set = new HashSet<>();
        for (int num: nums) { set.add(num); }

        int res = 0;
        for (int num: nums) {
            // 以当前的值的分配前后值
            int left = num-1;
            int right = num+1;
            // 看是否之前设置好的set 存在持续·前后的值
            while (set.remove(left)) { left--; }
            while (set.remove(right)) { right++; }
            res = Math.max(res, right-left-1);
        }
        return res;
    }
}
