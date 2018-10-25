package practice2018.Sorting.UnitTest;

import org.junit.Assert;
import org.junit.Test;
import practice2018.Sorting.QuickSort;

public class QuickSortUnitTest {
    @Test
    public void testcase1() {
        QuickSort tester = new QuickSort();
        int[] result = tester.sort(new int[]{1, 9, 8, 5, 3});
        Assert.assertArrayEquals(new int[]{1,3,5,8,9}, result);


    }
}
