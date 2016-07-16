package lintcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class largestNumber {
	
    public String largestNumber(int[] num) {
    	String result = "";
    	if(num == null) {
    		return null;
    	}
    	else if (num.length == 1) {
    		return Integer.toString(num[0]);
    	}
    	
    	HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    	
    	
    	for (int i = 0; i < num.length ; i++) {
    		int initial = Character.getNumericValue((Integer.toString(num[i]).charAt(0)));
    		if (map.containsKey(initial)) {
    			map.get(initial).add(num[i]);
    		}
    		else {
    	    	ArrayList<Integer> list = new ArrayList<Integer>();
    	    	list.add(num[i]);
    	    	map.put(initial, list);
    		}
    	} 	
    	
    	for (ArrayList<Integer> list: map.values()) {
    		Collections.sort(list, Collections.reverseOrder());
    	}
    	
    	for (int i = 9; i > 0; i--) {
    		if (map.containsKey(i)) {
	    		ArrayList<Integer> list = map.get(i);
	    		for (int val:list) {
	    			result += Integer.toString(val);
	    		}
    		}
    	}
    	return result;
    }

}
