package linkedlist;

import struct.ListNode;

/**
 * Date：2023/2/2
 * Description：https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 *快慢指针方法
 * @author xinC
 * @version 1.0
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        return getNthFromEnd(head, n);
    }

    public ListNode getNthFromEnd(ListNode head, int n) {

        //构建双指针
        ListNode fastNode, slowNode, tempNode;
        fastNode = slowNode = head;
        tempNode = new ListNode();
        tempNode.next = head;
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        //当删除节点为头节点时直接返回头节点.next
        if (fastNode == null) return head.next;
        while (fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
            tempNode = tempNode.next;
        }
        //System.out.println(tempNode.val+"========"+slowNode.val);
        //删除第k个节点
        tempNode.next = slowNode.next;
        slowNode.next = null;
        return head;
    }
}
