import java.util.Arrays;


public class removeDuplicate {
    static public int solution(int[] nums) {
        if(nums.length<2) return nums.length;
    	int ans=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[ans]!=nums[i])
                nums[++ans] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return ans+1;
    }

	static public void main(String argv[]) {
		int[] price = {1,2,3,4,5,6};
		System.out.println(solution(price));
	}
}