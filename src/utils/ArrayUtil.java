package utils;

public class ArrayUtil {
	public static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < array.length; i++) {
			if (sb.length() == 0) {
				sb.append(array[i]);
			} else {
				sb.append(", " + array[i]);
			} 
				
		}
		return sb.toString();
	}
}