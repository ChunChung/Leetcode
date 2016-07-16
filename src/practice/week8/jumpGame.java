package practice.week8;


public class jumpGame {
	
	public static void main(String[] argv) {
		jumpGame obj = new jumpGame();
		int[] nums = {2, 0};
		System.out.println(obj.solution(nums));
	}
	
	public boolean solution(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return true;
		}
		
		int[] steps = new int[nums.length + 1];
		for (int i = 0, end = nums.length; i < end;) {
			steps[i] = i + nums[i];
			int next = steps[i];
			int farest = steps[i];
			for (int j = i;j < end && j <= steps[i]; j++) {
				steps[j] = j + nums[j];
				if (steps[j] == end - 1 || steps[j] > farest) {
					farest = steps[j];
					next = j;
				}
			}
			
			if (next == i) {
				return false;
			}
			
			if (next >= end - 1) {
				return true;
			}
			
			i = next;
		}
		return false;
	}
}