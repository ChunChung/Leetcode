package LC80.UnitTest;

import org.junit.Assert;
import org.junit.Test;
import LC80.LeetCode84;

public class LeetCode84UnitTest {
    @Test
    public void testcase1() {
        LeetCode84 tester = new LeetCode84();
        int result = tester.largestRectangleArea(new int[]{2,1,5,6,2,3});
        Assert.assertEquals(10, result);
    }

    @Test
    public void testcase2() {
        LeetCode84 tester = new LeetCode84();
        int result = tester.largestRectangleArea(new int[]{2,1,1,2,1,2});
        Assert.assertEquals(6, result);
    }
}
