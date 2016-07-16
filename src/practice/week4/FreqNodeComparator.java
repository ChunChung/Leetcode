package practice.week4;

import java.util.Comparator;

public class FreqNodeComparator implements Comparator<FreqNode> {
	@Override
	public int compare(FreqNode x, FreqNode y) {
		if (x.val >= y.val) {
			return -1;
		}
		if (x.val < y.val) {
			return 1;
		}
		return 0;
	}

}