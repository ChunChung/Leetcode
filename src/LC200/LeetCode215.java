package LC200;


import utils.ArrayUtil;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element in the sorted order, not the kth distinct element. For
 * example, Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 * @author chunchung
 *
 */
class LeetCode215{	
    public int findKthLargest(int[] nums, int k) {
    	if (null == nums || nums.length == 0) {
    		return 0;
    	}       
    	return helper(nums, 0, nums.length - 1, nums.length - k);
    }
        
    private int helper(int[] nums, int start, int end, int k) {
    	int pivotPos = partition(nums, start, end);
    	
    	if (pivotPos == k) {
    		return nums[pivotPos];
    	} else if (pivotPos < k) {
    		return helper(nums, pivotPos + 1, end, k);
    	} else {
    		return helper(nums, start, pivotPos - 1, k);
    	}
		
    }
    
    private int partition(int[] nums, int start, int end) {
    	if (start > end) {
    		return start;
    	}
    	
    	int pivot = nums[end];
    	int firstIndex = start;
    	
    	for (int i = start; i < end; i++) {
    		if(nums[i] < pivot) {
    			swap(nums, firstIndex, i);
    			firstIndex++;
    		}
    	}
    	
    	swap(nums, firstIndex, end);
    	return firstIndex;
    }
	
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j]; 
    	nums[j] = temp;
    } 
    
    /*
     * Method 2: Another way to write quickSort
    public int findKthLargest(int[] nums, int k) {
        quickSelect(nums, 0, nums.length - 1, k - 1);
        return nums[k - 1];
    }
    
    private void quickSelect(int[] nums, int start, int end, int k) {
        int mid = (end - start) / 2 + start;
        int pivot = nums[mid];
        int left = start, right = end;
        while (left <= right) {
            while (left <= right && nums[left] > pivot) {
                left++;
            }
            
            while (left <= right && nums[right] < pivot) {
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
        
        if (k >= start && k <= right) {
            quickSelect(nums, start, right, k);
        } 
        
        if (k >= left && k <= end) {
            quickSelect(nums, left, end, k);
        }

    } 
     */   
    
	public static void main(String[] argv) {
		int[] nums = {3,1,2,4};
		LeetCode215 test = new LeetCode215();
		System.out.println(test.findKthLargest(nums, 2));	
		System.out.println(ArrayUtil.arrayToString(nums));
	}
}