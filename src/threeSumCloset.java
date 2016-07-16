import java.util.Arrays;
import java.util.Collections;


public class threeSumCloset {
    static public int solution(int[] numbers, int target) {
    	int len = numbers.length;
    	if(len<3 || numbers==null) return -1;
    	
    	Arrays.sort(numbers);
    	int difference = Integer.MAX_VALUE;
    	int ans = 0;
    	for(int i=0;i<len-2;i++) {
    		if(i>0 && numbers[i] == numbers[i-1] ) continue;
    		
    		int j=i+1;
    		int k=len-1;

    		while(j<k){

    			int sum = numbers[i] + numbers[j] + numbers[k];
    			if(sum == target) {
    				return sum;
    			}
    			else if(Math.abs(target-sum) < difference) {
    				difference = Math.abs(target-sum);
    				ans = sum;
    			}
    			else if(sum>target) {
    				k--;
    			}
    			else 
    				j++;
    		}
    	}
    	return ans;
    }

	static public void main(String argv[]) {
		int[] price = {-1,2,1,-4};
		System.out.println(solution(price, 1));
	}
}