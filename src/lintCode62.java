public class lintCode62 {
    public static int search(int[] A, int target) {
        // write your code here
        
        int low = 0;
        int high = A.length - 1;
        
        if(high<0) return -1; 
        
        //{1002,10203,9,10,100,101}, 9
        while(low<high) {
            int mid = (low + high)/2;
            if(A[mid] == target) return mid;

            
            System.out.println(Integer.toString(low) + "," + Integer.toString(high));
            if(A[mid] > A[low]) {
                if(A[mid] > target) {
                	high = mid - 1;
                }
                else {
                    low = mid +1;
                }
            }
            else {
                if(A[mid] > target) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
        }
        System.out.println(Integer.toString(low) + "," + Integer.toString(high));


        if(A[low] == target ) return low;
        else if ( low > 0 && A[low-1] == target) return low -1;
        else if(low+1 < A.length && A[low+1] == target) return low + 1;
        
        
        
        return -1;
    }
    
    static public void main(String argv[]) {
        String Str = new String("  A   A");

        System.out.println("Return Value :" );
        for (String retval: Str.split("\\s+")){
           System.out.println(retval);
        }
    }
}