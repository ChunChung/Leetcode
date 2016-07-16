package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class permutationTwo {
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if (nums == null || nums.size() == 0) { 
    		return result;
    	}
    	
    	Collections.sort(nums);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	int [] visited = new int[nums.size()];
    	permuteHelper(result, list, nums, visited);
    	return result;
    }
    
    private void permuteHelper(ArrayList<ArrayList<Integer>> result, 
    		ArrayList<Integer> list, ArrayList<Integer> nums, int[] visited) {
    	if (list.size() == nums.size()) {
    		result.add(new ArrayList<Integer>(list));
    		System.out.println(list);
    		return;
    	}	
    	
    	for (int i = 0; i < nums.size(); i++) {
    		if(visited[i] != 0 || (i > 0 && nums.get(i) == nums.get(i - 1) && visited[i - 1] == 0)) {
    			continue;
    		}
    		
    		list.add(nums.get(i));
    		visited[i] = 1;
    		permuteHelper(result, list, nums, visited);
    		list.remove(list.size() - 1);
    		visited[i] = 0;
    	}
    }
}
