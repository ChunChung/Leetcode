package LC340;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode340UnitTest {
    @Test
    public void testCase1() {
        LC340.LeetCode340 tester = new LC340.LeetCode340();

        int result = tester.lengthOfLongestSubstringKDistinct("abaccc", 2);
        Assert.assertEquals(4, result);


    }
}
