package array.doublepoint.leftright;

/**
 * Date：2023/3/2
 * Description：leetcode5 最长回文子串 https://leetcode.cn/problems/longest-palindromic-substring/
 * 难点：左右双指针，双指针位置
 *
 * @author neilCao
 * @version 1.0
 */
public class LongestPalindrome {


    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String res = "";
        //1. 遍历字符串
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            char c = arr[i];
            //遍历每个位置的回文子串
            //当回文子串长度的为奇数时，左右指针重合
            String res1 = palindrome(arr, i, i);
            //当回文子串长度的为偶数时，左右指针不重合
            String res2 = palindrome(arr, i, i + 1);
            //比较子串长度，取最大值
            res1 = res1.length() > res.length() ? res1 : res;
            res2 = res2.length() > res.length() ? res2 : res;
            res = res1.length() > res2.length() ? res1 : res2;
        }
        return res;
    }

    public String palindrome(char[] arr, int left, int right) {
        //1. 确定遍历条件
        while (left >= 0 && right < arr.length) {
            //2. 确定指针移动条件
            if (arr[left] != arr[right]) {
                int length = (right - 1) - left;
                //System.out.println("起始索引：" + (left + 1) + "----最终索引" + (right - 1));
                return new String(arr, left + 1, length);
            }
            right++;
            left--;
        }
        //System.out.println("起始索引：" + (left + 1) + "----最终索引" + (right - 1));
        int length = (right - 1) - left;
        return new String(arr, left + 1, length);
    }
}
