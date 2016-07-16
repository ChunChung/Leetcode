package practice.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PalindromeString{
	
	public void solution(String input) {
		if (input == null || input.length() == 0) {
			return;
		} 
		HashMap<Character, Integer> hashmap = new HashMap();
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (hashmap.containsKey(temp)) {
				hashmap.put(temp, hashmap.get(temp) + 1);
			} else {
				hashmap.put(temp, 1);
			}
		}
		StringBuilder half = new StringBuilder();
		Character single=null;
		for (Character key: hashmap.keySet()) {
			int num = hashmap.get(key);
			if (num % 2 == 1) {
				single = key;
			}
			for (int i = 0; i < num / 2; i ++) {
				half.append(key);
			}
			
		}
		List<String> result = new ArrayList();
		helper(half, 0, result, new StringBuilder());
		for(String s: result) {
			StringBuilder revS = new StringBuilder(s);
			System.out.println(s+single.toString()+revS.reverse().toString());
		}
	}
	
	void helper(StringBuilder half, int index, List<String> result, StringBuilder permutate) {
		if (index == half.length()) {
			result.add(permutate.toString());
			return;
		}
		HashSet<Character> visited = new HashSet();
		for (int i = index; i < half.length(); i++) {
			if (!visited.contains(half.charAt(i))) {
				permutate.append(half.charAt(i));
				swap(half, i, index);
				helper(half, index + 1, result, permutate);
				permutate.deleteCharAt(permutate.length() - 1);
				swap(half, i, index);	
			}
		}
	}
	void swap(StringBuilder half, int i, int j) {
		char temp = half.charAt(i);
		half.setCharAt(i, half.charAt(j));
		half.setCharAt(j, temp);
	}
	
	
	public static void main(String[] argv) {
		String input = "ABCBBBCCC";
		PalindromeString obj = new PalindromeString();
		obj.solution(input);
		return;
	}
}