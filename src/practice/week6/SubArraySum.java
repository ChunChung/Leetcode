package practice.week6;


public class SubArraySum{
	
	int solution(int[] nums) {
		
		int[] subsum = new int [nums.length + 1];
		subsum[0] = 0;
		
		for (int i = 0; i < nums.length; i++) {
			subsum[i+1] += nums[i] + subsum[i];
		}
		
		int count = 0;
		for (int j = 0; j < subsum.length - 1; j++) {
			for (int k = j + 1; k < subsum.length; k++ ) {
				if (subsum[k] - subsum[j] == 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] argv) {
		int[] nums = {2, 3, 5, -5, -3, 4, 0, 1};
		
		
		SubArraySum obj = new SubArraySum();
		System.out.println(obj.solution(nums));
	}
}