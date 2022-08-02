package Heap;

/*
    https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class q_Kth_Largest_Element_in_a_Stream {

    PriorityQueue<Integer> queue;
    int k;

    public q_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        queue = new PriorityQueue<>(k);
        k = k;

        for (int i: nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.add(val);
        }
        else if (queue.peek() < val) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}
