package sort;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Date：2023/1/14
 * Description：TODO
 * 选择排序
 *
 * @author xinC
 * @version 1.0
 */
public class SelectionSort {


    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[minIndex] >arr[j] ? j : minIndex;
            }
             swap(arr, minIndex, i);
        }
    }


    /**
     * 交换函数
     *
     * @param array 数组
     * @param min   较大数
     * @param max   较小数
     */
    public void swap(int[] array, int min, int max) {
        //通过异或运算的相同为一，不同为0，
        int change = array[min]^array[max];
        array[min] = change^array[min];
        array[max] = change^array[max];
    }

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10);
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
