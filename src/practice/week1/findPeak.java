package practice.week1;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class findPeak {

	public int solution(int[] nums) {
		if (nums == null || nums.length < 1) {
			return -1;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
				return mid;
			}

			if (nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]) {
				// No duplicate, therefore no need to add =
				right = mid;
			} else if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
				left = mid;
			} else {
				if (nums[right] < nums[mid]) {
					right = mid;
				} else {
					left = mid;
				}
			}
		}

		return (nums[left] < nums[right]) ? left : right;
	}

	static public void main(String argv[]) {
		findPeak A = new findPeak();

		System.out.println(A.solution(new int[] { 1, 3, 4, 5 ,6}));

	}
}
