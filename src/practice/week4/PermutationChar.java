package practice.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationChar {
	public static void main(String[] argv) {
		String input = "12233";
		PermutationChar obj = new PermutationChar();
		obj.solution(input);
	}

	void solution(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);

		List<String> result = new ArrayList();
		helper(array, 0, result);

		for (String ss : result) {
			System.out.println(ss);
		}
		System.out.println(result.size());
	}

	void helper(char[] array, int index, List<String> result) {
		if (index == array.length) {
			result.add(String.valueOf(array));
			return;
		}

		for (int i = index, end = array.length; i < end; i++) {
			if (i > index && array[i] == array[i - 1]) {
				continue;
			} 
			swap(array, index, i);
			helper(array, index + 1, result);
			swap(array, index, i);
		}
	}

	void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}