import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Leetcode209 {
    public static int solution(int s, int[] nums) {       
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int minSize = Integer.MAX_VALUE;
        
        if(nums.length == 0) return 0;

        while(fast < nums.length) {
            do {
                sum = sum + nums[fast];
                fast = fast + 1;
            } while (sum < s && fast < nums.length);
            
            while ((sum - nums[slow]) >= s && slow < fast) {
                sum = sum - nums[slow];
                slow = slow + 1;
            }
            //System.out.println(Integer.toString(slow) + ", " + Integer.toString(fast));
            minSize = Math.min(minSize, fast-slow);
        }
        
        return (sum >= s)?minSize:0;
    }   

    static public void main(String argv[])
	{
    	int A = 7168;
  
    	System.out.println(solution(7, new int[]{2,3,1,2,4,3}));
	}  
}


