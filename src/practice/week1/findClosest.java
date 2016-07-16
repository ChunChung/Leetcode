package practice.week1;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class findClosest {

	public int solution(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		if (nums == null || nums.length == 0)
			return -1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				while (nums[mid - 1] == target) {
					mid--;
				}
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return 0;
	}

	static public void main(String argv[]) {
		findClosest A = new findClosest();

		System.out.println(A.solution(new int[] { 1,5,5,5,5,5 }, 1));

	}
}
