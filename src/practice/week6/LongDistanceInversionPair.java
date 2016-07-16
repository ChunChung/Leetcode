package practice.week6;

import java.util.Arrays;

public class LongDistanceInversionPair {
	void solution(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
	}

	void mergeSort(int[] nums, int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			mergeSort(nums, left, middle);
			mergeSort(nums, middle + 1, right);
			mergeHelper(nums, left, right);
			System.out.println(Arrays.toString(nums));
		}
	}

	void mergeHelper(int[] nums, int left, int right) {
		int middle = left + (right - left) / 2;
		int l = left;
		int r = middle + 1;
		System.out.println(Integer.toString(left) + "," + Integer.toString(right));
		int index = 0;
		int[] temp = new int[right - left + 1];
		while (l <= middle && r <= right) {
			if (nums[l] < nums[r]) {
				temp[index++] = nums[l++];
			} else {
				temp[index++] = nums[r++];
			}
		}
		while (l <= middle) {
			temp[index++] = nums[l++];
		}
        while (r <= right) {
			temp[index++] = nums[r++];
        }
		
		while (index > 0) {
			nums[right] = temp[--index];
			right--;
		}
		//System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] argv) {
		int[] nums = { 1, 3, 0, 6, 4, 2 };
		LongDistanceInversionPair obj = new LongDistanceInversionPair();
		//obj.solution(nums);
		//int i = 1;
		//System.out.println(i<<2);
		System.out.println(4 & 1);
	}
}