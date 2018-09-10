import static org.junit.Assert.*;

import LC30.LeetCode33;
import org.junit.Test;

public class LeetCode33UnitTest {
    @Test
    public void testCase1() {
        int[] nums = {4,5,6,7,0,1,2};
        LC30.LeetCode33 tester = new LeetCode33();
        assertEquals(4, tester.searchInRotedSortedArray(nums, 0));
    }


    @Test
    public void testCase2() {
        int[] nums = {6,7,0,1,2,4,5};
        LC30.LeetCode33 tester = new LeetCode33();
        assertEquals(2, tester.searchInRotedSortedArray(nums, 0));
    }

    @Test
    public void testCase3() {
        int[] nums = {5,1,3};
        LC30.LeetCode33 tester = new LeetCode33();
        assertEquals(-1, tester.searchInRotedSortedArray(nums, 0));
    }


    @Test
    public void testCase4() {
        int[] nums = {5,1,3};
        LC30.LeetCode33 tester = new LeetCode33();
        assertEquals(0, tester.searchInRotedSortedArray(nums, 5));
    }


    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4
}