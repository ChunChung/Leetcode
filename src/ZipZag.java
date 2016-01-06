public class ZipZag {
	public static String convert(String s, int numRows) {
		if(numRows == 1) return s;
		int gap = numRows + numRows - 2;
		String result = "";
		for (int i = 1; i <= numRows; i++) {
			int count = i;
			while (count <= s.length()) {
				result = result + s.charAt(count - 1);
				if(i!=1 && i != numRows) {
					if((count + 2 * (numRows - i)) <= s.length()) {
						result = result + s.charAt(count + 2 * (numRows - i) -1);
					}
				}
				count = count + gap;
			}
		}
		return result;
	}

	static public void main(String argv[]) {
		System.out.println(convert("ABCDE", 4));
	}
}