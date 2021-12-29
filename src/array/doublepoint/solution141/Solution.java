package array.doublepoint.solution141;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
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