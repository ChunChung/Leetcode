import java.util.Arrays;

public class productArrayExceptSelf {
    static public int[] productExceptSelf(int[] nums) {
        int [] array1 = new int[nums.length];
        int [] array2 = new int[nums.length];
        
        array1[0] = 1;
        for(int i=1;i<nums.length;i++) {
            array1[i] = array1[i-1] * nums[i-1];
        }
    
        array2[nums.length-1] = 1;
        for(int j=nums.length-2;j>-1;j--) {
            array2[j] = nums[j+1] * array2[j+1];
        }
        
        for(int k=0; k<nums.length;k++) {
            nums[k] = array1[k] * array2[k];
        }
        

        return nums;
    }

	static public void main(String argv[]) {
		int[] price = { 1, 2, 3, 4};
		System.out.println(Arrays.toString(productExceptSelf(price)));
	}
}