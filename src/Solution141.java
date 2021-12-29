import struct.ListNode;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName：Solution141
 * @Description:
 * @author: xin
 * @date: 2021/7/27
 */

public class Solution141 {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fastNode=head.next;
        ListNode slowNode=head;
        int i=0;
        while(true){
            if(fastNode==null||fastNode.next==null||fastNode.next.next==null){
                return false;
            }
            if(fastNode==slowNode){
                return true;
            }
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
        }
    }


}
