import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Leetcode202 {
    public static boolean solution(int n) {       
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        while(true) {

            int result = 0;
            result += Math.pow(n%10,2);
            System.out.println(n);
            while(n/10 >0){
                n = n/10;
                result += Math.pow(n%10,2);
            }
            n = n/10;
            result += Math.pow(n%10,2);

            if(result == 1) 
                return true;
            else {
                if(hashtable.containsKey(result)) {
                    return false;
                }
                hashtable.put(result, 1);
                n = result;
            }
            
        }
    }   

    static public void main(String argv[])
	{
    	int A = 7168;
  
    	System.out.println(solution(A));
	}  
}


