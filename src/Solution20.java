//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
// 示例 4：
//
//
//输入：s = "([)]"
//输出：false
//
//
// 示例 5：
//
//
//输入：s = "{[]}"
//输出：true
//
//
//
// 提示：
//
//
// 1 <= s.length <= 104
// s 仅由括号 '()[]{}' 组成
//
// Related Topics 栈 字符串
// 👍 2511 👎 0


import java.util.*;

public class Solution20 {
    public boolean isValid(String s) {
        if (s.length() != 1) {
            List<Character> linkedList = new LinkedList<>();
            HashMap<String, String> kv = new HashMap<>();
            kv.put("}", "{");
            kv.put(")", "(");
            kv.put("]", "[");
            for (int i = 0; i < s.length(); i++) {

                if (linkedList.size() != 0) {
                    Character character = linkedList.get(linkedList.size() - 1);
                    if (kv.containsKey(String.valueOf(s.charAt(i))) && character == kv.get(String.valueOf(s.charAt(i))).charAt(0)) {
                        linkedList.remove(linkedList.size() - 1);
                    } else {
                        linkedList.add(s.charAt(i));
                    }
                } else {
                    linkedList.add(s.charAt(i));
                }
            }
            if (linkedList.size() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution20().isValid("(){}}{"));
    }
}
