//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
// Related Topics 字符串
// 👍 1697 👎 0


public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        int maxLength = 0;
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char prefix = strs[0].charAt(i);
            flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    if (strs[j].charAt(i) != prefix) {
                        flag = false;
                    }
                } else {
                    flag = false;
                }

            }
            if (flag) {
                maxLength++;
            } else {
                return strs[0].substring(0, maxLength);
            }
        }

        return strs[0].substring(0, maxLength);
    }

    public static void main(String[] args) {
        String[] strs = {"aaa", "aa", "aaa"};
        System.out.println(new Solution14().longestCommonPrefix(strs));
    }
}
