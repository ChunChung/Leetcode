/*
[33] Search in Rotated Sorted Array  

https://leetcode.com/problems/search-in-rotated-sorted-array/description/

* algorithms
* Medium (31.99%)
* Total Accepted:    290.8K
* Total Submissions: 907.5K
* Testcase Example:  '[4,5,6,7,0,1,2]\n0'

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:


Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4


Example 2:


Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
*/

package LC30;

public class LeetCode33 {
    public int searchInRotedSortedArray(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] > nums[start]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
