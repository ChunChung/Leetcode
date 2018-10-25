package LC80;

class LeetCode85 {
    public int maximalRectangle(char[][] matrix) {
        for (int i=0; i<matrix.length - 1; i++) {
            for (int j=i+1; j<matrix.length; j++) {
                continue;
            }
        }
        return 0;
    }
}
/**
[85] Maximal Rectangle  

https://leetcode.com/problems/maximal-rectangle/description/

* algorithms
* Hard (30.32%)
* Total Accepted:    99.7K
* Total Submissions: 320.9K
* Testcase Example:  '[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]'

Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

Example:


Input:
[
  ["1","0","1","0","0"],
  ["1","0","1","1","1"],
  ["1","1","1","1","1"],
  ["1","0","0","1","0"]
]
Output: 6
*/

