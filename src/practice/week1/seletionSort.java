package practice.week1;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class seletionSort {
	public static int[] solution(int[] array) {
		if (array == null || array.length < 1)
			return array;
		for (int i = 0; i < array.length; i++) {
			int minimum = Integer.MAX_VALUE; // INT_MAX
			int swapIndex=i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < minimum) {
					minimum = array[j];
					swapIndex = j;
				}
			}
			int tmp = array[i];
			array[i] = minimum;
			array[swapIndex] = tmp;
		}
		System.out.println(array);
		return array;
	}

	static public void main(String argv[]) {
		int A = 7168;
		
		System.out.println(Integer.MAX_VALUE + 1);

		System.out.println(solution(new int[] { 2, 3, 1, 2, 4, 3 }));
		
	}
}
