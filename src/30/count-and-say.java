public class Solution {
    public String countAndSay(int n) {
        if (n <= 0) {
            return null;
        }

        return helper(n);
    }


    private String helper(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuilder temp = new StringBuilder().append(helper(n-1));
        StringBuilder result = new StringBuilder();

        int count = 1;
        int say = temp.charAt(0) - '0';

        int index = 1;
        int length = temp.length();
        while (index < length) {
            if (temp.charAt(index) - '0' != say) {
                result.append(Integer.toString(count)).append(Integer.toString(say));
                count = 1;
                say = temp.charAt(index) - '0';
            }
            else {
                count++;
            }
            index++;
        }
        result.append(Integer.toString(count)).append(Integer.toString(say));

        return result.toString();
    }
}

