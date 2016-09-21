import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Leetcode304 {
		int[][] table;
		int[][] matrix;

		public void solution(int[][] matrix) {
			if (matrix != null && matrix.length > 0) {
				table = new int[matrix.length + 1][matrix[0].length + 1];
				this.matrix = matrix;
			}
		}

		public int sumRegion(int row1, int col1, int row2, int col2) {
			return get(row2, col2) + get(row1 - 1, col1 - 1)
					- get(row1 - 1, col2) - get(row2, col1 - 1);
		}

		public int get(int row, int col) {
			if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
				return 0;
			if (row < 0 || col < 0)
				return 0;
			if (table[row][col] > 0)
				return table[row][col];

			int answer = 0;
			
			int row_answer = 0;
			int col_answer = 0;
			
			//for(int i=0;i<=col;i++) row_answer += matrix[row][i];
			//for(int j=0;j<=row;j++) col_answer += matrix[j][col];
	        answer = get(row-1, col-1) - matrix[row][col] + sumRegion(0,0,0,col) + sumRegion(0,0,row,0);

			table[row][col] = answer;
			return answer;
		}


	static public void main(String argv[]) {
		int[][] matrix = { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 },
				{ 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 }, { 1, 0, 3, 0, 5 } };

		//int [][] matrix = {};
		Leetcode304 a = new Leetcode304();
		a.solution(matrix);
		System.out.println(a.sumRegion(1, 1, 2, 2));
	}
}
