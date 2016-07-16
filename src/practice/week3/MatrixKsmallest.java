package practice.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MatrixKsmallest {
	
	class MyComparator<Pair> implements Comparator<Pair> {

		
		int[][] matrix;

		MyComparator(int[][] matrix) {
			this.matrix = matrix;
		}

		public int compare(Pair arg0, Pair arg1) {
	        if(matrix[arg0.i][arg0.j] < matrix[arg1.i][arg1.j]){
	            return -1;
	        }
	        if(matrix[arg0.i][arg0.j] > matrix[arg1.i][arg1.j]){
	            return 1;
	        }
	        return 0;			
	        // blabla
		}

		private MatrixKsmallest getOuterType() {
			return MatrixKsmallest.this;
		}
	}

	public int solve(int[][] matrix) {
		Queue<Pair> heap = new PriorityQueue(size, new MyComparator<Pair>(matrix));
		// blabla

	}
	
	public static void main(String[] argv) {

	}
}