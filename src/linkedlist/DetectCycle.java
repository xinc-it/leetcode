package linkedlist;

import struct.ListNode;

/**
 * Date：2023/2/3
 * Description：https://leetcode.cn/problems/c32eOV/?show=1
 * 快慢指针
 * @author xinC
 * @version 1.0
 */
public class DetectCycle {


    ListNode fastNode, slowNode;

    /**
     * 检查链表是否有环
     * @param head 链表
     * @return 有环返回环节点，无环返回null;
     */
    public ListNode detectCycle(ListNode head) {
        //构建快慢双指针
        if (isCycle(head)) {
            slowNode = head;
            //System.out.println(slowNode.val + "=======" + fastNode.val);
            while (slowNode != fastNode) {
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            return slowNode;
        }
        return null;

    }

    /**
     * 判断链表中是否有环
     * @param head 链表
     * @return 是否有环
     */
    public boolean isCycle(ListNode head) {
        fastNode = slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }
}
