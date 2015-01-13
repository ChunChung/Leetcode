import java.util.Arrays;

public class BestTimeBuySellStockII {
	public static int maxProfit(int[] price) {
		int ret = 0;
		int day = 0;
		int revenue = 0;
		int buyday = -1;
		ret = getMaxProfit(price, day, buyday, revenue);
		return ret;
	}

	public static int getMaxProfit(int[] price, int day, int buyday, int revenue) {
		if (day < price.length - 1) {
			if (buyday == -1) {
				return revenue + getMaxProfit(price, day + 1, day, revenue);
			} else {
				if (getMaxProfit(price, day + 1, buyday, revenue) > (price[day] - price[buyday])) {
					return revenue
							+ getMaxProfit(price, day + 1, buyday, revenue);
				} else {
					return revenue + price[day] - price[buyday]
							+ getMaxProfit(price, day + 1, -1, revenue);
				}
			}
		} else {
			System.out.println("buyday " + Integer.toString(buyday) + ", day "
					+ Integer.toString(day));

			if (buyday == -1) {
				return revenue;
			} else {
				return revenue + price[day] - price[buyday];
			}
		}
	}

	static public void main(String argv[]) {
		int[] price = { 1, 2, 3, 4, 2, 1, 6 };
		System.out.println(maxProfit(price));
	}
}