import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assertions.assertEquals(2.0, solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
        Assertions.assertEquals(2.5, solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
        Assertions.assertEquals(0.0, solution.findMedianSortedArrays(new int[] { 0, 0 }, new int[] { 0, 0 }));
        Assertions.assertEquals(1.0, solution.findMedianSortedArrays(new int[] { }, new int[] { 1 }));
        Assertions.assertEquals(2.0, solution.findMedianSortedArrays(new int[] { 2 }, new int[] { }));
        Assertions.assertEquals(3.0, solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4 }));
        Assertions.assertEquals(4.0, solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4, 5 }, new int[] { 8, 9 }));
        Assertions.assertEquals(1.0, solution.findMedianSortedArrays(new int[] { 1, 1 }, new int[] { 1, 2 }));
    }
}