package 剑指offer;

import struct.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @PackageName:剑指offer @ClassName：Solution6 @Description:
 *
 * @author: xin
 * @date: 2021/8/8
 */
public class Solution6 {


  int size=0;
  int index;
  public int[] reversePrint(ListNode head) {
    if (head == null) {
      return new int[size];
    } else {
//      array = new ArrayList();
      int[] array;
      array = printReverseNode(head);
//      Object[] integers = array.toArray();
//      Integer[] integers1 = (Integer[]) integers;
//      int[] arr = new int[integers.length];
//      for (int i = 0; i < integers.length; i++) {
//        arr[i] = ((Integer) integers[i]);
//      }
      return array;
    }
  }

  public int[] printReverseNode(ListNode head) {
    int[] array;
    if (head.next == null) {
      size++;
      index=0;
      array = new int[size];
      array[index++]=head.val;
    } else {
      size++;
      array = printReverseNode(head.next);
      array[index++]=head.val;
    }
    return array;
  }

  public static void main(String[] args) {

    int[] array = {};
    ListNode listNode = new ListNode().createListNode(array);
    int[] ints = new Solution6().reversePrint(listNode);
    System.out.println(Arrays.toString(ints));
    //
  }
}
