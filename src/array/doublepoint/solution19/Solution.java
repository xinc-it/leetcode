package array.doublepoint.solution19;

import struct.ListNode;

/**
 * Date：2021/12/29
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode perHead = new ListNode();
        ListNode fast = head;
        ListNode slow = perHead;
        perHead.next = head;
        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return perHead.next;
    }
}
