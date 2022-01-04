package array.binarysearch.solution875;

/**
 * Date：2022/1/2
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 10000 + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int f(int[] piles, int x) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % x != 0) {
                hours = hours + (piles[i] / x) + 1;
            } else {
                hours = hours + (piles[i] / x);
            }
        }
        return hours;
    }
}
