import java.util.Arrays;

public class BestTimeBuySellStockII {
    public static int maxProfit(int[] price) {
    	int ret=0;
    	
    	Math.max(ret, ret+maxProfit(Arrays.copyOfRange(price, 1, price.length)));
    	
    	return ret;
    }
    
    public int sellStock(int[] price, int priceOwn) {
    	return priceOwn;
    }
    

    
    static public void main(String argv[]) {
    	int []price = {1,2,3,4,2};
    	System.out.println(maxProfit(price));
    }
}