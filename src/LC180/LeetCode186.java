package LC180;

class LeetCode186 {
    public void reverseWords(char[] str) {
        if (null == str || str.length == 0)
            return;

        reverseArrayHelper(str, 0, str.length-1);
        int start = 0;
        for (int i = 0; i < str.length; i ++) {
            if (str[i] == ' ') {
                reverseArrayHelper(str, start, i - 1);
                start = i + 1;
            }
        }
        reverseArrayHelper(str, start, str.length - 1);

    }

    private void reverseArrayHelper(char[] str, int start, int end) {
        while(start < end) {
            char temp = str[start];
            str[start++] = str[end];
            str[end--] = temp;
        }
    }
}