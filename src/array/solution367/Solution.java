package array.solution367;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num / mid == mid) {
                if (num % mid == 0) return true;
                return false;
            } else if (num / mid > mid) {
                start = mid + 1;
            } else if (num / mid < mid) {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(223123));
    }
}
