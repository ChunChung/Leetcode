package practice2018.Sorting;

public class QuickSort {
    public int[] sort(int[] nums) {
        helper(nums, 0, nums.length - 1);
        return nums;
    }

    private void helper(int[] nums, int start, int end) {
        if (start < end) {
            int i = partition(nums, start, end);
            helper(nums, start, i - 1);
            helper(nums, i + 1, end);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left + (right - left) / 2];
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
