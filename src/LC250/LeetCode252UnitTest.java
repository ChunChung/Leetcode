package LC250;

import LC250.Interval;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode252UnitTest {
    @Test
    public void testCase1() {
        LC250.LeetCode252 tester = new LC250.LeetCode252();
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0,30);
        intervals[1] = new Interval(5,10);
        intervals[2] = new Interval(15,20);
        boolean result = tester.canAttendMeetings(intervals);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testCase2() {
        LC250.LeetCode252 tester = new LC250.LeetCode252();
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(7,10);
        intervals[1] = new Interval(2,4);
        boolean result = tester.canAttendMeetings(intervals);
        Assert.assertEquals(result, true);
    }
}