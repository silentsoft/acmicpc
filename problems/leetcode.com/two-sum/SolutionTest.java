import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        Assertions.assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 3, 2, 4 }, 6));
        Assertions.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
        Assertions.assertArrayEquals(new int[] { 0, 2 }, solution.twoSum(new int[] { 3, 2, 3 }, 6));
        Assertions.assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 2, 5, 5, 11 }, 10));
    }
}