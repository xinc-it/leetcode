package array.slidwindow.sloution438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Date：2022/1/1
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> windows = new HashMap();
        Map<Character, Integer> needs = new HashMap();
        List<Integer> startIndex = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;
        int length = Integer.MAX_VALUE;
        while (right < s.length()) {
            char in = s.charAt(right++);
            if (needs.containsKey(in)) {
                windows.put(in, windows.getOrDefault(in, 0) + 1);
                if (windows.get(in).equals(needs.get(in))) {
                    valid++;
                }
            }

            while (valid == needs.size()) {
                if (left - right <= length) {
                    length = right - left;
                }
                if (length == p.length()) {
                    startIndex.add(left);
                }
                char out = s.charAt(left++);
                if (windows.containsKey(out)) {
                    if (windows.get(out).equals(needs.get(out))) {
                        valid--;
                    }
                    windows.put(out, windows.get(out) - 1);
                }
            }
        }
        return startIndex;

    }


    public static void main(String[] args) {
        System.out.println(new Solution().findAnagrams("cabdcdab", "a"));
    }
}
