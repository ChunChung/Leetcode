public class atoi {
	public static int myAtoi(String str) {
		int result = 0;
		boolean start_convert = false;
		boolean negative = false;
		boolean overflow = false;
		if (str.length() == 0)
			return 0;
		
		for (int i = 0; i < str.length(); i++) {
			int unit = str.charAt(i) - '0';
			
			if (unit < 10 && unit >= 0) {
				if (!start_convert)
					start_convert = true;
				int tmp = result;
				for(int j = 0; j < 9; j++) {
					if (result > 0 && (result + tmp) < 0) {
						overflow = true;
					}
					result = result + tmp;
				}
				
				if (result > 0 && (result + unit) < 0) {
					overflow = true;
				}
				result = result + unit;
				
			} else if (start_convert) {
				break;
			} else if (str.charAt(i) == ' ') {
				continue;
			} else if (str.charAt(i) == '+' || str.charAt(i) == '-') {
				start_convert = true;
				if (str.charAt(i) == '-') {
					negative = true;
				}
			} else {
				break;
			}
		}

		

		if (negative) {
			result = 0 - result;
		}
		
		if(overflow) {
			if(negative)
				return Integer.MIN_VALUE;
			else
				return Integer.MAX_VALUE;
		}

		return result;
	}

	static public void main(String argv[]) {
		System.out.println(myAtoi("    10522545459"));
	}
}
