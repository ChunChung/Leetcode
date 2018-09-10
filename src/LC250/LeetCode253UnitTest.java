package LC250;

import LC250.Interval;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode253UnitTest {
    @Test
    public void testCase1() {
        LC250.LeetCode253 tester = new LC250.LeetCode253();
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0,30);
        intervals[1] = new Interval(5,10);
        intervals[2] = new Interval(15,20);
        int result = tester.minMeetingRooms(intervals);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testCase2() {
        LC250.LeetCode253 tester = new LC250.LeetCode253();
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(7,10);
        intervals[1] = new Interval(2,4);
        int result = tester.minMeetingRooms(intervals);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testCase3() {
        LC250.LeetCode253 tester = new LC250.LeetCode253();
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(1,5);
        intervals[1] = new Interval(8,9);
        intervals[2] = new Interval(8,9);
        int result = tester.minMeetingRooms(intervals);
        Assert.assertEquals(result, 2);
    }


    @Test
    public void testCase4() {
        LC250.LeetCode253 tester = new LC250.LeetCode253();
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(13,15);
        intervals[1] = new Interval(1,13);
        int result = tester.minMeetingRooms(intervals);
        Assert.assertEquals(result, 1);
    }
}