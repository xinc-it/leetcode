/**
 * @PackageName:PACKAGE_NAME @ClassName：Solution11 @Description:
 *
 * @author: xin
 * @date: 2021/7/23
 */
public class Solution11 {

  // 暴力破解
  public int maxArea(int[] height) {

    int maxArea = 0;

    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int largeHeight = height[i] > height[j] ? height[j] : height[i];
        int area = largeHeight * (j - i);
        System.out.println();
        if (area > maxArea) {
          System.out.println("高度" + largeHeight);
          System.out.println("i=" + i + "j=" + j);
          maxArea = area;
          System.out.println(area);
        }
      }
      //
    }
    return maxArea;
  }

  // 双指针
  public int maxArea2(int[] height) {

    int maxArea = 0;
    int i = 0;
    int j = height.length - 1;
    for (; i < j; ) {
      int area;
      if (height[i] <= height[j]) {
        area = height[i] * (j - i);
        i++;
      } else {
        area = height[j] * (j - i);
        j--;
      }
      if (maxArea < area) {
        maxArea = area;
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    //

        int[] array = {1,2,1};
//    int[] array = {1, 2, 4, 8, 7, 9, 1, 2};
    System.out.println(new Solution11().maxArea2(array));
  }
}
