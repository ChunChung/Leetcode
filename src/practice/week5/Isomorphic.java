package practice.week5;

import java.util.HashMap;

public class Isomorphic {
	boolean solution(String data, char[] pairArray) {
		return helper(data, pairArray, 0, new HashMap<Character, String>(), 0);
	}

	int pairIndex = 0;

	boolean helper(String data, char[] pairArray, int depth,
			HashMap<Character, String> A, int index) {
		if (depth == pairArray.length) {
			return true;
		}
		for (int i = index + 1; i < data.length(); i++) {
			String temp = data.substring(index, i);
			if (A.containsKey(pairArray[pairIndex])
					&& !A.get(pairArray[pairIndex]).equals(temp)) {
				return false;
			} else {
				A.put(pairArray[pairIndex++], temp);
			}
			if (helper(data, pairArray, depth + 1, A, i)) {
				return true;
			}
			A.remove(pairArray[pairIndex--]);
		}
		return false;
	}

	public static void main(String[] argv) {
		String s = "appblebleap";
		char[] keys = { 'a', 'b', 'b', 'a' };
		Isomorphic obj = new Isomorphic();
		System.out.println(obj.isIsomorphic(s, keys));
	}

	private char[] isIsomorphic(String s, char[] keys) {
		// TODO Auto-generated method stub
		return null;
	}
}