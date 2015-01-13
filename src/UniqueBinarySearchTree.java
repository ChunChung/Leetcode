public class UniqueBinarySearchTree {

	public static int numTrees(int n) {
		int result = 0;
		if (n >= 0) {
			if (n == 1) {
				return 1;
			}
			else if(n==2) {
				return 2;
			}
			else if(n==0) {
				return 1;
			}
			else{	
				for(int j=0;j < n;j++){
					result = result + numTrees(j) * numTrees(n-1-j);
				}
			}
		}

		return result;
	}

	static public void main(String argv[]) {
		System.out.println(numTrees(4));
	}
}