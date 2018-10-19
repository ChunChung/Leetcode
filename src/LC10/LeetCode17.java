package LC10;

import java.util.ArrayList;
import java.util.List;

/*
[17] Letter Combinations of a Phone Number  

https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

* algorithms
* Medium (36.40%)
* Total Accepted:    228.5K
* Total Submissions: 627.1K
* Testcase Example:  '""'

Given a digit string, return all possible letter combinations that the number could represent.



A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].



Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.

*/


class LeetCode17 {
    private char[][] letters = {{},{},{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    
    public List<String> letterCombinations(String digits) {  
        List<String> results = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return results;    
        }
        helper(digits, 0, results, new StringBuilder());
        
        return results;
    }
    
    private void helper(String digits, int index, List<String> results, StringBuilder result) {
        if (index == digits.length()) {
            results.add(new String(result.toString()));
            return;
        }    
        
        if (index > digits.length()) 
            return;
        
        int number = digits.charAt(index) - '0';
        
        for (int i = 0; i < letters[number].length; i++) {
            result.append(letters[number][i]);
            
            helper(digits, index+1, results, result);
            
            result.deleteCharAt(result.length() - 1);
        }
        
    }
}