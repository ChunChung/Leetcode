package LC150;

import java.util.HashSet;

class LeetCode159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (null == s || s.length() == 0)
        	return 0;
        
        int answer = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
        	int j = i;
        	while (j < s.length()) {
        		Character ch = s.charAt(j);
        		
        		if (!set.contains(ch)) {
        			if (set.size() < 2)
        				set.add(ch);
        			else 
        				break;
        		}
   		
        		answer = Math.max(answer, j-i+1);      		
        		j++;
        	}
        	
        	Character removeCh = s.charAt(i);
        	while (i + 1< s.length()) {
        		if (s.charAt(i) != s.charAt(i+1)) {
                	set.remove(removeCh);
                	break;
        		}
        		i++;
        	}
        }
        
    	return answer;
    }
    
    static public void main(String argv[]) {
    	LeetCode159 test = new LeetCode159();
    	String s = "bacc";    	
    	System.out.println(test.lengthOfLongestSubstringTwoDistinct(s));
    }
}