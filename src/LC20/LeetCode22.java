import java.util.ArrayList;
import java.util.List;

/*
[22] Generate Parentheses  

https://leetcode.com/problems/generate-parentheses/description/

* algorithms
* Medium (47.91%)
* Total Accepted:    205K
* Total Submissions: 427.1K
* Testcase Example:  '3'


Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



For example, given n = 3, a solution set is:


[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

*/

class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        if (n <= 0) {
            return results;
        }
        
        helper(results, n, n, "");  
        return results;
    }
    
    private void helper(List<String> results, int left, int right, String result) {
        if (right == 0 && left == 0) {
            results.add(new String(result));
            return;
        }    
        
        if (left > 0) {
            helper(results, left-1, right, result + "(");
        }
        
        if (right > 0 && left < right) {
            helper(results, left, right-1, result + ")");    
        } 
    }
}