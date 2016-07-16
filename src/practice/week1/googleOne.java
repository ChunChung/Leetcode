package practice.week1;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class googleOne {

	public int solution(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		Stack<Integer> helper = new Stack<Integer>();
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (helper.isEmpty() && nums[i] > max) {
				max = nums[i];
				helper.push(nums[i]);
			} else {
				while (!helper.isEmpty() && nums[i] < helper.peek()) {
					helper.pop();
				}
			}
		}
		return helper.size();
	}

	static public void main(String argv[]) {
		googleOne A = new googleOne();

		System.out.println(A.solution(new int[] { 2, 1, 3, 5, 4, 6}));

	}
}
