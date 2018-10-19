package LC210;

import java.util.Collections;
import java.util.PriorityQueue;

class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());

        for (int num: nums) {
            priorityQueue.offer(num);
        }

        while(k > 1) {
            priorityQueue.poll();
            k--;
        }

        return priorityQueue.poll();
    }

    public int findKthLargestMethod2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k);

        for (int num: nums) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(num);
            }
            else
            {
                if (num > priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.offer(num);
                }
            }
        }


        return priorityQueue.peek();
    }
}
