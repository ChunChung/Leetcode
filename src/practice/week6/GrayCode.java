package practice.week6;

import java.util.LinkedList;

public class GrayCode {
	
	
	public static void main(String[] argv) {
        int n = 2;
		LinkedList<Integer> queue = new LinkedList();
        queue.offer(0);
        int level = 0;
            while (n > 0 && queue.peek() != null) {
                int val = queue.poll();
                if (level % 2 == 0) {
                    queue.offer(val << 1);
                    queue.offer((val << 1) + 1);
                } else {
                    queue.offer((val << 1) + 1);
                    queue.offer(val << 1);
                }
                level --;
                if (level <= 0) {
                    level = queue.size();
                    //System.out.println(level);
                    //System.out.println(queue.toString());
                    n--;
                }
            }
        
        //System.out.println(queue.toString());
        return ;
	}
}