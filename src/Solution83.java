import struct.ListNode;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName：Solution83
 * @Description:
 * @author: xin
 * @date: 2021/7/27
 */

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fastNode=head;
        ListNode slowNode=head;
        if(head==null||head.next==null){
            return head;
        }
        fastNode=fastNode.next;
        while(true){
            if(fastNode==null){
                return head;
            }

            if(fastNode.val==slowNode.val){
                slowNode.next=fastNode.next;
            }else{
                slowNode=slowNode.next;
            }
            fastNode=fastNode.next;
        }
    }

  public static void main(String[] args) {
    //
      int[] nums={1,1,2,2,3,3};
      ListNode listNode = new ListNode().createListNode(nums);
    System.out.println(new Solution83().deleteDuplicates(listNode));
  }
}
