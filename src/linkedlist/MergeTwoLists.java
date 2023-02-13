package linkedlist;

import struct.ListNode;

/**
 * Date：2023/2/13
 * Description：合并两个有序列表
 *
 * @author xinC
 * @version 1.0
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        // 创建双指针
        ListNode tempHead, tempNode;
        tempHead = new ListNode();
        tempNode = tempHead;
        //循环遍历两个链表
        while (list1 != null && list2 != null) {
            //ListNode temp;
            if (list1.val > list2.val) {
                //临时指针指向下个节点
                tempNode.next = list2;
                //链表指针移动到下一个节点
                list2 = list2.next;
            } else {
                tempNode.next = list1;
                list1 = list1.next;
            }
            tempNode = tempNode.next;
            tempNode.next = null;
        }
        if (list1 != null) {
            tempNode.next = list1;
        }
        if (list2 != null) {
            tempNode.next = list2;
        }
        return tempHead.next;
    }
}
