import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int ptr=0;
        
        for(;ptr<nums.length;ptr++) {
            if(nums[ptr]==0) {
            	int tempPtr = ptr;
                while(tempPtr<nums.length-1 && nums[tempPtr]==0){
                    tempPtr = tempPtr + 1;
                }
                nums[ptr] = nums[tempPtr];
                nums[tempPtr] = 0;
            }
        }
    }
    

    
    public static void main(String argv[]) {
    	int[] input = {};
    	moveZeroes(input);
    }
}