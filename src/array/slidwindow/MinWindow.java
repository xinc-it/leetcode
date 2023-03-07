package array.slidwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Date：2023/3/2
 * Description：TODO
 *
 * @author neilCao
 * @version 1.0
 */
public class MinWindow {

    public static void main(String[] args) {
        String target = "A";
        String source = "B";
        System.out.println(new MinWindow().minWindow(source, target));
    }

    public String minWindow(String s, String t) {
        //定义需要字符种类和个数集合
        Map<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char tgKey = t.charAt(i);
            needs.put(tgKey, needs.getOrDefault(tgKey, 0) + 1);
        }
        //定义窗口所需种类和个数集合
        Map<Character, Integer> window = new HashMap<>();
        //定义和初始化左右指针
        int right, left;
        int start, valid, len;
        right = left = valid = start = 0;
        len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char inKey = s.charAt(right);
            right++;
            //    更新window窗口操作
            if (needs.containsKey(inKey)) {
                Integer defaultVal = window.getOrDefault(inKey, 0);
                window.put(inKey, defaultVal + 1);
                if (defaultVal + 1 == (needs.get(inKey))) {
                    valid++;
                }
            }
            System.out.println(window);
            //当window符合的种类个数等于需要的种类个数时搜小窗口
            while (valid == needs.size()) {
                if (len > right - left) {
                    len = right - left;
                    start = left;
                }
                char outKey = s.charAt(left);
                left++;
                //    更新窗口操作
                if (needs.containsKey(outKey)) {
                    if (needs.get(outKey).compareTo(window.get(outKey)) == 0) {
                        valid--;
                    }
                    window.put(outKey, window.get(outKey) - 1);
                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start, start + len);
    }
}
