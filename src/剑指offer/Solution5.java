package 剑指offer;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:剑指offer @ClassName：Solution5 @Description:
 *
 * @author: xin
 * @date: 2021/8/9
 */
public class Solution5 {

  public static void main(String[] args) {
    //
    String s = "we are happy";
    char[] chars = s.toCharArray();
    StringBuffer buffer = null;
    for (int i = 0; i < chars.length; i++) {
      char aChar = chars[i];
      if (i == 0) {
        buffer = new StringBuffer(aChar);
      }
      if (aChar == ' ') {
        buffer.append("%20");
      } else {
        buffer.append(aChar);
      }
    }
    return buffer.toString();
  }
}
