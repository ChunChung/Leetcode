package practice.week5;

import java.util.Arrays;

public class AllowDuplicate {

	void solution(char[] array) {

		int slow = 0, fast = 1;
		int count = 0;
		while (fast < array.length) {
			if (array[fast] == array[slow] && count > 0) {
				fast++;
			} else {
				if (count == 0) {
					count ++;
				} else {
					count = 0;
				}
				array[++slow] = array[fast++];
			}
		}
		System.out.println(slow);
		System.out.println(Arrays.toString(array));

	}
	
	void solution2() {
		int[] input = new int[]{1,1,1,2,3,4,4,4,5};
		int slow = 2, fast = 2;
		while (fast < input.length) {
			if (input[fast] != input[fast - 2]) {
				input[slow++] = input[fast];
			}
			fast++;
		}
	}

	public static void main(String[] argv) {
		String input = "AAAABCCC";
		AllowDuplicate obj = new AllowDuplicate();
		obj.solution(input.toCharArray());
		return;
	}
}