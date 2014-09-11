
public class SolutionSingleNumber {
    public static int singleNumber(int[] A) {       
    	int ret=0;
    	for (int i=0; i<A.length; i++) {
    		ret ^= A[i];
    			
    	} 
    		
    	return ret;
    }
    
/*    static public void main(String argv[])
	{
    	int A[] = {0,1,2,3,4,5,6,7,8,9,10,0,1,2,3,4,5,6,7,8,9};
    	System.out.println(singleNumber(A));
	}  */  
}


