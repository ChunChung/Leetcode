package practice.week6;

public class PossibleTriangle{
	
	void bruteForceSolution(int[] nums) {
		for (int i = 0, end = nums.length ; i < end - 2; i++) {
			for (int j = i + 1; j < end - 1; j++) {
				for(int k = j + 1; k < end; k++) {
					if (nums[k] < nums[i] + nums[j]) {
						System.out.println(Integer.toString(nums[k]) + ", " + Integer.toString(nums[i]) + ", " + Integer.toString(nums[j]));
					}
				}
			}
		}
	}
	
	void threePointers(int[] nums) {
		for(int i = 0, end = nums.length; i < end - 2; i++) {
			int j = i + 1;
			int k = j + 1;
			
			while (k < end && j < k) {
				//System.out.println(Integer.toString(i) + ", " + Integer.toString(j) + ", " + Integer.toString(k));

				if (nums[i] + nums[j] <= nums[k]) {
					j++;
				} else if (nums[i] + nums[j] > nums[k]) {
					int temp = j;
					//System.out.println(Integer.toString(nums[i]) + ", " + Integer.toString(nums[j]) + ", " + Integer.toString(nums[k]));
					for (;j < k;j++) {
						System.out.println(Integer.toString(nums[i]) + ", " + Integer.toString(nums[j]) + ", " + Integer.toString(nums[k]));
					}
					j = temp + 1;
					k++;
				}
			}
		}
	}
	
	public static void main(String[] argv) {
		int[] nums = {12, 14, 16, 19, 20, 21, 23, 24, 28, 30, 37};
		//int[] nums = {1,2,3,4,5};
		PossibleTriangle obj = new PossibleTriangle();
		
		System.out.println("");
		obj.threePointers(nums);
		return;
	}
}