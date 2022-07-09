import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class q05_Top_K_Frequent_Elements {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) { return new int[]{}; }

        int[] res = new int[k];
        //计算每个值重复的次数
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        //采用queue方式排序多次使用的值 (添加Comparator条件:为了排序key的value值小到大 避免移除key的最大值)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(countMap::get));
        for (int val: countMap.keySet()) {
            queue.add(val);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        //存放进array并等下返回
        for (int i=0; i<k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
