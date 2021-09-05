import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring("a"));
        Assertions.assertEquals(0, solution.lengthOfLongestSubstring(""));
        Assertions.assertEquals(2, solution.lengthOfLongestSubstring("au"));
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        Assertions.assertEquals(7, solution.lengthOfLongestSubstring("abcdefgb"));
        Assertions.assertEquals(7, solution.lengthOfLongestSubstring("abcadefg"));
        Assertions.assertEquals(7, solution.lengthOfLongestSubstring("abacdefg"));
    }
}