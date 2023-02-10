package 剑指offer;

/**
 * Date：2023/1/9
 * Description：TODO
 *
 * @author xinC
 * @version 1.0
 */
public class Solution1 {


    public int divide(int a, int b) {
        int d = 0;
        if (a * b > 0) {
            while ((a - b) * b >= 0) {
                d++;
                if (d == 2147483647) {
                    return d;
                }
                a -= b;
            }
        } else {
            while ((a + b) * b <= 0) {
                if (d == -2147483648)
                    return d;
                d--;
                a += b;
            }
        }

        return d;
    }

    public static void main(String[] args) {
        int divide = new Solution1().divide(
                -2147483648, -1);
        System.out.println(divide);
    }
}
