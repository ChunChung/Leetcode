package practice.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coins {
	void solution(int[] nums, int target) {
		List<Integer> list = new ArrayList<Integer>();
		helper(nums, 0, 0, target, list);
	}

	void helper(int[] nums, int idx, int total, int target, List<Integer> list) {
		if (total == target) {
			System.out.println(list.toString());
			return;
		}
		if (idx == nums.length) {
			return;
		}
		while (total + nums[idx] <= target) {
			list.add(nums[idx]);
			total += nums[idx];
			helper(nums, idx + 1, total, target, list);
		}

		while (list.size() != 0 && list.get(list.size() - 1) == nums[idx]) {
			list.remove(list.size() - 1);
		}

		return;
	}

	/*
	 * 
	 * // Solution void helper(int moneyLeft, int level, int sol[]) { if (level
	 * == 3) { sol[level] = moneyLeft; print; return; } for (int i = 0, end =
	 * moneLeft / coin[level]; i <= end; i++) { sol[level] = i; helper(moneLeft
	 * - i * coin[level], level + 1, sol); } }
	 */

	public int sumTwo(int[] nums, int target) {
		Arrays.sort(nums);
		int slow = 0;
		int fast = nums.length - 1;
		int count = 0;
		while (slow < fast) {
			int sum = nums[slow] + nums[fast];
			if (sum == target) {
				slow = slow + 1;
				fast = fast - 1;
				int lcounter = 1;
				int rcounter = 1;
				while (nums[slow - 1] == nums[slow]) {
					lcounter++;
					slow++;
				}
				while (nums[fast + 1] == nums[fast]) {
					rcounter++;
					fast--;
				}
				System.out.println(lcounter);
				System.out.println(rcounter);

				count += lcounter * rcounter;
			} else if (sum > target) {
				fast--;
			} else {
				slow++;
			}
		}
		return count;
	}

	public static void main(String[] argv) {
		int[] array = new int[] { 1, 1, 2, 2, 3, 4};
		Coins obj = new Coins();
		
		
		//obj.solution(array, 99);

		System.out.println(obj.sumTwo(array, 5));
	}
}