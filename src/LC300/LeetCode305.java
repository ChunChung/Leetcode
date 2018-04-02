/*
A 2d grid map of m rows and n columns is initially filled with water. We may perform an addLand operation which turns the water at position (row, col) into a land. Given a list of positions to operate, count the number of islands after each addLand operation. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example:

Given m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]].
Initially, the 2d grid grid is filled with water. (Assume 0 represents water and 1 represents land).

0 0 0
0 0 0
0 0 0
Operation #1: addLand(0, 0) turns the water at grid[0][0] into a land.

1 0 0
0 0 0   Number of islands = 1
0 0 0
Operation #2: addLand(0, 1) turns the water at grid[0][1] into a land.

1 1 0
0 0 0   Number of islands = 1
0 0 0
Operation #3: addLand(1, 2) turns the water at grid[1][2] into a land.

1 1 0
0 0 1   Number of islands = 2
0 0 0
Operation #4: addLand(2, 1) turns the water at grid[2][1] into a land.

1 1 0
0 0 1   Number of islands = 3
0 1 0
We return the result as an array: [1, 1, 2, 3]

Challenge:

Can you do it in time complexity O(k log mn), where k is the length of the positions?
*/


package LC300;

import java.util.ArrayList;
import java.util.List;

class LeetCode305 {
    private int[] father;
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> results = new ArrayList();
        father = new int [m*n];
        for (int i = 0; i < father.length; i++) {
            father[i] = -1;
        }
        
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        int count = 0;
        
        for (int i = 0; i < positions.length; i++) {
            int x = positions[i][0];
            int y = positions[i][1];
            count++;
            if (father[x*n+y] == -1) {
            
                getRoot(x*n+y);
                for(int j = 0; j < dx.length; j++) {
                    // x + dx[j]
                    // y + dy[j]
                    if ((x+dx[j]) < m && (x+dx[j]) >= 0 && (y+dy[j]) < n && (y+dy[j]) >= 0) {
                        if (father[(x+dx[j])*n + y+dy[j]] != -1) {
                        	int root = getRoot(x*n+y);
                        	int dRoot = getRoot((x+dx[j])*n + y+dy[j]);
                     
                        	
                            if (root != dRoot ) {
                                count--;                        
                            	union(x*n+y, (x+dx[j])*n + y+dy[j]);
                            }
                        }
                    }
                }
            }
            
            results.add(count);
        }
        return results;
    }
    
    private int getRoot(int x) {
        if (father[x] == x)
            return x;
        
        if (father[x] == -1)
            father[x] = x;
        
        int parent = father[x];
        while(parent != father[parent]) {
        	parent = father[parent];
        }
        
        while(x != father[x]) {
        	int temp = father[x];
        	father[x] = parent;
        	x = temp;
        }
        return parent;
    }
    
    private void union(int a, int b) {
        int rootA = getRoot(a);
        int rootB = getRoot(b);
        
        if (rootA != rootB)
            father[rootA] = rootB;  
    }
    
//    public List<Integer> numIslands2(int m, int n, int[][] positions) {
//        List<Integer> result = new ArrayList<Integer>();
//        int[] union = new int[m*n];    
//        Arrays.fill(union, -1);
//        
//        int[] dx = {1,-1,0,0};
//        int[] dy = {0,0,1,-1};
//        
//        int count = 0;
//        
//        for(int[] row: positions) {
//            int id = row[0] * n + row[1];
//            union[id] = id;
//            count++;
//            for (int i = 0; i<dx.length; i++) {
//                int x = row[0] + dx[i];
//                int y = row[1] + dy[i];
//                int neighborIdx = x * n + y;
//                
//                if(x < 0 || x >= m || y < 0 || y >= n || union[neighborIdx] == -1) continue;
//                
//                int neighborId = getRoot(union, neighborIdx);
//                if (neighborId != id) {
//                    union[neighborId] = id;
//                    count --;
//                }
//            }
//            result.add(count);
//        }
//        return result;
//    }
//    
//    private int getRoot(int[] union, int idx) {
//        while(union[idx] != idx) {
//            union[idx] = union[union[idx]];
//            idx = union[idx];
//        }    
//        return idx;
//    }
    
    public static void main(String[] argv) {
    	int m = 3; 
    	int n = 3;
    	int[][] positions = {{0,1},{1,2},{2,1},{1,0},{0,2},{0,0},{1,1}};
    	
    	
    	LeetCode305 test = new LeetCode305();
    	System.out.println(test.numIslands2(m, n, positions));
    }
}
