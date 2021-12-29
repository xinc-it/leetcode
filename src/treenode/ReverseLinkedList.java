package treenode;

import java.util.List;
import java.util.Stack;

/**
 * @author: xin
 * @date: 2021/1/18
 */

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = null;
        ListNode temp;
        ListNode prevTemp = null;
        for (int i = 0; i < 6; i++) {
            temp = new ListNode(i);
            if (i == 0) {
                head = temp;
                temp.next = null;
                prevTemp = temp;
                temp = temp.next;

            } else {
                temp = new ListNode(i);
                prevTemp.next = temp;
                prevTemp = temp;
                temp.next = null;
                temp = temp.next;
            }
        }
        ListNode listNode = reverseLinkedList.reverseList1(head);
        reverseLinkedList.iteratroList(listNode);
//        do {
//            System.out.println("当前节点的值:" + listNode.val);
//            listNode = listNode.next;
//        } while (listNode != null);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode temp = head;
            Stack<Integer> stack = new Stack<Integer>();
            do {
                stack.push(temp.val);
                temp = temp.next;
            } while (temp != null);
            ListNode reverseList = null;
            ListNode prerTmep = null;
            temp = reverseList;
            for (int i = stack.size() - 1; i >= 0; i--) {
                temp = new ListNode(stack.get(i));
                if (reverseList == null) {
                    reverseList = temp;
                    prerTmep = temp;
//                    temp.next = null;
//                    temp = temp.next;
                } else {
                    prerTmep.next = temp;
                    prerTmep = temp;
                }
                temp.next = null;
                temp = temp.next;
            }
//            iteratroList(reverseList);
            return reverseList;
        }
    }


    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head.next.next!= null) {
            ListNode temp = reverseList1(head.next);
            head.next.next = head;
            return temp;
        } else {
            ListNode temp =head.next;
            head.next.next = head;
            return temp;
        }
    }


    public ListNode reverseList2(ListNode head) {
        ListNode cur = null;
        ListNode prev = head;
        while (prev != null) {
            ListNode temp = prev.next;
            prev.next = cur;
            cur = prev;
            prev = temp;
        }
        iteratroList(cur);
        return cur;
    }

    /**
     * (
     * 遍历链表
     *
     * @param head
     */
    public void iteratroList(ListNode head) {
        if (head == null) {
            System.out.println("当前链表为空");
        } else {
            int i = 1;
            do {
                System.out.println(i + "节点的值:" + head.val);
                head = head.next;
            } while (head != null);
        }
    }
}
