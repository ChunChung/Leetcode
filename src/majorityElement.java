
public class majorityElement {
    static public int majorityElement(int[] nums) {
        int n = nums.length;
        boolean [] exists = new boolean[n];
        int [] entries = new int[n];
        int [] count = new int[n];
        int majority = 0;
        for(int num: nums) {
            int hash = Math.abs(num % n);
            //System.out.println(Math.abs(hash));
            int index = hash + 0;
            int maxCount = 0;
            while(exists[index] && entries[index] != num) {
                index = (index + 1) % n;
            }
        
            if(exists[index]) {
                count[index] = count[index] + 1;
                if(count[index] > maxCount) {
                    maxCount = count[index];
                    majority = num;
                }
            }
            else{
                exists[index] = true;
                entries[index] = num;
                count[index] = 1;
            }
        }
        return majority;
    }

	static public void main(String argv[]) {
		int[] price = {-2147483648,0,0};
		System.out.println(majorityElement(price));
	}
}