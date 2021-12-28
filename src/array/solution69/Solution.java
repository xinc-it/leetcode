package array.solution69;

/**
 * Date：2021/12/28
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        long result;
        while (start <= end) {
            long mid = (start + end) / 2;
            result = mid * mid;
            if (result == x) {
                return (int) mid;
            } else if (result > x) {
                end = (int) mid - 1;
            } else if (result < x) {
                start = (int) mid + 1;
            }
        }
        result = start * start;
        if (result < 0 || result > x) {
            return end;
        }
        return start;
    }


    public int mySqrt2(int x) {
        int start = 0;
        int end = x;
        long result;
        while (start <= end) {
            int  mid = (start + end) / 2;
            if (mid==x/mid) {
                return mid;
            } else if (mid>x/mid) {
                end =  mid - 1;
            } else if (mid<x/mid) {
                start =  mid + 1;
            }
        }
        result = start * start;
        if (result < 0 || result > x) {
            return end;
        }
        return start;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt2(2147483647));
    }
}