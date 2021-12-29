package array.doublepoint.solution142;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            slow = slow.next;
            if (fast == slow) break;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}