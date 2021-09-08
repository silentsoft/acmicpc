class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = s.substring(0, 1);
        int length = s.length();
        if (length >= 2) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < length; i++) {
                if (longestPalindrome.length() >= length-i) {
                    break;
                }
                for (int j = i+1; j <= length-1; j++) {
                    if (chars[i] == chars[j]) {
                        String substring = s.substring(i, j+1);
                        if (isLongest(longestPalindrome, substring) && isPalindrome(substring.toCharArray())) {
                            longestPalindrome = substring;

                            if (longestPalindrome.length() >= length-i) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(char[] chars) {
        int length = chars.length;
        if (length == 1) {
            return true;
        }

        int mid = length / 2;
        for (int i = (length % 2 == 0) ? mid - 1 : mid, j = mid; i >= 0; i--, j++) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }

        return true;
    }

    private boolean isLongest(String source, String target) {
        return source.length() < target.length();
    }
}