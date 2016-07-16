package lintcode;

import java.util.ArrayList;

public class permutationSolution {
	
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        
        if(nums == null) return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        permuteHelper(result, list, nums);
     
        return result;
    }
    
    private void permuteHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, ArrayList<Integer> nums) {
    	if(list.size() == nums.size()) {
    		result.add(new ArrayList<Integer> (list));
    	}
    	
    	for(int i=0; i<nums.size(); i++) {
    		if(list.contains(nums.get(i))) {
    			continue;
    		}
    		
    		list.add(nums.get(i));
    		permuteHelper(result,list,nums);
    		list.remove(list.size()-1);
    	}
    }
}
