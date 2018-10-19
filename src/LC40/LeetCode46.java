/*
[46] Permutations  

https://leetcode.com/problems/permutations/description/

* algorithms
* Medium (47.16%)
* Total Accepted:    231.4K
* Total Submissions: 488.9K
* Testcase Example:  '[1,2,3]'


Given a collection of distinct numbers, return all possible permutations.



For example,
[1,2,3] have the following permutations:

[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]


*/

package LC40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeetCode46 {
	class Solution {
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> results = new ArrayList();
	        if (nums.length == 0) {
	            return results;
	        }
	        
	        boolean[] visited = new boolean[nums.length];
	        
	        Arrays.fill(visited, false);        
	        helper(results, nums, visited, new ArrayList<Integer>());
	        return results;
	    }
	    
	    private void helper(List<List<Integer>> results, int[] nums, boolean[] visited, List<Integer> result) {
	        if (result.size() == nums.length) {
	            results.add(new ArrayList<Integer>(result));
	            return;
	        }
	        
	        for (int i = 0; i < nums.length; i++) {
	            if (visited[i] == true)
	                continue;
	            
	            visited[i] = true;
	            result.add(nums[i]);
	            helper(results, nums, visited, result);
	            
	            
	            visited[i] = false;
	            result.remove(result.size() - 1);
	        }
	        
	    }
	}
}
