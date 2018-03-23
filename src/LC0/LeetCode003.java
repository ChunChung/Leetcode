package LC0;
import java.util.HashSet;

class LeetCode003 {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }        
        int ans = Integer.MIN_VALUE;
        int j = 0;
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                ans = Math.max(ans, j-i+1);
                j++;
            }
            set.remove(s.charAt(i));
        }
        return ans;
    }
    
    static public void main(String argv[]) {
    	LeetCode003 test = new LeetCode003();
    	int x = test.lengthOfLongestSubstring("abcabcbb");
    	System.out.println(x);
    }
}