package practice.week7;

public class maxCutRopes {
	public static void main(String[] argv) {
		maxCutRopes obj = new maxCutRopes();
		System.out.println(obj.cutRopes(8));

	}

	int cutRopes(int n) {
		// sanity check
		if (n < 2) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else if (n == 3) {
			return 2;
		}

		// cut ropes
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int max = 0;
			for (int j = 1; j <= i / 2; j++) {
				dp[i] = Math.max(dp[i],
						Math.max(dp[i - j], i - j) * Math.max(dp[j], j));
			}
		}
		return dp[n];
	}
}