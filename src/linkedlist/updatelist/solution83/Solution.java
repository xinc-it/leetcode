package linkedlist.updatelist.solution83;

import struct.ListNode;

/**
 * Date：2022/1/4
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) {
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow = slow.next;
                slow.val = fast.val;
            }
            fast = fast.next;
        }
        slow.next=null;
        return  head;
    }


}
