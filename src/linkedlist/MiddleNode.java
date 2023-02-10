package linkedlist;

import struct.ListNode;

/**
 * Date：2023/2/2
 * Description：https://leetcode.cn/problems/middle-of-the-linked-list/
 * 快慢指针
 *
 * @author xinC
 * @version 1.0
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        return moveDouble(head);
    }

    public ListNode moveDouble(ListNode head) {
        //构建快慢双指针
        ListNode fastNode, slowNode;
        fastNode = slowNode = head;
        while (fastNode != null) {
            if (fastNode.next == null) {
                break;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
