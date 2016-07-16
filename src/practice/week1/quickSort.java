package practice.week1;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class quickSort {
	private int[] helper;
	private int[] numbers;

	public int[] solution(int[] num) {
		this.helper = new int[num.length];
		this.numbers = num;
		quickSortHelper(num, 0, num.length - 1);
		return num;
	}

	private void quickSortHelper(int[] num, int left, int right) {
		//System.out.println(Integer.toString(left) + ", " + Integer.toString(right));
		
		// Left large than right
		if (left < right) {
			int pivot = right;
			int i = left;
			int j = right;
			
			while(i <= j) {
				while(i < j && num[i] < num[pivot]) {
					i ++;
				}
				while(i < j && num[j] > num[pivot]) {
					j --;
				}
				
				if(i < j) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
			
			int tmp = num[i];
			num[i] = num[pivot];
			num[pivot] = tmp;	
			
			if (left < j)
				quickSortHelper(num, left, j);
	        if (i < right)
	        	quickSortHelper(num, i, right);
			//merge(num, left, mid, right);
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
		quickSort A = new quickSort();
		
		System.out.println(Arrays.toString(A.solution(new int[] { 2, 3, 1, 2, 4, 3 })));

	}
}
