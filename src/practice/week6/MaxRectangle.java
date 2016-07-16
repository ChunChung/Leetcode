package practice.week6;

import java.util.LinkedList;

public class MaxRectangle {
	public class Element {
		public int left;
		public int index;

		Element(int left, int index) {
			this.left = left;
			this.index = index;
		}
	}

	public int largestRectangleArea(int[] heights) {
		if (heights == null || heights.length == 0) {
			return 0;
		}

		LinkedList<Element> stack = new LinkedList();
		int area = 0;
		for (int i = 0, end = heights.length; i < end; i++) {
			int left = i;
			while (!stack.isEmpty() && heights[stack.peek().index] > heights[i]) {
				Element ele = stack.pop();
				System.out.println(Integer.toString(ele.index) + ", " + Integer.toString(ele.left));
				for (int j = i; j >= ele.index; j--) {
				//	System.out.println(Integer.toString(j) + ", "
				//			+ Integer.toString(ele.index));
					area = Math.max((i - ele.left) * heights[ele.index], area);
					
				}
				if (heights[ele.index] > heights[i]) {
					left = ele.left;
				} else {
					left = ele.index;
				}
			}
			stack.push(new Element(left, i));
			// push new element
		}
		// calculate area
		while (!stack.isEmpty()) {
			Element ele = stack.pop();
			System.out.println(Integer.toString(ele.index) + ", " + Integer.toString(ele.left));
			for (int j = heights.length - 1; j >= ele.index; j--) {
				//System.out.println(Integer.toString(j) + ", "
				//		+ Integer.toString(ele.index));
				area = Math.max((heights.length - ele.left) * heights[ele.index], area);
			}
		}
		return area;
	}

	public static void main(String[] argv) {
		int[] input = { 2, 1, 5, 6, 2, 3 };

		MaxRectangle obj = new MaxRectangle();

		System.out.println(obj.largestRectangleArea(input));
	}
}