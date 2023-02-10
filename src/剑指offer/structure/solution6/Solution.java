package 剑指offer.structure.solution6;

import struct.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Date：2022/1/24
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int[] reversePrint(ListNode head) {
        List<Integer> nums = new LinkedList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        return  null;
    }
}
