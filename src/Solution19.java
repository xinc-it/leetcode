import struct.ListNode;

import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution19 @Description:
 *
 * @author: xin
 * @date: 2021/7/26
 */
public class Solution19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    return deleteNode(head, n);
  }

  int num = 0;
  boolean flag = false;

  public ListNode deleteNode(ListNode head, int n) {
    if (head.next == null) {
      num = 1;
      flag = true;
      if (num == n) {
        num++;
        return null;
      }
      num++;
      return head;
    }

    ListNode suffixNode = deleteNode(head.next, n);
    if (num == n && flag) {
      num++;
      return suffixNode;
    } else if (num != n && flag) {
      num++;
      head.next=suffixNode;
      return head;
    }
    return null;
  }

  public static void main(String[] args) {
    //

    int[] nums = {1,5};

    ListNode listNode = new ListNode().createListNode(nums);
    System.out.println(new Solution19().deleteNode(listNode, 2));
  }
}
