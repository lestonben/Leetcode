package Heap;

/*
    https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

import java.util.PriorityQueue;

public class q_Kth_Largest_Element_in_an_Array {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);

        for (int i: nums) {
            queue.offer(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
