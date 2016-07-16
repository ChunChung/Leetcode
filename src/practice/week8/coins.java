package practice.week8;

public class coins{
	public static void main(String[] argv) {
		coins obj = new coins();
		System.out.println(obj.solution(99));
	}
	
	public int solution(int nums) {
		int[] coins = {1,2,5,10,25};
		int[][] dp = new int [coins.length][nums+1];
		
		// dp[i][k] = dp[i - 1][k] + dp[i][k-coins[i]]
		
		for (int i = 0; i < coins.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int k = 1; k <= nums; k ++) {
			dp[0][k] = 1;
		}
		
		for (int i = 1; i < coins.length; i++) {
			for (int k = coins[i]; k <= nums; k++) {
				dp[i][k] = dp[i - 1][k] + dp[i][k-coins[i]];
			}
		}
		
		return dp[coins.length - 1][nums];
	}
}