package practice.week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class PhoneChars {
	void solution(String input) {
		if (input == null || input.length() == 0) {
			return;
		}
		HashMap<Character, String> hashmap = new HashMap();
		hashmap.put('1', "abc");
		hashmap.put('2', "def");
		hashmap.put('3', "ghi");
		List<String> result = new ArrayList();
		helper(input, hashmap, 0, result, new StringBuilder());
	}

	void helper(String input, HashMap<Character, String> hashmap,
			int index, List<String> result, StringBuilder s) {
		if (index == input.length()) {
			result.add(s.toString());
			System.out.println(s);
			return;
		}
		// Consider corner case
		String chars = hashmap.get(input.charAt(index));
		for (char c : chars.toCharArray()) {
			s.append(c);
			helper(input, hashmap, index + 1, result, s);
			s.deleteCharAt(s.length() - 1);
		}
		return;
	}

	public static void main(String[] argv) {
		PhoneChars obj = new PhoneChars();
		obj.solution("121");
	}
}