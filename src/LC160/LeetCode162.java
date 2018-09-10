package LC160;

/*
https://leetcode.com/problems/find-peak-element/description/

* algorithms
* Medium (38.87%)
* Total Accepted:    165.1K
* Total Submissions: 418.8K
* Testcase Example:  '[1,2,3,1]'

A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Example 1:


Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:


Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.


Note:

Your solution should be in logarithmic complexity.
*/
class LeetCode162 {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                return i;
            }
        }
        return nums.length-1;
    }

    public int findPeakElementMethod2(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid-1]) {
                start = mid;
            } else if (nums[mid] < nums[mid-1]) {
                end = mid;
            } else {
                return mid;
            }
        }
        return nums[start] > nums[end] ? start: end;
    }
}
