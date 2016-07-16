package practice.week4;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public void solve(int n) {
		List<String> ans = new ArrayList();
		helper(ans, 0, 0, n, new StringBuilder());
		for(String s:ans) {
			System.out.println(s);
		}
	}

	private void helper(List<String> res, int left, int right, int n,
			StringBuilder temp) {
		if (temp.length() == 2 * n) {
			res.add(temp.toString());
			return;
		}
		if (left < n) {
			temp.append('(');
			helper(res, left + 1, right, n, temp);
			temp.deleteCharAt(temp.length() - 1);
		}
		if (left > right) {
			temp.append(')');
			helper(res, left, right + 1, n, temp);
			temp.deleteCharAt(temp.length() - 1);
		}
	}

	public static void main(String[] argv) {
		Permutations obj = new Permutations();
		obj.solve(5);
	}
}