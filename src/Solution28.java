/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution28 @Description:
 *
 * @author: xin
 * @date: 2021/7/23
 */
public class Solution28 {
  public int strStr(String haystack, String needle) {
    char[] array = haystack.toCharArray();
    char[] charArray = needle.toCharArray();
    int index = 0;
    if (charArray.length == 0) {
      return 0;
    } else {
      for (int j = 0; j < array.length; j++) {
        int m = j;
        // 当子字符串为空字符串时

        for (int i = 0; i < charArray.length && m < array.length; i++, m++) {
          // 如果不等直接退出循环
          if (charArray[i] != array[m]) {
            break;
          }
          // 如果子字符串最后一个字符也相等
          if (charArray[i] == array[m] && i == charArray.length - 1) {
            index = m - charArray.length + 1;
            return index;
          }
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {


    System.out.println(new Solution28().strStr("aa", "aba"));
    //
  }
}
