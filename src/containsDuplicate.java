
public class containsDuplicate {
    static public boolean containsDuplicate(int[] nums) {
    	java.util.Hashtable<Integer, Integer> duplicate = new java.util.Hashtable<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
            
            if(duplicate.containsKey(nums[i])) return true;
            
            duplicate.put(nums[i], 1);
        }   
        
        return false;
    }

	static public void main(String argv[]) {
		int[] price = { 1, 2, 3, 4,5,4};
		System.out.println(containsDuplicate(price));
	}
}