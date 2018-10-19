class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length <= 0) {
            return result;
        }
        
        int left = 0; 
        int right = nums.length - 1;
        
        // Search right index
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target ) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        
        if (nums[right] == target) {
            result[1] = right;
        } else if (nums[left] == target) {
            result[1] = left;
        } else {
            return result;
        }
        
        left = 0; 
        right = nums.length - 1;
        
        // Search left index
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (nums[left] == target) {
            result[0] = left;
        } else if (nums[right] == target) {
            result[0] = right;
        } 
    
        return result;
        
    }
}
