package LC70;

class LeetCode076 {
    public String minWindow(String s, String t) {
        if (null == s || null == t)  {
            return "";    
        }
        int[] map = new int[256];
        for (int i=0; i<t.length(); i++) {
            map[t.charAt(i)]++;
        }
        
        int j = 0;
        int count = t.length();
        String answer = "";
        int answerLen = Integer.MAX_VALUE;
        for (int i=0; i<s.length(); i++) {
        	while (count > 0 && j < s.length()) {
        		if (map[s.charAt(j)] > 0) {
        			count --;
        		}     		
        		map[s.charAt(j)] --;
        		j++;
        	}
        	
        	if (count == 0) {
        		if (answerLen > (j - i)) {
        			answer = s.substring(i, j);
        			answerLen = answer.length();
        		}
        	}
        	
        	if (map[s.charAt(i)] == 0) {
        		count++;
        	}
            map[s.charAt(i)]++;
        }
        return answer;
    }
    
    static public void main(String argv[]) {
    	LeetCode076 test = new LeetCode076();
    	String s = "bba";
    	String t = "ab";
    	String x = test.minWindow(s, t);
    	System.out.println(x+ " 123");
    }
}