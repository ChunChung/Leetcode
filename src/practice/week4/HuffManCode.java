package practice.week4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffManCode {
    public static void main(String[] args)
    {
        Comparator<FreqNode> comparator = new FreqNodeComparator();
        PriorityQueue<FreqNode> queue = 
            new PriorityQueue<FreqNode>(10, comparator);
        queue.offer(new FreqNode('a', 6));
        queue.offer(new FreqNode('z', 5));
        queue.offer(new FreqNode('w', 3));

        queue.offer(new FreqNode('b', 4));
        
        while (queue.size() != 0)
        {
            System.out.println(queue.poll().ch);
        }
    }
}