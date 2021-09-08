import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.silentsoft.stopwatch.Stopwatch;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assertions.assertEquals(321, solution.reverse(123));
        Assertions.assertEquals(-321, solution.reverse(-123));
        Assertions.assertEquals(21, solution.reverse(120));
        Assertions.assertEquals(0, solution.reverse(0));
        Assertions.assertEquals(987, solution.reverse(7890));
        Assertions.assertEquals(4321, solution.reverse(1234000000));
        Assertions.assertEquals(2000004321, solution.reverse(1234000002));
        Assertions.assertEquals(-2000004321, solution.reverse(-1234000002));
        Assertions.assertEquals(0, solution.reverse(1234000003));
    }

    @Test
    public void speedTest() {
        Solution solution = new Solution();
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start("speed test", () -> {
            solution.reverse(-1234000002);
        });
        stopwatch.print();
    }
}