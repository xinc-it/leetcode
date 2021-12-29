//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
//
//
// 示例 1:
//
//
//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//
// 示例 2:
//
//
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//
// 示例 3:
//
//
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//
// 示例 4:
//
//
//输入: s = ""
//输出: 0
//
//
//
//
// 提示：
//
//
// 0 <= s.length <= 5 * 104
// s 由英文字母、数字、符号和空格组成
//
// Related Topics 哈希表 字符串 滑动窗口
// 👍 5769 👎 0


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        List<Character> characterList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {

            if (!characterList.contains(s.charAt(i))) {
                characterList.add(s.charAt(i));

            } else {
                int i1 = characterList.indexOf(s.charAt(i));
                characterList.add(s.charAt(i));
                for (int j = 0; j <= i1; j++) {
                    characterList.remove(0);
                }
            }
            if (characterList.size() > maxLength) {
                maxLength = characterList.size();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
    }
}