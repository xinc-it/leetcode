import struct.ListNode;

/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution92 @Description:
 *
 * @author: xin
 * @date: 2021/7/25
 */
public class Solution92 {

  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) {
      return head;
    } else {

      ListNode nowNode = head;
      ListNode upNode = null;
      ListNode nextNode = null;
      ListNode preNode = null;
      ListNode lastNode = null;
      int i = 1;
      while (true) {
        if (left != 1) {
          if (i == left - 1) {
            preNode = nowNode;
          }
        }
        if (i <= right && i >= left) {
          ListNode copyNode = new ListNode(nowNode.val);
          copyNode.next = nowNode.next;
          nextNode = copyNode.next;
          nowNode.next = upNode;
          upNode = nowNode;
        } else {
          nextNode = nowNode.next;
        }
        if (i == left) {
          lastNode = nowNode;
        }
        if (i == right) {
          ListNode suffixNode = nextNode;
          lastNode.next = suffixNode;
          if (preNode != null) {
            preNode.next = nowNode;
            return head;
          } else {
            return nowNode;
          }
        }
        i++;
        nowNode = nextNode;
      }
    }
  }

  // 迭代实现方式
  public ListNode reverseBetween1(ListNode head, int left, int right) {
    if (left == 1) {
      head = reverseListNode(head, right);
      return head;
    }
    head.next = reverseBetween(head.next, left - 1, right - 1);
    return head;
  }

  private ListNode suffixNode;

  public ListNode reverseListNode(ListNode head, int right) {
    if (right == 1) {
      head.next = suffixNode;
      return head;
    }
    ListNode last = reverseListNode(head, right);
    head.next.next = head;

    head.next = suffixNode;
    return last;
  }



  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    ListNode listNode = new ListNode().createListNode(nums);
    System.out.println(new Solution92().reverseBetween(listNode, 4, 5));
  }
}
