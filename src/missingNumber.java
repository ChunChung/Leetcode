import java.util.Arrays;

public class missingNumber {
	public static int missingNumber(int[] nums) {
		int missing = nums.length;
		int count = nums.length;
		int index = nums[0];
		while(count > 0) {
		    if(index == nums.length) {
		    	count = count -1;
		    	index = nums[(index+1) % missing];
		    }
			else if(index!=-1 && nums[index] != -1) {
				int temp = index;
				count = count -1;
				index = nums[index];
				nums[temp] = -1;
			}
			else {
				index = nums[(index+1)%missing];
				while(index == -1) {
					System.out.println(Arrays.toString(nums));

					index = nums[(index+1)%missing];
				}
			}
		}
		
		for(int i = 0; i<nums.length; i ++) {
			if(nums[i] != -1)
				missing = i;
		}
		
		System.out.println(Arrays.toString(nums));
		return missing;
	}

	static public void main(String argv[]) {
		int[] price = { 0, 1, 2, 3, 4, 7, 6};
		System.out.println(missingNumber(price));
	}
}