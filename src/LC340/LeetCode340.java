/**
 Given a string, find the length of the longest substring T that contains at most k distinct characters.

 Example 1:

 Input: s = "eceba", k = 2
 Output: 3
 Explanation: T is "ece" which its length is 3.
 Example 2:

 Input: s = "aa", k = 1
 Output: 2
 Explanation: T is "aa" which its length is 2.
 */
package LC340;

import java.util.HashSet;

class LeetCode340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        int ans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            set.add(s.charAt(j));
            while (set.size() > k) {
                if (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(i));
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
