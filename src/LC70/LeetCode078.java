/*
[78] Subsets  

https://leetcode.com/problems/subsets/description/

* algorithms
* Medium (44.60%)
* Total Accepted:    230.4K
* Total Submissions: 514.3K
* Testcase Example:  '[1,2,3]'


Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.


For example,
If nums = [1,2,3], a solution is:



[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/
package LC70;

import java.util.ArrayList;
import java.util.List;

class LeetCode078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (null == nums) {
            return results;    
        }   
        
        List<Integer> localSolution = new ArrayList();
        results.add(localSolution);
        helper(nums, localSolution, results, 0);
        
        return results;
    }
    
    private void helper(int[] nums, 
                        List<Integer> tmpSolution, 
                        List<List<Integer>> results, 
                        int index)
    { 
        if (index == nums.length) {
            return;
        }
        
        for (int i = index; i < nums.length; i++) {
            List<Integer> localSolution = new ArrayList(tmpSolution);
            localSolution.add(nums[i]);
            results.add(localSolution);
            helper(nums, localSolution, results, i + 1);
        }
    }
}