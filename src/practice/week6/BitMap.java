package practice.week6;

public class BitMap {
	boolean solution(char[] n) {
		int[] bitArray = new int[8];
		for (int i = 0; i < n.length; i++) {
			if ((bitArray[n[i] / 32] & (1 << (n[i] % 32))) != 0) {
				return false;
			} else {
				bitArray[n[i] / 32] |= (1 << n[i] % 32);
			}
		}
		return true;
	}

	public static void main(String[] argv) {
		char[] str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		BitMap obj = new BitMap();
		System.out.println(obj.solution(str));
		
	}
}