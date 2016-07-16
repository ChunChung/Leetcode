package practice.week1;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class mergeSort {
	private int[] helper;
	private int[] numbers;

	public int[] solution(int[] num) {
		this.helper = new int[num.length];
		this.numbers = num;
		mergeSortHelper(num, 0, num.length - 1);
		return num;
	}

	private void mergeSortHelper(int[] num, int left, int right) {
		//System.out.println(Integer.toString(left) + ", " + Integer.toString(right));
		
		// Left large than right
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSortHelper(num, left, mid);
			mergeSortHelper(num, mid + 1, right);
			merge(num, left, mid, right);
		}
	}

	private void merge(int[] num, int left, int mid, int right) {
		for (int i = left; i <= right; i++) {
			this.helper[i] = num[i];
		}

		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (this.helper[i] <= this.helper[j]) {
				this.numbers[k] = this.helper[i];
				i++;
			} else {
				this.numbers[k] = this.helper[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			this.numbers[k] = this.helper[i];
			k++;
			i++;
		}
		//System.out.println(Arrays.toString(numbers));
	}

	static public void main(String argv[]) {
		mergeSort A = new mergeSort();
		
		System.out.println(Arrays.toString(A.solution(new int[] { 2, 3, 1, 2, 4, 3 })));

	}
}
