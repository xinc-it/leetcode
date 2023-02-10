package linkedlist;

import struct.ListNode;

import java.util.PriorityQueue;

/**
 * Date：2023/2/2
 * Description：https://leetcode.cn/problems/merge-k-sorted-lists/
 * 难点：双指针，优先队列
 * @author xinC
 * @version 1.0
 */
public class MergeKList {

    public ListNode mergeKLists(ListNode[] lists) {
        //双指针
        ListNode head = new ListNode();
        ListNode temp = head;
        //构造优先级队列（二叉堆）,对链表中的值进行排序
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(5, (a, b) -> ((Integer) a).compareTo((Integer) b));
        //将多个链表中的值存入队列中
        for (ListNode list : lists) {
            //
            while (list != null) {
                priorityQueue.add(list.val);
                list = list.next;
            }
        }
        //发生剧烈的附件
        //构造新的链表
        while (priorityQueue.size() > 0) {
            ListNode tempNode = new ListNode(priorityQueue.poll());
            temp.next = tempNode;
            temp = temp.next;
        }
        return head.next;

    }
}