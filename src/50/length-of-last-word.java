public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }    

        int spacePos = -1;
        int len = s.replaceFirst("\\s+$", "").length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                spacePos = i;
            }
        }

        if (spacePos == -1) {
            return len;
        }
        else {
            return len - spacePos - 1;
        }

    }
}
