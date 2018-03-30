package utils;


public class UnionFind{
	int[] father;
	int count;
	public int find(int x) {
		if (father[x] == x) {
			return x;
		}
		// compress father
		return father[x] = find(father[x]);
	}
	
	public UnionFind (int n) {
		father = new int[n];
		for (int i = 0; i < n; i++) {
			father[i] = i;
		}
		
	}
	
	public void union(int a, int b) {
		int root_a = find(a);
		int root_b = find(b);
		
		if (root_a != root_b) {
			father[root_a] = root_b;
			count--;
		}
	}
	
	public int query() {
		return count;
	}
	
	public void set_count(int total) {
		count = total;
	}
}