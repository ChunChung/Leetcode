package LC160;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode162UnitTest {
    @Test
    public void testCase1() {
        LC160.LeetCode162 tester = new LC160.LeetCode162();
        int []input = {1,2,3,1};
        int result = tester.findPeakElementMethod2(input);
        Assert.assertEquals(result, 2);
    }

}