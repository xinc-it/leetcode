package array.doublepoint.solution876;

import struct.ListNode;

/**
 * Date：2021/12/29
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
