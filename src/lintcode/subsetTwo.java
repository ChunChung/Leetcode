package lintcode;

import java.util.ArrayList;
import java.util.Collections;

public class subsetTwo {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(nums == null || nums.size() == 0) {
            return result;
        }
        
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        subsetHelper(result, list, nums, 0);
     
        return result;
    }
    
    private void subsetHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, ArrayList<Integer> nums, int pos) {
    	System.out.println(list);
    	result.add(new ArrayList<Integer> (list));
    	
    	for(int i = pos; i < nums.size(); i++) {
    		if((i != pos) && nums.get(i) == nums.get(i - 1)) {
    			continue;
    		}
    		
    		list.add(nums.get(i));
    		subsetHelper(result, list, nums, i + 1);
    		list.remove(list.size()-1);
    	}
    }
}
