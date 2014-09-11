public class ReverseInteger {
    public static int reverse(int x) {
    	int ret=0;
    	boolean negitive = false;
    	
    	if(x < 0) {
    		negitive = true;
    		x = 0 - x;
    	}
    	while(x / 10 > 0) {
    		ret = ret * 10  + x % 10; 
    		x = x /10;
    	}
    	ret = ret * 10  + x % 10;
    	return (negitive)?(0-ret):ret;
    }
    

    
    static public void main(String argv[]) {
    	System.out.println(reverse(-123100));
    }
}