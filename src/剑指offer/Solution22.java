package 剑指offer;

import struct.ListNode;

/**
 * @PackageName:剑指offer
 * @ClassName：Solutions22
 * @Description:
 * @author: xin
 * @date: 2021/7/27
 */

public class Solution22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        return  lastNode(head,k);
    }
    int num;
    public ListNode lastNode(ListNode head,int k){
        if(head.next==null){
            num=1;
            if(num==k){
                num++;
                return head;
            }
            num++;
            return head;
        }

        ListNode lastNode= lastNode(head.next,k);
        if(num<=k){
            num++;
            return head;
        }
        if(num>k){
            return lastNode;
        }
        return null;
    }

  public static void main(String[] args) {
    //
      int[] nums={1,2,3,4,5,6};
      ListNode listNode = new ListNode().createListNode(nums);
    System.out.println(new Solution22().getKthFromEnd(listNode, 2));
  }
}
