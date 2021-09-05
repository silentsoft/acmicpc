import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        {
            ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
            ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
            ListNode result = solution.addTwoNumbers(first, second);
            Assertions.assertEquals(7, result.val);
            Assertions.assertEquals(0, result.next.val);
            Assertions.assertEquals(8, result.next.next.val);
        }
        {
            ListNode first = new ListNode(0);
            ListNode second = new ListNode(0);
            ListNode result = solution.addTwoNumbers(first, second);
            Assertions.assertEquals(0, result.val);
        }
        {
            ListNode first = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
            ListNode second = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
            ListNode result = solution.addTwoNumbers(first, second);
            Assertions.assertEquals(8, result.val);
            Assertions.assertEquals(9, result.next.val);
            Assertions.assertEquals(9, result.next.next.val);
            Assertions.assertEquals(9, result.next.next.next.val);
            Assertions.assertEquals(0, result.next.next.next.next.val);
            Assertions.assertEquals(0, result.next.next.next.next.next.val);
            Assertions.assertEquals(0, result.next.next.next.next.next.next.val);
            Assertions.assertEquals(1, result.next.next.next.next.next.next.next.val);
        }
    }
}