package 剑指offer.structure.solution5;

/**
 * Date：2022/1/24
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {


    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }


    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpace("We are happy"));
    }
}
