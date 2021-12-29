import struct.ListNode;

import java.util.ArrayList;

/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution160 @Description:
 *
 * @author: xin
 * @date: 2021/7/27
 */
public class Solution160 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ArrayList nodeList = new ArrayList<ListNode>();
    ListNode tempHead = headA;
    while (tempHead.next != null) {
      nodeList.add(tempHead.val);
      tempHead = tempHead.next;
    }

    while (headB.next != null) {
      if (nodeList.contains(headB.val)) {
        return new ListNode(headB.val);
      }
    }
    return null;
  }

  public static void main(String[] args) {}
}
