/*

[200] Number of Islands  	

https://leetcode.com/problems/number-of-islands

* algorithms
* Medium (34.25%)
* Total Accepted:    
* Total Submissions: 

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:
11110110101100000000
Answer: 1
Example 2:
11000110000010000011
Answer: 3

Credits:Special thanks to @mithmatt for adding this problem and creating all test cases.

*/

package LC200;

public class LeetCode200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
                      
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    mergeIslands(grid, i, j);
                    
                }
            }
        }
        return count;
    }
    
    private void mergeIslands(char[][] grid, int i, int j) {
                
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length)
            return;     
        
        if(grid[i][j] != '1') 
            return;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        if(grid[i][j] == '1')
            grid[i][j] = 'X';
        
        for(int m = 0; m < dx.length; m++) {
            mergeIslands(grid, i+dx[m], j+dy[m]);
        }
    }
    
//    Method 2 UnionFind
//    class UnionFind {
//        int[] father = null;
//        int count;
//        
//        public UnionFind(int n) {
//            father = new int[n];
//            for (int i = 0; i < n ; i++) {
//                father[i] = i;
//            }
//        }
//        
//        public int find(int x) {
//            if (father[x] == x)
//                return x;
//                
//            return father[x] = find(father[x]);
//        }
//        
//        public void union(int a, int b) {
//            int root_a = find(a);
//            int root_b = find(b);
//            
//            if (root_a != root_b) {
//                father[root_a] = root_b; 
//                count --;
//            }
//        }
//        
//        public void setCount(int x) {
//            count = x;
//        }
//        
//        public int queryCount() {
//            return count;
//        }
//     }
//    
//    public int numIslands(char[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0) 
//            return 0;
//        
//        int n = grid.length;
//        int m = grid[0].length;
//        UnionFind unionfind = new UnionFind(n * m);
//        int total = 0;
//        
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if (grid[i][j] == '1') {
//                    total++;    
//                }
//            } 
//        }
//        
//        unionfind.setCount(total); 
//        
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if(grid[i][j] == '1') {
//                    if (i > 0 && grid[i-1][j] == '1') {
//                        unionfind.union(i * m + j, (i-1) * m + j);
//                    } 
//                    if (i < n - 1 && grid[i+1][j] == '1') {
//                        unionfind.union(i * m + j, (i+1) * m + j);
//                    }
//                    if (j > 0 && grid[i][j-1] == '1') {
//                        unionfind.union(i * m + j - 1, i * m + j);
//                    }
//                    if (j < m - 1 && grid[i][j+1] == '1') {
//                        unionfind.union(i * m + j, i * m + j + 1);
//                    }
//                }
//            }
//        }
//        
//        return unionfind.queryCount();
//    }
}