package lintcode;

import org.junit.Assert;
import org.junit.Test;

public class kthSmallestInSortedMatrix_401UnitTest {
    @Test
    public void testCase1() {
        lintcode.kthSmallestInSortedMatrix_401 tester = new lintcode.kthSmallestInSortedMatrix_401();
        int [][] input = {
                {1,5,7},
                {3,7,8},
                {4,8,9}
        };
        int result = tester.kthSmallest(input, 4);
        Assert.assertEquals(5, result);

        result = tester.kthSmallest_v2(input, 1);
        Assert.assertEquals(1, result);

//        LC250.LeetCode252 tester = new LC250.LeetCode252();
//        Interval[] intervals = new Interval[3];
//        intervals[0] = new Interval(0,30);
//        intervals[1] = new Interval(5,10);
//        intervals[2] = new Interval(15,20);
//        boolean result = tester.canAttendMeetings(intervals);
//        Assert.assertEquals(result, false);
    }
}