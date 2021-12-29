//给你一个字符串 s，找到 s 中最长的回文子串。
//
//
//
// 示例 1：
//
//
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
//
//
// 示例 2：
//
//
//输入：s = "cbbd"
//输出："bb"
//
//
// 示例 3：
//
//
//输入：s = "a"
//输出："a"
//
//
// 示例 4：
//
//
//输入：s = "ac"
//输出："a"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 仅由数字和英文字母（大写和/或小写）组成
//
// Related Topics 字符串 动态规划
// 👍 3840 👎 0


public class Solution5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 1;
        int maxIndex = 0;
        int startIndex;
        if (s.length() != 1) {
            for (int i = 0; i < chars.length - 1; i++) {
                int length;
                int oddCenter = expand(chars, i, i);
                int noCenter = expand(chars, i, i + 1);
                length = oddCenter > noCenter ? oddCenter : noCenter;

                if (maxLength < length) {
                    maxLength = length;
                    maxIndex = i;
                }
            }
            //没有中心字符
            if (maxLength % 2 == 0) {
                startIndex = maxIndex - maxLength / 2 + 1;
            } else {
                startIndex = maxIndex - maxLength / 2;
            }
            String maxString = String.copyValueOf(chars, startIndex, maxLength);
            return maxString;
        }
        return s;
    }

    public int expand(char[] chars, int left, int right) {
        int len = chars.length;
        int maxLen = 0;
        for (; right <= len - 1 && left >= 0; ) {

            if (chars[left] == chars[right] && left != right) {
                maxLen += 2;
            } else if (chars[left] == chars[right] && left == right) {
                maxLen += 1;
            } else if (chars[right] != chars[left]) {
                return maxLen;
            }
            right++;
            left--;
        }
        return maxLen;
    }


    public static void main(String[] args) {
        System.out.println(new Solution5().longestPalindrome("bb"));
    }
}
