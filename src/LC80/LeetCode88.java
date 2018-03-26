package LC80;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergedIndex = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0) {
            if(nums2[n] > nums1[m]) {
                nums1[mergedIndex] = nums2[n];
                n--;
            } else {
                nums1[mergedIndex] = nums1[m];
                m--;
            }
            mergedIndex--;
        }
        
        while (n>=0) {
            nums1[mergedIndex] = nums2[n];
            n--;
            mergedIndex--;
        }
    }
}