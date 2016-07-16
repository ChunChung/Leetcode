import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class perfectSquares {
    public static int solution(int n) {       
    	int bigI = (int) Math.sqrt(n);
    	
    	int[] table = new int[n+1];
    	Arrays.fill(table,Integer.MAX_VALUE-1);
    	//Deque<Integer> deque = new LinkedList<Integer>();
    	table[0] = 0;
    	for(int i=1;i<=bigI;i++) {
    		table[i*i] = 1;
    	}
    	
    	for(int j=1;j<=n;++j) {
    		for(int k=(int)Math.sqrt(j);k>0;--k) {
    			int restValue = j-(k*k);
    			table[j] = Math.min(1+table[restValue], table[j]);

    		}
    	}
    	
    	return table[n];
    }   
    
    public static int solutionBFS(int n) {
    	if(n<2) return n;
    	int level = 0;
    	Deque<Integer> queue = new LinkedList<Integer>();
    	queue.offer(0);
    	queue.offer(-1);
    	int q = 0;
    	while(true) {
    		level = level + 1;
    		q = queue.poll();
    		boolean[] visited = new boolean[n+1];
			while(q!=-1) {
	    		for(int i=1, sqrtN=(int)Math.sqrt(n);i<=sqrtN;++i) {
	    			if((q + i*i) == n) return level;
	    			if((q+i*i)>n || visited[q + i*i] ) continue;
	    			visited[q+i*i] = true;
	    			queue.offer(q + i*i);
	    		}
	    		q = queue.poll();
			}
	    	queue.offer(-1);
    	}
    }  

    static public void main(String argv[])
	{
    	int A = 7168;
  
    	perfectSquares AA = new perfectSquares();
    	System.out.println(Integer.toString(AA.solutionBFS(A)));
	}  
}


