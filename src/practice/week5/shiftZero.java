package practice.week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class shiftZero {

	void solution(char[] array) {

		int slow = 0, fast = 1;
		while (fast < array.length) {
			if (array[fast] == array[slow]
					&& (slow > 0 && array[slow] != array[slow - 1])) {
				fast++;
			} else {
				array[++slow] = array[fast++];
			}
		}
		
		System.out.println(Arrays.toString(array));

	}

	void sortLetters(List<Character> array) {
		Collections.sort(array, new letterComparator());
	}
	
	public class letterComparator implements Comparator<Character> {
		public int compare(Character a, Character b) { 
			return (a > b)? 1: -1;
		}
	}
	
	public static void main(String[] argv) {
		String input = "";
		shiftZero obj = new shiftZero();
		obj.solution(input.toCharArray());
		return;
	}
}