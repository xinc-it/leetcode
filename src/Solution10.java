/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution10 @Description:
 *
 * @author: xin
 * @date: 2021/7/23
 */
public class Solution10 {
  public boolean isMatch(String s, String p) {
    char[] chars = s.toCharArray();
    char[] regArray = p.toCharArray();
    int j = 0;
    //    for (int i = 0; i < chars.length; i++) {
    //      if (chars[i] != regArray[j] || regArray[j] != '.') {
    //        j++;
    //        if (regArray[j] !='*'){
    //
    //        }
    //      }
    //    }
    return false;
  }

  public static void main(String[] args) {
    //
    new Solution10().isMatch("aab", "c*a*b");
  }
}
