package practice.week6;

import java.util.LinkedList;

public class CopyOfMaxRectangle {
	public int largestRectangleArea(int[] heights) {
		if (heights == null || heights.length == 0) {
			return 0;
		}

		LinkedList<Integer> stack = new LinkedList();
		int area = 0;
		for (int i = 0, end = heights.length; i < end; i++) {
            Integer left;
			while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
				int ele = stack.pop();
				//System.out.println(Integer.toString(ele.index) + ", " + Integer.toString(ele.left));
				//	System.out.println(Integer.toString(j) + ", "
				//			+ Integer.toString(ele.index));
				left = stack.peek();
				if (left == null) {
					left = 0;
				}
				area = Math.max((i - left - 1) * heights[ele], area);
					
			}
			stack.push(i);
			// push new element
		}
		// calculate area
		while (!stack.isEmpty()) {
			int ele = stack.pop();
			//System.out.println(Integer.toString(ele.index) + ", " + Integer.toString(ele.left));
			Integer left = stack.peek();
			if (left == null) {
				left = 0;
			}
			area = Math.max((heights.length - left - 1) * heights[ele], area);
		}
		return area;
	}

	public static void main(String[] argv) {
		int[] input = { 2, 1, 5, 6, 2, 3 };

		CopyOfMaxRectangle obj = new CopyOfMaxRectangle();

		System.out.println(obj.largestRectangleArea(input));
	}
}