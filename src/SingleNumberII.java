import java.util.HashMap;
import java.util.Iterator;

public class SingleNumberII {
    public static int singleNumber(int[] A) {       
    	int ret=0;
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	for (int i=0; i<A.length; i++) {
    		int res = A[i];
    		if(hm.containsKey(res)) {
    			int value = hm.get(res) + 1;
    			hm.put(res, value);
    		} else{hm.put(res, 1);}
    	} 		
    	
    	Iterator<Integer> keySetIterator = hm.keySet().iterator();

    	while(keySetIterator.hasNext()){
    	  Integer key = keySetIterator.next();
    	  if (hm.get(key) == 1)
    		  ret = key;
    	}
    	
    	return ret;
    }    

    static public void main(String argv[])
	{
    	int A[] = {0,1,2,3,4,5,6,7,8,9,10,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
    	
    	SingleNumberII AA = new SingleNumberII();
    	System.out.println(Integer.toString(AA.singleNumber(A)));
	}  
}


