/*
 Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

For example:

Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.

Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.

Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.

 * */

package LC260;

public class LeetCode261 {
    int[] union = null;
    public boolean validTree(int n, int[][] edges) {
        if (n == 1) 
            return true;
        if (edges.length == 0 || edges.length < n-1)
            return false;
        
        union = new int[n];
        for (int i=0; i<n; i++) {
            union[i] = i;
        }
        
        for (int[] edge: edges) {
            if (find(edge[0]) == find(edge[1]))
                return false;     
            union(edge[0], edge[1]);
        }
        
        int treeRoot = find(edges[0][0]);
        for (int[] edge: edges) {
            int nodeRoot = find(edge[0]);
            if (nodeRoot != treeRoot) 
                return false;
        }

        
        return true;
    }

    
    private int find(int idx) {
        while(union[idx] != idx) {
            union[idx] = union[union[idx]];
            idx = union[idx];
        }
        return idx;
    }
    
    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        
        if (rootA != rootB) {
            union[rootA] = rootB;    
        }
    }
	
	
}