package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class q_Last_Stone_Weight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone: stones) { queue.offer(stone); }

        while (queue.size() > 1) {
            queue.add(queue.poll() - queue.poll());
        }
        return queue.peek();
    }
}
