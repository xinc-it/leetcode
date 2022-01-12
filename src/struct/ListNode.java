package struct;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName：ListNode
 * @Description:
 * @author: xin
 * @date: 2021/7/25
 */

public class ListNode {
   public int val;
   public ListNode next;

    public ListNode() {}

    public  ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode createListNode(int[] nums) {
        ListNode upNode = null;
        ListNode temp;
        ListNode header = null;

        for (int i = 0; i < nums.length; i++) {
            ListNode nowNode = new ListNode(nums[i]);
            if (i == 0) {
                header = nowNode;
            }
            nowNode.next = null;
            if (upNode != null) {
                temp = upNode;
                temp.next = nowNode;
                upNode = nowNode;
            } else {
                upNode = nowNode;
            }
        }
        return header;
    }

    @Override
    public String toString() {
        return "struct.ListNode{" + "val=" + val + ", next=" + next + '}';
    }
}
