package practice.special;

public class CountIslands {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}		
		
		int count = 0;
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1' && visited[i][j] == false) {
					count ++;
					merge(grid, i, j, visited);
				}
			}
		}	
		return count;
	}
	
	private void merge(char[][] grid, int i, int j, boolean[][] visited) {
		int m = grid.length;
		int n = grid[0].length;
		
		if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
			return;
		}
		visited[i][j] = true;
		if (grid[i][j] == '0') {
			return;
		}
		
		merge(grid, i-1, j, visited);
		merge(grid, i+1, j, visited);
		merge(grid, i, j-1, visited);
		merge(grid, i, j+1, visited);	
	}
	
	
	public int numIslandsUF(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int count = 0;
		int m = grid.length;
		int n = grid[0].length;
		
		UnionFind uf = new UnionFind(m*n);
		
		return count;
	}
	
	public static void main(String[] args) {
		char[][] grid = {{'1', '1', '1', '1', '0'},
						 {'1', '1', '0', '1', '0'},
						 {'1', '1', '0', '0', '1'},
						 {'0', '0', '1', '1', '1'}};
		
		CountIslands obj = new CountIslands();
		
		System.out.println(obj.numIslands(grid));
	}
}