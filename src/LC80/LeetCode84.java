package LC80;

import java.util.Stack;

public class LeetCode84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int largestRectArea = Integer.MIN_VALUE;
        stack.push(0);
        for (int index = 0; index < heights.length; index++)
        while (stack.size() != 0) {
            while (!stack.empty() && heights[stack.peek()] > heights[index]) {
                int popIndex = stack.pop();
                largestRectArea = Math.max(largestRectArea, (index - popIndex) * heights[popIndex]);

                int start = stack.isEmpty() ? -1 : stack.peek();
                largestRectArea = Math.max(largestRectArea, heights[popIndex] * (index - start - 1));
            }
            stack.push(index);
        }
        return largestRectArea;
    }

//    Stack<Integer> st = new Stack<>();
//    int res = 0;
//        for(int i = 0; i <= height.length; i++) {
//        int h = i == height.length ? 0 : height[i];
//        while(!st.isEmpty() && h < height[st.peek()]) {
//            int index = st.pop();
//            int start = st.isEmpty() ? -1 : st.peek();
//            res = Math.max(res, height[index] * (i - start - 1));
//        }
//        st.push(i);
//    }
//        return res;
}
/**
[84] Largest Rectangle in Histogram  

https://leetcode.com/problems/largest-rectangle-in-histogram/description/

* algorithms
* Hard (28.19%)
* Total Accepted:    139.4K
* Total Submissions: 481K
* Testcase Example:  '[2,1,5,6,2,3]'

Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.

 


Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].

 


The largest rectangle is shown in the shaded area, which has area = 10 unit.

 

Example:


Input: [2,1,5,6,2,3]
Output: 10
*/

