package linkedlist;


import struct.ListNode;

/**
 * Date：2023/2/5
 * Description：相交链表
 * 快慢指针
 *
 * @author xinC
 * @version 1.0
 */
public class IntersectionNode {

    /**
     * 获取链表相交节点
     *
     * @param headA 链表A
     * @param headB 链表B
     * @return 返回链表相交节点，没有返回null
     */
    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //创建双指针
        ListNode tempNodeA = headA;
        ListNode tempNodeB = headB;
        //两链表相等时，要么同时遍历到两链表末尾的null,要么为相交节点
        while (tempNodeA != tempNodeB) {
            //一链表遍历完后，遍历另一链表
            if (tempNodeA.next != null) {
                tempNodeA = tempNodeA.next;
            } else {
                tempNodeA = headB;
            }
            if (tempNodeB != null) {
                tempNodeB = tempNodeB.next;
            } else {
                tempNodeB = headA;
            }

        }
        //返回相同时节点
        return tempNodeA;
    }


    //
    //public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //    ListNode mergeNode = mergeNode(headA, headB);
    //    ListNode sameNode = deceteNode(mergeNode);
    //    //合并链表解开
    //    tempNode.next = null;
    //    return sameNode;
    //}
    //
    ///**
    // * 检测链表是否有环
    // *
    // * @param head 链表头节点
    // * @return 返回环节点起始节点，没有环返回null
    // */
    //public ListNode deceteNode(ListNode head) {
    //    ListNode fastNode, slowNode;
    //    fastNode = slowNode = head;
    //    while (fastNode != null && fastNode.next != null) {
    //        fastNode = fastNode.next.next;
    //        slowNode = slowNode.next;
    //        //当前存在环，证明两链表相交
    //        if (fastNode == slowNode) {
    //            slowNode = head;
    //            while (slowNode != fastNode) {
    //                slowNode = slowNode.next;
    //                fastNode = fastNode.next;
    //            }
    //
    //            return slowNode;
    //        }
    //    }
    //    return null;
    //}
    //
    //ListNode tempNode;
    //
    ////链表合并，如果存在相同节点则形成环节点
    //public ListNode mergeNode(ListNode headA, ListNode headB) {
    //    tempNode = headA;
    //    while (tempNode.next != null) {
    //        tempNode = tempNode.next;
    //    }
    //    tempNode.next = headB;
    //    return headA;
    //}

}
