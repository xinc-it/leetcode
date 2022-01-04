package array.modifyarray.solution316;

import java.util.LinkedList;

/**
 * Date：2022/1/4
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public String removeDuplicateLetters(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        boolean[] inStack = new boolean[256];
        int[] charNums = new int[256];
        //1. 计算每个字符在出现的个数
        for (char c : s.toCharArray()) {
            charNums[c]++;
        }
        //2. 存入字符串
        for (char c : s.toCharArray()) {
            charNums[c]--;
            if (inStack[c]) continue;
            while (!stack.isEmpty()&&stack.peek()>c){
                if (charNums[stack.peek()]==0){
                    break;
                }
                inStack[stack.pop()]=false;
            }
            stack.push(c);
            inStack[c] = true;
        }

        StringBuilder builder = new StringBuilder("");
        while (!stack.isEmpty()) {
            Character poll = stack.poll();
            builder.append(poll);
        }
        return builder.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicateLetters("ecbacba"));
    }
}
