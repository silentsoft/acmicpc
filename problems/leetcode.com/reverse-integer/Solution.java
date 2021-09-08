class Solution {
    public int reverse(int x) {
        try {
            String abs = Integer.toString(Math.abs(x));
            char[] chars = abs.toCharArray();
            char[] reversed = new char[chars.length];
            for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
                reversed[i] = chars[j];
            }
            return Integer.valueOf((x < 0 ? "-" : "").concat(String.valueOf(reversed)));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}