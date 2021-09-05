import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length < 2) {
            return length;
        }

        int longest = 1;
        Set<String> set = new HashSet<>();
        set.add(String.valueOf(s.charAt(0)));
        for (int i=1; i<length; i++) {
            String currentValue = String.valueOf(s.charAt(i));
            int previousSize = set.size();
            set.add(currentValue);
            longest = Math.max(longest, set.size());
            if (set.size() == previousSize) {
                set.clear();
                set.add(currentValue);
                for (int j=i-1; j>=0; j--) {
                    previousSize = set.size();
                    set.add(String.valueOf(s.charAt(j)));
                    if (set.size() == previousSize) {
                        break;
                    }
                }
            }
        }

        return longest;
    }
}