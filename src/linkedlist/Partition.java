package linkedlist;

import struct.ListNode;

/**
 * Date：2023/2/13
 * Description：分割链表 https://leetcode.cn/problems/partition-list/
 * 难点：双指针、虚拟头节点
 *
 * @author xinC
 * @version 1.0
 */
public class Partition {

    public ListNode partition(ListNode head, int x) {
        ListNode tempHead1 = new ListNode();
        ListNode tempHead2 = new ListNode();
        ListNode tempNode1, tempNode2;
        tempNode1 = tempHead1;
        tempNode2 = tempHead2;
        while (head != null) {
            if (head.val < x) {
                //System.out.println(111);
                tempNode1.next = head;
                head = head.next;
                tempNode1 = tempNode1.next;
                tempNode1.next = null;
            } else {
                tempNode2.next = head;
                head = head.next;
                tempNode2 = tempNode2.next;
                tempNode2.next = null;
            }
        }
        //System.out.println(tempHead1.next.val);
        //System.out.println(tempHead2.next);
        return mergeTwoLists(tempHead1.next, tempHead2.next);
    }


    public ListNode mergeTwoLists(ListNode smallList, ListNode bigList) {
        ListNode tempHead = smallList;
        if (smallList == null) {
            return bigList;
        }
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = bigList;
        return smallList;
    }
}
