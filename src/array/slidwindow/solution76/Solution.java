package array.slidwindow.solution76;

import java.util.HashMap;
import java.util.Map;

/**
 * Date：2021/12/30
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> windows = new HashMap();
        Map<Character, Integer> needs = new HashMap();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            needs.put(key, needs.getOrDefault(key, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        while (right < s.length()) {
            char in = s.charAt(right);
            right++;
            if (needs.containsKey(in)) {
                windows.put(in, windows.getOrDefault(in, 0) + 1);
                if (windows.get(in).equals(needs.get(in))) {
                    valid++;
                }
            }
            while (valid == needs.size()) {
                if (right - left <= length) {
                    start = left;
                    length = right - left;
                }
                char out = s.charAt(left);
                left++;
                if (needs.containsKey(out)) {
                    if (windows.get(out).equals(needs.get(out))) {
                        valid--;
                    }
                        windows.put(out, windows.get(out) - 1);
                }
            }
        }
        return length == Integer.MAX_VALUE ? "" : s.substring(start, start + length);
    }


    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ADOBECODEBANC", "ABC"));
    }
}
