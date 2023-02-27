package array.doublepoint.fastslow;

import struct.ListNode;

/**
 * Date：2023/2/20
 * Description：删除有序链表中的重复元素 https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 * 难点：双指针移动条件，特殊情况
 * @author xinC
 * @version 1.0
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        //定义双指针
        ListNode slowNode, fastNode;
        // 初始化双指针
        slowNode = head;
        fastNode = head.next;
        while (fastNode != null) {
            //判断双指针移动条件，当两指针值不同时，移动slow指针
            if (slowNode.val != fastNode.val) {
                slowNode.next = fastNode;
                slowNode = slowNode.next;
            }
            //特殊情况最后两位值相等时，需要断开快指针，防止重复。
            if (fastNode.val==slowNode.val&&fastNode.next==null){
                slowNode.next=null;
            }
            fastNode = fastNode.next;
        }
        return head;
    }
}
