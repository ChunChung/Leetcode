import java.util.Arrays;
import java.util.Collections;


public class partitionArray {
    static public int solution(int[] nums, int k) {
	    if(nums==null || nums.length==0) return 0;
	    
	    int len = nums.length;
	    int ans = 0;
	    for(int i=len-1;i>=ans;i--) {
	        if(ans == len) break;

	        if(nums[i] < k) {
	            int swap=nums[ans];
	            nums[ans] = nums[i];
	            nums[i] = swap;
	            i++;
	            ans++;
	        }
	    }
	    System.out.println(Arrays.toString(nums));
	    return ans;
    }

	static public void main(String argv[]) {
		int[] price = {7,7,9,8,6,6,8,7,9,8,6,6};
		System.out.println(solution(price, 10));
	}
}